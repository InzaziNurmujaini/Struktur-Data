import pandas as pd
import statsmodels.api as sm
from statsmodels.stats.diagnostic import het_breuschpagan

# Memuat data dari file Excel (ganti 'your_data.xlsx' dengan nama file sesuai)
file_path = (r'C:\Kuliah\Semester 3\PL\src\statistik.py\UASS.xlsx')
df = pd.read_excel(file_path)

# Menetapkan tingkat signifikansi
alpha = 0.05

# Melakukan iterasi melalui setiap kolom (variabel independen) dalam DataFrame
for column in df.columns[1:]:  # Mulai dari kolom kedua, karena pertama adalah variabel dependen
    # Variabel dependen (Y) dan variabel independen (X)

    Y = df[['SJR-index', 'CiteScore', 'H-index', 'Total Docs.', 'Total Docs. 3y',
        'Total Refs.', 'Total Cites 3y', 'Citable Docs. 3y', 'Cites/Doc. 2y', 'Refs./Doc.']]
    X = df['Rank']

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