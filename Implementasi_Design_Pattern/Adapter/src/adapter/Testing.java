package adapter;

public class Testing {

    public static void main(String[] args) {
        DocOpener docOpener = new AnotherDocOpener() ;

        docOpener.open("odt", "BAB 1 Pendahuluan.odt");
        docOpener.open("docx", "Dasar-dasar Pemrograman Java.docx");
        docOpener.open("pdf", "Head First Java.pdf");
        docOpener.open("csv", "Data Hasil Penjualan.csv");
    }
    
}
