public class perpustakaan {
    private String namaPerpustakaan;
    private String judulBuku;
    private String kategoriBuku;
    private String[] penulisBuku;
    private int tahunTerbitBuku;
    private String sinopsisBuku;
    final private int maksPanjang = 100;

    public perpustakaan(String judul, String kategori, String[] penulis, int tahunTerbit, String sinopsis){
        judulBuku = judul;
        kategoriBuku = kategori;
        penulisBuku = penulis;
        tahunTerbitBuku = tahunTerbit;
        sinopsisBuku = sinopsis;
    }
    public perpustakaan(String namaPerpus){
        namaPerpustakaan = namaPerpus;
    }

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
    public void setSinopsisBuku(String sinopsisBuku){
        this.sinopsisBuku = sinopsisBuku;
    }

    private void panjangBarisMaks(String baris){
        String[] barisKata = baris.split("\\s+");
        String barisIni = "";
        for (String kata : barisKata){
            if ((barisIni + kata).length() <= (maksPanjang-1)) {
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
        System.out.println("||" + ditengah("PERPUSTAKAAN " + namaPerpustakaan.toUpperCase()) + "||");
    }
    public void menampilkanKategori(){
        border1();
        System.out.println("| " + ditengah("Kategori " + kategoriBuku) + " |");
        border1();
    }
    public int hitungJumlahKata(){
        String kata[] = sinopsisBuku.split("\\s+");
        return kata.length;
    }
    public void cekTingkatKesamaan(perpustakaan buku1, perpustakaan buku2){
        int jumlahKesamaan = 0;
        if (buku1.judulBuku.equalsIgnoreCase(buku2.judulBuku)) {
            jumlahKesamaan++;
        } if (buku1.kategoriBuku.equalsIgnoreCase(buku2.kategoriBuku)) {
            jumlahKesamaan++;
        } if (buku1.tahunTerbitBuku == buku2.tahunTerbitBuku) {
            jumlahKesamaan++;
        } if (buku1.sinopsisBuku.equalsIgnoreCase(buku2.sinopsisBuku)) {
            jumlahKesamaan++;
        } for (String penulis1 : buku1.penulisBuku){
            for (String penulis2 : buku2.penulisBuku){
                if (penulis1.equalsIgnoreCase(penulis2)){
                    jumlahKesamaan++;
                }
            }
        }
        int kesamaan = jumlahKesamaan * 20;
        panjangBarisMaks("Buku dengan judul:");
        panjangBarisMaks("\"" + buku1.judulBuku + "\"");
        panjangBarisMaks("Memiliki tingkat kesamaan sebesar " + kesamaan + "% dengan buku yang berjudul:");
        panjangBarisMaks("\"" + buku2.judulBuku + "\"");
        border2();
    }
    public void fiturTambahan1(){
        border1();
        System.out.println("| " + ditengah("Cek Kesamaan") + " |");
        border1();
    }
    public void fiturTambahan2(){
        border1();
        System.out.println("| " + ditengah("Copy") + " |");
        border1();
    }
    perpustakaan(){

    }
    perpustakaan(perpustakaan buku){
        this.copy(buku);
    }
    public void copy(perpustakaan buku){
        judulBuku = buku.judulBuku;
        kategoriBuku = buku.kategoriBuku;
        penulisBuku = buku.penulisBuku;
        tahunTerbitBuku = buku.tahunTerbitBuku;
        sinopsisBuku = buku.sinopsisBuku;
    }
    private String getPenulis(){
        if (penulisBuku.length <= 2) {
            String semuaPenulis = "";
            for (int i = 0; i< penulisBuku.length; i++){
                semuaPenulis += penulisBuku[i];
                if (i<penulisBuku.length-1) {
                    semuaPenulis += ", ";
                }
            }
            return semuaPenulis;
        } else {
            return penulisBuku[0] + ", " + "dkk.";
        }
    }
    public void dataBuku(){
        panjangBarisMaks("-Judul Buku: " + judulBuku);
        panjangBarisMaks("-Penulis Buku: " + getPenulis());
        panjangBarisMaks("-Tahun Terbit: " + tahunTerbitBuku);
        panjangBarisMaks("-Sinopsis: " + sinopsisBuku);
        panjangBarisMaks("-Jumlah Kata pada Sinopsis: " + hitungJumlahKata());
        border2();
    }
    public void akhiran(){
        border1();
        System.out.println("||" + ditengah("BUKU-BUKU TERSEBUT BERDASARKAN KATEGORINYA") + "||");
        border1();
    }
}
