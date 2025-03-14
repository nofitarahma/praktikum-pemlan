public class perpustakaan {
    private String namaPerpustakaan;
    private String judulBuku;
    private String kategoriBuku;
    private String[] penulisBuku;
    private int tahunTerbitBuku;
    final private int maksPanjang = 100;

    public void setNamaPerpustakaan(String namaPerpustakaan){
        this.namaPerpustakaan = namaPerpustakaan;
    }
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
    public void setKategoriBuku(String kategoriBuku){
        this.kategoriBuku = kategoriBuku;
    }
    public void setPenulisBuku(String[] penulisBuku){
        this.penulisBuku = penulisBuku;
    }
    public void setTahunTerbitBuku(int tahunTerbitBuku){
        this.tahunTerbitBuku = tahunTerbitBuku;
    }
    private void panjangBarisMaks(String baris){
        String[] barisKata = baris.split(" ");
        String barisIni = "";
        for (String kata : barisKata){
            if ((barisIni + kata).length() <= maksPanjang) {
                if (!barisIni.isEmpty()) {
                    barisIni += " ";
                }
                barisIni += kata;
            } else {
                System.out.println(barisIni);
                barisIni = kata;
            }
        }
        System.out.println(barisIni);
    }
    private String ditengah(String kata){
        int padding = maksPanjang - kata.length();
        int paddingKiri = (padding/2)-2;
        int paddingKanan = padding - paddingKiri- 4;
        return " ".repeat(paddingKiri) + kata + " ".repeat(paddingKanan);
    }
    public void border1(){
        System.out.println("=".repeat(maksPanjang));
    }
    public void border2(){
        System.out.println("-".repeat(maksPanjang));
    }
    public void awalan(){
        border1();
        panjangBarisMaks("||" + ditengah("PERPUSTAKAAN " + namaPerpustakaan.toUpperCase()) + "||");
    }
    public void menampilkanKategori(){
        border1();
        panjangBarisMaks("| " + ditengah("Kategori " + kategoriBuku) + " |");
        border1();
    }
    private String penulisnya(){
        if (penulisBuku.length <= 2) {
            String semuaPenulis = "";
            for (int i = 0; i< penulisBuku.length; i++){
                semuaPenulis += penulisBuku[i];
                if (i<penulisBuku.length-1) {
                    semuaPenulis += "\n";
                }
            }
            return semuaPenulis;
        } else {
            return penulisBuku[0] + ", " + "dkk.";
        }
    }
    public void dataBuku(){
        panjangBarisMaks("-Judul Buku: \n" + judulBuku);
        panjangBarisMaks("-Penulis Buku: \n" + penulisnya());
        panjangBarisMaks("-Tahun Terbit: " + tahunTerbitBuku);
        border2();
    }
    public void akhiran(){
        border1();
        panjangBarisMaks("||" + ditengah("BUKU-BUKU TERSEBUT BERDASARKAN KATEGORINYA ") + "||");
        border1();
    }
}
