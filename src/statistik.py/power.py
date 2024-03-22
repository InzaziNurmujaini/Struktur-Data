import pandas as pd
import statsmodels.api as sm

# Membaca data excel
df = pd.read_excel(
    r'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx')

df = sm.add_constant(df)

# Variabel dependen (Y) dan variabel independen (X)
X = df[['const', 'Interaction', 'Residences', 'Knowledge',
        'Rainfall', 'Humidity (%)', 'Temperature']]
y = df['Power']
model = sm.OLS(y, X)

# Fit model
hasil_model = model.fit()

# hasil ringkasan model
print(hasil_model.summary())