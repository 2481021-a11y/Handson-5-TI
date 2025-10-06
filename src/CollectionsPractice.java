import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrayList = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Panjang array: " + array.length);
        System.out.println("Ukuran ArrayList: " + arrayList.size());

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123);
        rawList.add(45.6);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Satu");
        listString.add("Dua");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(2.71);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        System.out.println("Raw List: " + rawList);
        System.out.println("List String: " + listString);
        System.out.println("List Double: " + listDouble);

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Andi");
        daftarMahasiswa.add("Budi");
        daftarMahasiswa.add("Cici");
        daftarMahasiswa.add("Dodi");
        daftarMahasiswa.add("Eka");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "Fajar");

        // - Print daftar mahasiswa
        System.out.println("Daftar Mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size() - 1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Apakah ada 'Budi'? " + daftarMahasiswa.contains("Budi"));

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index 'Citra': " + daftarMahasiswa.indexOf("Citra"));

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Jumlah mahasiswa: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Bagus");

        // - Print daftar setelah update
        System.out.println("Setelah update: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(3);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Eka");
        System.out.println("Setelah delete: " + daftarMahasiswa);

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Apakah kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        Collections.addAll(angka, 10, 20, 30, 40, 50);

        // - Iterasi menggunakan traditional for loop
        System.out.println("For loop:");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
        System.out.println();

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.println("For-each loop:");
        for (int n : angka) {
            System.out.print(n + " ");
        }
        System.out.println();

        // - Iterasi menggunakan while loop
        System.out.println("While loop:");
        int idx = 0;
        while (idx < angka.size()) {
            System.out.print(angka.get(idx) + " ");
            idx++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        System.out.println("Iterator:");
        Iterator<Integer> it = angka.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        dataMahasiswa.add(new String[]{"Andi", "123", "TI"});
        dataMahasiswa.add(new String[]{"Budi", "124", "SI"});
        dataMahasiswa.add(new String[]{"Citra", "125", "MI"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("Nama\tNIM\tJurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.println(mhs[0] + "\t" + mhs[1] + "\t" + mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        Collections.addAll(numbers, 64, 34, 25, 12, 22, 11, 90);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        System.out.println("Frequency of 22: " + Collections.frequency(numbers, 22));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        Collections.addAll(buah, "Apel", "Jeruk", "Mangga", "Pisang", "Anggur");

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("Sorted Buah: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        int index = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search 'Mangga': index = " + index);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        int linearIdx = linearSearch(buah, "Pisang");
        System.out.println("Linear search 'Pisang': index = " + linearIdx);

        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            // - Isi dengan nilai dan print dalam format matriks
            // TODO: Fill dan print matrix
            for (int j = 0; j < i + 2; j++) {
                row.add(i + j);
            }
            matrix2D.add(row);
        }
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"Java Dasar", "Ani", "2020", "tersedia"});
        daftarBuku.add(new String[]{"Pemrograman Web", "Budi", "2021", "tersedia"});
        daftarBuku.add(new String[]{"Database", "Citra", "2019", "tersedia"});
        daftarBuku.add(new String[]{"AI", "Dewi", "2022", "tersedia"});
        daftarBuku.add(new String[]{"Jaringan", "Eko", "2018", "tersedia"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        pinjamBuku(daftarBuku, "Java Dasar");

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        kembalikanBuku(daftarBuku, "AI");

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        System.out.println("Daftar Buku:");

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        for (String[] b : daftarBuku) {
            System.out.println(b[0] + " - " + b[1] + " - " + b[2] + " - " + b[3]);
        }

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        System.out.println("\n=== SISTEM NILAI MAHASISWA DINAMIS ===");
        ArrayList<String[]> nilaiMahasiswa = new ArrayList<>();
        nilaiMahasiswa.add(new String[]{"Andi", "Algoritma", "85"});
        nilaiMahasiswa.add(new String[]{"Budi", "Struktur Data", "90"});
        nilaiMahasiswa.add(new String[]{"Citra", "Basis Data", "88"});
        nilaiMahasiswa.add(new String[]{"Dewi", "Jaringan", "70"});
        nilaiMahasiswa.add(new String[]{"Eko", "Pemrograman Java", "95"});
        System.out.println("Nama\tMata Kuliah\t\tNilai");
        for (String[] m : nilaiMahasiswa) {
            System.out.println(m[0] + "\t" + m[1] + "\t" + m[2]);
        }

        ArrayList<Integer> nilaiSaja = new ArrayList<>();
        for (String[] m : nilaiMahasiswa) {
            nilaiSaja.add(Integer.parseInt(m[2]));
        }
        System.out.println("Rata-rata nilai mahasiswa: " + hitungRataRata(nilaiSaja));

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        int n = 1_000_00;
        int[] arrayTest = new int[n];
        ArrayList<Integer> arrayListTest = new ArrayList<>();

        // Waktu Insert ke Array
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayTest[i] = i;
        }
        long end = System.nanoTime();
        System.out.println("Waktu insert Array: " + (end - start) / 1_000_000.0 + " ms");

        // Waktu Insert ke ArrayList
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayListTest.add(i);
        }
        end = System.nanoTime();
        System.out.println("Waktu insert ArrayList: " + (end - start) / 1_000_000.0 + " ms");

        // Waktu Akses elemen di tengah
        start = System.nanoTime();
        int x1 = arrayTest[n / 2];
        end = System.nanoTime();
        System.out.println("Waktu akses Array: " + (end - start) + " ns");

        start = System.nanoTime();
        int x2 = arrayListTest.get(n / 2);
        end = System.nanoTime();
        System.out.println("Waktu akses ArrayList: " + (end - start) + " ns");

        // Waktu Pencarian Linear
        start = System.nanoTime();
        for (int i = 0; i < arrayTest.length; i++) {
            if (arrayTest[i] == n - 1) break;
        }
        end = System.nanoTime();
        System.out.println("Waktu search Array: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        arrayListTest.contains(n - 1);
        end = System.nanoTime();
        System.out.println("Waktu search ArrayList: " + (end - start) / 1_000_000.0 + " ms");

    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        // TODO: Print ArrayList dengan title
        System.out.println(title + ": " + list);
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        // TODO: Implementasi linear search
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        // TODO: Print 2D ArrayList matrix
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi pinjam buku
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("tersedia")) {
                b[3] = "dipinjam";
                return true;
            }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi kembalikan buku
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("dipinjam")) {
                b[3] = "tersedia";
                return true;
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi cari buku
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul)) {
                return b;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        // TODO: Hitung rata-rata
        if (values.isEmpty()) return 0.0;
        double sum = 0;
        for (int v : values) sum += v;
        return sum / values.size();
    }
}