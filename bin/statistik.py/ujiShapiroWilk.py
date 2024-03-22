import pandas as pd
from scipy.stats import shapiro

# Memuat data dari file Excel (ganti 'your_data.xlsx' dengan nama file sesuai)
file_path = r'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'
df = pd.read_excel(file_path)

# Menetapkan tingkat signifikansi
alpha = 0.05

# Melakukan iterasi melalui setiap kolom (variabel) dalam DataFrame
for column in df.columns:
    # Mengekstrak variabel menjadi larik NumPy
    sample_data = df[column].to_numpy()

    # Melakukan uji Shapiro-Wilk
    statistic, p_value = shapiro(sample_data)

    # Menampilkan hasil
    print(f"Variabel: '{column}'")
    print("  Statistik Shapiro-Wilk:", statistic)
    print("  P-value:", p_value)

    # Menafsirkan hasil
    if p_value < alpha:
        print("  Distribusi tidak dianggap normal.")
    else:
        print("  Distribusi dianggap normal.")

    print("\n" + "="*50 + "\n")  # Hanya untuk memisahkan hasil dari variabel yang berbeda