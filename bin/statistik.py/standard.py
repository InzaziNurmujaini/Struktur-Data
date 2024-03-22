import pandas as pd
from sklearn.preprocessing import StandardScaler

def z_score_standardization_excel(input_file, output_file):
    # Membaca data dari file Excel
    data = pd.read_excel(input_file)
    
    # Memilih kolom yang akan di-standarisasi baku (z-score)
    selected_columns = data.columns
    
    # Menginisialisasi objek StandardScaler
    scaler = StandardScaler()
    
    # Melakukan standarisasi baku pada data terpilih
    data_standardized = scaler.fit_transform(data[selected_columns])
    
    # Membuat DataFrame baru dengan data yang sudah di-standarisasi
    data_standardized_df = pd.DataFrame(data_standardized, columns=selected_columns)
    
    # Menyimpan data yang sudah di-standarisasi ke file Excel
    data_standardized_df.to_excel(output_file, index=False)
    
    print(f"Standarisasi baku selesai. Hasil disimpan di {output_file}.")

# Mengganti 'input_file.xlsx' dan 'output_file.xlsx' sesuai dengan nama file yang Anda miliki
input_file_name = 'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'
output_file_name = 'C:\Kuliah\Semester 3\PL\src\statistik.py\standrart.xlsx'

z_score_standardization_excel(input_file_name, output_file_name)