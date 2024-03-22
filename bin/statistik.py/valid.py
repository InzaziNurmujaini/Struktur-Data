import pandas as pd
import numpy as np
from scipy.stats import pearsonr

def construct_validity(data, variable1_list, variable2, threshold=0.5):
    # Memeriksa apakah variabel ada dalam DataFrame
    if not all(variable in data.columns for variable in variable1_list) or variable2 not in data.columns:
        raise ValueError("Nama variabel tidak ditemukan dalam DataFrame.")

    # Mengambil data untuk variabel-variabel
    data_subset = data[variable1_list + [variable2]].dropna()

    # Menghitung korelasi Pearson dan status validitas
    correlation_results = pd.DataFrame(index=variable1_list, columns=['Pearson_Correlation', 'Validity_Status'])

    for variable1 in variable1_list:
        correlation_coefficient, _ = pearsonr(data_subset[variable1], data_subset[variable2])
        correlation_results.loc[variable1, 'Pearson_Correlation'] = correlation_coefficient

        # Menetapkan status validitas
        validity_status = "Valid" if correlation_coefficient > threshold else "Not Valid"
        correlation_results.loc[variable1, 'Validity_Status'] = validity_status

    return correlation_results

# Contoh penggunaan
# Mengganti 'nama_file.xlsx' dengan nama file Excel yang sesuai dengan data Anda
file_path = 'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'
data = pd.read_excel(file_path)

# Mengganti 'Variable1_list' dan 'Variable2' dengan nama variabel yang ingin Anda hitung validitasnya
variable1_list = ['Interaction', 'Residences', 'Knowledge', 'Rainfall', 'Humidity (%)', 'Temperature']  # Daftar variabel
variable2 = 'TOTAL'

# Mengganti threshold sesuai kebutuhan Anda
threshold_value = 0.05

validity_results = construct_validity(data, variable1_list, variable2, threshold=threshold_value)
print("Validitas Konstruk antara Variable2 dan setiap variabel pada Variable1_list:")
print(validity_results)