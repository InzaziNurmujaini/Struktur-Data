import pandas as pd
import numpy as np

def hitung_cronbach_alpha(df):
    df_corr = df.corr()
    N = df.shape[1]
    alpha_values = {}

    for col in df.columns:
        rs = np.array([])
        for i, col2 in enumerate(df_corr.columns):
            if col2 == col:
                sum_ = df_corr[col][i+1:].values
                rs = np.append(sum_, rs)

        mean_r = np.mean(rs)
        cronbach_alpha = (N * mean_r) / (1 + (N - 1) * mean_r)
        alpha_values[col] = cronbach_alpha

    # Menggabungkan semua elemen matriks korelasi
    all_elements = np.concatenate(list(df_corr.values))

    # Menghitung Cronbach's Alpha untuk semua elemen
    mean_r_all = np.mean(all_elements)
    cronbach_alpha_all = (N * mean_r_all) / (1 + (N - 1) * mean_r_all)
    alpha_values["Semua Kolom"] = cronbach_alpha_all

    return alpha_values

def evaluasi_reliabilitas(alpha_values):
    print("\nEvaluasi Reliabilitas (Cronbach's Alpha):")
    for col, alpha in alpha_values.items():
        if col != "Semua Kolom":
            if alpha < 0.6:
                kategori = "Reliabilitas Rendah"
            elif 0.6 <= alpha < 0.7:
                kategori = "Reliabilitas Cukup"
            elif 0.7 <= alpha < 0.8:
                kategori = "Reliabilitas Baik"
            elif 0.8 <= alpha < 0.9:
                kategori = "Reliabilitas Sangat Baik"
            else:
                kategori = "Reliabilitas Sangat Tinggi"

            print(f"{col}: {alpha:.4f} ({kategori})")

def cek_validitas_reliabilitas(path_file):
    try:
        # Membaca data dari file Excel
        data = pd.read_excel(path_file)

        # Cetak data
        print("\nData:\n", data)

        # Memeriksa validitas per variabel
        for kolom in data.columns:
            if data[kolom].isnull().any():
                print(f"Variabel '{kolom}' tidak valid: Terdapat nilai yang hilang.")
            else:
                print(f"Variabel '{kolom}' valid.")

        # Memeriksa korelasi dan Cronbach's Alpha
        df = data.iloc[:, 1:]  # Mengambil semua kolom kecuali kolom pertama (asumsi kolom pertama adalah indeks/baris)
        cronbach_results = hitung_cronbach_alpha(df)

        print("\nMatriks Korelasi:\n", df.corr())
        print("\nCronbach's Alpha per Kolom:\n")
        for col, alpha in cronbach_results.items():
            print(f"{col}: {alpha}")

        # Evaluasi reliabilitas berdasarkan Cronbach's Alpha
        evaluasi_reliabilitas(cronbach_results)

    except Exception as e:
        print(f"Terjadi kesalahan: {e}")

# Mendefinisikan lokasi file Excel
fileLocation = r'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'

# Memanggil fungsi untuk memeriksa validitas variabel, menghitung korelasi, dan menghitung Cronbach's Alpha
cek_validitas_reliabilitas(fileLocation)