import pandas as pd

# Load the Excel file into a pandas DataFrame
file_path = r'C:\Kuliah\Semester 3\PL\src\statistik.py\Data UAS Statistik.xlsx'
df = pd.read_excel(file_path, sheet_name='Form Responses 1')

# Display basic descriptive statistics
descriptive_stats = df.describe()
print(descriptive_stats)