import matplotlib.pyplot as plt

# Data umur Pagi, Sore, dan Malam
umur_pagi = [13, 19, 28, 21, 25, 38, 29]
umur_sore = [13, 6, 41, 61, 42, 14, 20]
umur_malam = [6, 27, 54, 97, 95, 57, 14]

# Data kelompok umur
hari = ["Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"]

# Membuat scatter plot untuk umur Pagi
plt.scatter(range(len(umur_pagi)), umur_pagi, label='Pagi', color='indigo', marker='o')

# Membuat scatter plot untuk umur Sore
plt.scatter(range(len(umur_sore)), umur_sore, label='Sore', color='slateblue', marker='x')

# Membuat scatter plot untuk umur Malam
plt.scatter(range(len(umur_malam)), umur_malam, label='Malam', color='lavender', marker='s')

# Menambahkan garis yang menghubungkan titik-titik pada scatter plot
plt.plot(range(len(umur_pagi)), umur_pagi, linestyle='-', color='indigo')
plt.plot(range(len(umur_sore)), umur_sore, linestyle='-', color='slateblue')
plt.plot(range(len(umur_malam)), umur_malam, linestyle='-', color='plum')

# Menambahkan label sumbu x dan y
plt.xlabel('Hari')
plt.ylabel('Kendaraan')

# Menambahkan judul
plt.title('Scatter Plot Kendaraan Lainnya')

# Menambahkan legenda
plt.legend()

# Mengatur sumbu x
plt.xticks(range(len(hari)), hari)

# Menampilkan plot
plt.grid(True)
plt.show()