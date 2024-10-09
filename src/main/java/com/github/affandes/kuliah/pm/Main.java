package com.github.affandes.kuliah.pm;

public class Main {
    private ArrayList<String> history; // List untuk menyimpan history

    public BrowserHistory() {
        history = new ArrayList<>(); // Inisialisasi list
    }

    // Menambahkan website baru ke dalam daftar history
    public void browse(String website) {
        history.add(website);
        System.out.println("Website '" + website + "' telah ditambahkan ke history.");
    }

    // Kembali ke website sebelumnya dan menghapus history terakhir
    public void back() {
        if (!history.isEmpty()) {
            String removedWebsite = history.remove(history.size() - 1); // Menghapus website terakhir
            System.out.println("Kembali dari '" + removedWebsite + "'.");
        } else {
            System.out.println("Tidak ada history untuk kembali.");
        }
    }

    // Menampilkan semua history browser yang diurutkan dari yang paling baru
    public void view() {
        if (!history.isEmpty()) {
            System.out.println("History Browser:");
            // Menampilkan history dari yang terbaru
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
        } else {
            System.out.println("History kosong.");
        }
    }
    public static void main(String[] args) {
        // Tulis kode disini
        BrowserHistory browserHistory = new BrowserHistory();

        // Menggunakan fungsi
        browserHistory.browse("example.com");
        browserHistory.browse("openai.com");
        browserHistory.browse("github.com");

        browserHistory.view();  // Menampilkan history

        browserHistory.back();   // Kembali ke website sebelumnya
        browserHistory.view();    // Menampilkan history setelah kembali

        browserHistory.back();   // Kembali lagi
        browserHistory.view();    // Menampilkan history setelah kembali

        browserHistory.back();   // Kembali lagi
        browserHistory.view();    // Menampilkan history setelah kembali

        browserHistory.back();   // Coba kembali saat history kosong
    }
} 
