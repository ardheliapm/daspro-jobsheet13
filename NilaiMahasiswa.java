import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        int[][] nilaiMhs = {
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
        };
        String[] namaMhs = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        inputNilaiMahasiswa(nilaiMhs, namaMhs);
        tampilkanSeluruhNilai(nilaiMhs, namaMhs);
        cariHariNilaiTertinggi(nilaiMhs, namaMhs);
        tampilkanMahasiswaNilaiTertinggi(nilaiMhs, namaMhs);
    }

    static void inputNilaiMahasiswa(int[][] nilaiMhs, String[] namaMhs) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai tugas untuk mahasiswa " + namaMhs[i] + ":");
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMhs[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanSeluruhNilai(int[][] nilaiMhs, String[] namaMhs) {
        System.out.println("\nSeluruh Nilai Tugas Mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("\nInformasi Nilai Tugas Mahasiswa " + namaMhs[i] + ":");
            tampilkanInformasiNilaiTugas(nilaiMhs[i]);
        }
    }

    static void tampilkanInformasiNilaiTugas(int[] nilai) {
        System.out.println("Minggu ke\tNilai Tugas");
        for (int minggu = 1; minggu <= nilai.length; minggu++) {
            System.out.println(minggu + "\t\t" + nilai[minggu - 1]);
        }
    }

    static void cariHariNilaiTertinggi(int[][] nilaiMhs, String[] namaMhs) {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int minggu = 0; minggu < nilaiMhs[0].length; minggu++) {
            int totalNilaiMinggu = 0;
            for (int mahasiswa = 0; mahasiswa < nilaiMhs.length; mahasiswa++) {
                totalNilaiMinggu += nilaiMhs[mahasiswa][minggu];
            }

            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                hariTertinggi = minggu + 1;
            }
        }

        System.out.println("\nHari dengan nilai tertinggi dari keseluruhan mahasiswa adalah minggu ke-" + hariTertinggi);
    }

    static void tampilkanMahasiswaNilaiTertinggi(int[][] nilaiMhs, String[] namaMhs) {
        int[] totalNilaiMahasiswa = new int[namaMhs.length];

        for (int mahasiswa = 0; mahasiswa < nilaiMhs.length; mahasiswa++) {
            for (int minggu = 0; minggu < nilaiMhs[mahasiswa].length; minggu++) {
                totalNilaiMahasiswa[mahasiswa] += nilaiMhs[mahasiswa][minggu];
            }
        }

        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int mahasiswa = 0; mahasiswa < totalNilaiMahasiswa.length; mahasiswa++) {
            if (totalNilaiMahasiswa[mahasiswa] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa[mahasiswa];
                mahasiswaTertinggi = mahasiswa;
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah: " + namaMhs[mahasiswaTertinggi]); } }