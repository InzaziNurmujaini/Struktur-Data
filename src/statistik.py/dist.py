import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

def plot_distribusi_variabel(path_excel):
    try:
        # Membaca dataset dari file Excel
        data = pd.read_excel(path_excel)

        # Mendapatkan daftar variabel dalam dataset
        variables = data.columns

        # Mengatur ukuran plot
        plt.figure(figsize=(12, 8))

        # Loop untuk membuat plot untuk setiap variabel
        for variable in variables:
            # Membuat histogram untuk variabel
            sns.histplot(data[variable], kde=True, bins=15,
                         color='green', stat='density')

            # Menambahkan judul dan label sumbu
            plt.title(f'Distribusi {variable}')
            plt.xlabel(variable)
            plt.ylabel('Density')

            # Menampilkan plot
            plt.show()

    except Exception as e:
        print(f"Terjadi kesalahan: {e}")

# Meminta pengguna untuk memasukkan path (jalur) ke file Excel
path_excel = input("Masukkan path (jalur) ke file Excel: ")

# Memanggil fungsi untuk membuat plot distribusi variabel
plot_distribusi_variabel(path_excel)