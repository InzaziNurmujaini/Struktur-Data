import pandas as pd
import statsmodels.api as sm
from statsmodels.stats.diagnostic import het_breuschpagan

file_path = r'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'
df = pd.read_excel(file_path)

alpha = 0.05

for column in df.columns[1:]:
    # Variabel dependen (Y) dan variabel independen (X)
    Y = df['Power']
    X = df[column]

    # Menambahkan konstanta ke variabel independen
    X = sm.add_constant(X)

    # Membuat model regresi
    model = sm.OLS(Y, X).fit()

    # Mengekstrak residual
    residuals = model.resid

    # Melakukan uji Breusch-Pagan
    test_result = het_breuschpagan(residuals, X)

    # Menampilkan hasil
    print(f"\nVariabel: '{column}'")
    print("  P-value:", test_result[1])

    # Menentukan apakah terjadi heteroskedastisitas atau tidak
    if test_result[1] < alpha:
        print("  Model regresi mengalami heteroskedastisitas.")
    else:
        print("  Model regresi tidak mengalami heteroskedastisitas.")