import numpy as np
import pandas as pd
from scipy.stats import kstest, norm
import matplotlib.pyplot as plt

# Fungsi untuk menguji normalitas menggunakan Kolmogorov-Smirnov test
def normality_test(data):
    stat, p_value = kstest(data, 'norm')
    return stat, p_value

# Masukkan path ke file CSV
file_path = 'C:\Kuliah\Semester 3\statistika\journal ranking.csv'

# Membaca data dari file CSV
try:
    df = pd.read_csv(r'C:\Kuliah\Semester 3\statistika\journal ranking.csv', encoding = 'ISO-8859-1')
except FileNotFoundError:
    print("File not found. Please make sure the path is correct.")
    exit()
except pd.errors.EmptyDataError:
    print("File is empty. Please provide a non-empty CSV file.")
    exit()

# Mengambil kolom yang berisi data regresi
column_name = 'Best Subject Rank'
data = df[column_name].dropna().tolist()

# Melakukan uji normalitas
statistic, p_value = normality_test(data)

# Menampilkan hasil uji normalitas
print("\nHasil Uji Normalitas:")
print("Statistik Kolmogorov-Smirnov:", statistic)
print("P-value:", p_value)

# Membuat histogram untuk memeriksa distribusi data
plt.figure(figsize=(8, 6))
plt.hist(data, bins='auto', density=True, color='purple', alpha=0.05, rwidth=0.85, edgecolor='black')

# Menambahkan kurva distribusi normal sebagai pembanding
xmin, xmax = plt.xlim()
x = np.linspace(xmin, xmax, 100)
p = norm.pdf(x, np.mean(data), np.std(data))
plt.plot(x, p, 'k', linewidth=2)

plt.title('Histogram dan Kurva Distribusi Normal variabel Best Subject Rank')
plt.xlabel('Nilai Data')
plt.ylabel('Frekuensi Normalisasi')
plt.show()
