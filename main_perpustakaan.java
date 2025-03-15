public class main_perpustakaan {
    public static void main(String[] args) {
        
        perpustakaan teknologi1 = new perpustakaan(
            "Introduction to Java Programming, Comprehensive Version, 10th Edition",
            "Teknologi", new String[]{"Y. Daniel Liang"}, 2015,
            "Buku tentang dasar-dasar dan konsep lanjutan pemrograman java, yang mencakup object oriented programming, hingga pengembangan aplikasi berbasis GUI"
        );
        perpustakaan teknologi2 = new perpustakaan(
            "Java How to Program, Tenth Edition, Late Objects Version",
            "Teknologi", new String[]{"Paul Deitel", "Harvey Deitel"}, 2014,
            "Buku yang cocok untuk pemula, menjelaskan java dengan pendekatan bertahap, membahas konsep dasar sebelum masuk ke object oriented programming"
        );
        perpustakaan teknologi3 = new perpustakaan(
            "Operating System Concepts, Tenth Edition",
            "Teknologi", new String[]{"Abraham Silberschatz","Peter Baer Galvin", "Greg Gagne"}, 2018,
            "Buku yang membahas tentang bagaimana sistem operasi bekerja, mulai dari pengelolaan proses, memori, file, hingga keamanan dan sistem jaringan"
        );
        perpustakaan teknologi4 = new perpustakaan(
            "Operating System: Internals and Design Principles, Ninth Edition",
            "Teknologi", new String[]{"William Stallings"}, 2018,
            "Buku yang menjelaskan cara kerja sistem operasi secara lebih dalam, termasuk bagaimana sumber daya komputer dikelola dan diamankan"
        );
        perpustakaan teknologi5 = new perpustakaan(
            "Fundamentals of Information Systems, Eight Edition",
            "Teknologi", new String[]{"Ralph M. Stair","George W. Reynolds"}, 2017,
            "Buku yang memberikan gambaran umum tentang sistem informasi, bagaimana teknologi digunakan dalam bisnis, serta pentingnya keamanan dan etika digital"
        );

        perpustakaan filsafat1 = new perpustakaan(
            "Filosofi Teras", "Filsafat", new String[]{"Henry Manampiring"}, 2018, 
            "Buku yang memperkenalkan filsafat Stoisisme dengan ringan dan relevan untuk kehidupan modern, membantu menghadapi stres, emosi, dan masalah sehari-hari"
        );
        perpustakaan filsafat2 = new perpustakaan(
            "The Meaning of Human Existence", "Filsafat", new String[]{"Edward O. Wilson"}, 2014, 
            "Buku yang membahas asal-usul, makna, dan peran manusia dalam alam semesta, menggabungkan pandangan sains, filsafat dan evolusi untuk menjawab pertanyaan besar tentang keberadaan kita"
        );
        perpustakaan filsafat3 = new perpustakaan(
            "The Midnight Library", "Filsafat", new String[]{"Matt Haig"}, 2020, 
            "Buku tentang wanita yang menemukan perpustakaan ajaib diantara hidup dan mati, dimana ia bisa menjalani kehidupan yang berbeda berdasarkan pilihhan yang pernah ia buat"
        );
        perpustakaan filsafat4 = new perpustakaan(
            "On Being", "Filsafat", new String[]{"Peter Atkins"}, 2011, 
            "Buku yang menggali pertanyaan mendalan tentang identitas, keberadaan, dan makna hidup melalui refleksi filosofis, pengalaman pribadi, dan wawasan dari berbagai disiplin ilmu"
        );
        perpustakaan filsafat5 = new perpustakaan(
            "Dunia Sophie", "Filsafat", new String[]{"Jostein Gaarder"}, 1991, 
            "Novel filsafat yang mengikuti perjalanan gadis bernama Sophie dalam memahami sejarah pemikiran filsafat dari zaman kuno hingga modern dengan cara yang menarik dan mudah dipahami"
        );
        
        perpustakaan sejarah1 = new perpustakaan(
            "Sapiens: A Brief History of Humankind", "Sejarah", new String[]{"Yuval Noah Harari"}, 2011, 
            "Buku yang membahas tentang sejarah manusia dari zaman prasejarah hingga modern"
        );
        perpustakaan sejarah2 = new perpustakaan(
            "Sejarah Dunia Yang Disembunyikan", "Sejarah", new String[]{"Jonathan Black"}, 2007, 
            "Buku ini mengungkap sejarah yang jarang dibahas, termasuk peristiwa-peristiwa penting yang mempengaruhi dunia tapi sering dilupakan atau sengaja disembunyikan"
        );
        perpustakaan sejarah3 = new perpustakaan(
            "Genghis Khan and the Making of the Modern World", "Sejarah", new String[]{"Jack Weatherford"}, 2004, 
            "Buku yang menceritakan tentang perjalanan hidup Genhis Khan dan bagaimana kekaisarannya berkontribusi pada terbentuknya dunia modern, mulai dari perdagangan hingga teknologi"
        );
        perpustakaan sejarah4 = new perpustakaan(
            "A Short History of Nearly Everything", "Sejarah", new String[]{"Bill Bryson"}, 2003, 
            "Buku yang menjelaskan tentang berbagai ilmu pengetahuan, mulai dari astronomi, geologi, biologi, hingga fisika dan dikemas dengan cara yang menarik kemudian mudah dipahami orang awam"
        );
        perpustakaan sejarah5 = new perpustakaan(
            "The Silk Roads: A New History of the World", "Sejarah", new String[]{"Peter Frankopan"}, 2015, 
            "Buku yang mengungkap bagaimana Silk Roads menjadi pusat peradaban dunia, menghubungkan Timur dan Barat dalam perdagangan, budaya, dan peristiwa sejarah penting"
        );

        perpustakaan agama1 = new perpustakaan(
            "Buku Ajar Pendidikan Agama Islam Edisi Revisi", "Agama",
            new String[]{"Prof. Dr. Thohir Luth, M.A.","Dr. Nur Chanifah, M.Pd.I", "Khalid Rahman, M.Pd.I", "Mokhamad Rohma Rozikin, M.Pd."},
            2007, 
            "Buku ajar yang membahas dasar-dasar ajaran Islam, mencakup akidah, akhlak, dan sejarah Islam, sesuai kurikulum pendidikan agama islam"
        );
        perpustakaan agama2 = new perpustakaan(
            "The Case for God", "Agama", new String[]{"Karen Armstrong"}, 2009, 
            "Buku yang membahas sejarah pemikiran tentang Tuhan dalam berbagai tradisi keagamaan, serta bagaimana konsep ketuhanan berkembang dari masa ke masa"
        );
        perpustakaan agama3 = new perpustakaan(
            "The Evolution of God", "Agama", new String[]{"Robert Wright"}, 2009, 
            "Buku yang membahas bagaimana konsep Tuhan berkembang sepanjang sejarah, dari kepercayaan kuno hingga agama-agama besar, serta bagaimana faktor sosial budaya mempengaruhi"
        );
        perpustakaan agama4 = new perpustakaan(
            "Religion and the Rise of Capitalism", "Agama", new String[]{"Benjamin M. Friedman"}, 2021, 
            "Buku yang mengeksplorasi hubungan antara agama dan perkembangan kapitalisme, kemudian menunjukkan bagaimana nilai-nilai religius mempengaruhi ekonomi modern"
        );
        perpustakaan agama5 = new perpustakaan(
            "The Varieties of Religious Experience: A Study in Human Nature", "Agama",
            new String[]{"William James"}, 2002, 
            "Buku yang meneliti pengalaman religius dari perspektif psikologi dan filsafat, kemudian menjelaskan bagaimana keyakinan mempengaruhi kehidupan manusia"
        );

        perpustakaan psikologi1 = new perpustakaan(
            "The Power of Habit: Why We Do What We Do in Life and Business", "Psikologi", 
            new String[]{"Charles Duhigg"}, 2012, 
            "Buku yang menjelaskan bagaimana kebiasaan terbentuk, bagaimana cara mengubahnya, dan bafaimana kebiasaan dapat mempengaruhi kehidupan pribadi serta kesuksesan bisnis"
        );
        perpustakaan psikologi2 = new perpustakaan(
            "Thinking, Fast and Slow", "Psikologi", new String[]{"Daniel Kahneman"}, 2011, 
            "Buku yang mengungkap cara kerja pikiran manusia melalui dua sistem berpikir, yaitu cepat(intuitif) dan lambat(rasional), serta bagaimana keduanya mempengaruhi keputusan"
        );
        perpustakaan psikologi3 = new perpustakaan(
            "Atomic Habbits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", "Psikologi", 
            new String[]{"James Clear"}, 2018, 
            "Buku yang menawarkan metode sederhana untuk membentuk kebiasaan baik dan menghilangkan kebiasaan buruk dengan perubahan kecil yang memberikan dampak besar"
        );
        perpustakaan psikologi4 = new perpustakaan(
            "Grit: The Power of Passion and Perseverance", "Psikologi", new String[]{"Angela Duckworth"}, 2016, 
            "Buku yang membahas bagaimana ketekunana dan semangat lebih berperan dalam mencapai kesuksesan dibanding bakat atau kecerdasan semata"
        );
        perpustakaan psikologi5 = new perpustakaan(
            "The Paradox of Choice: Why More Is less", "Psikologi", new String[]{"Barry Schwartz"}, 2004, 
            "Buku yang menjelaskan terlalu banyak pilihan justru membuat stres, cemas, dan tidak puas dalam pengambilan keputusan"
        );

        perpustakaan politik1 = new perpustakaan(
            "How Democracies Die", "Politik", new String[]{"Steven Levitsky","Daniel Ziblatt"}, 2018, 
            "Buku yang menjelaskan keruntuhan demokrasi, tapi bukan karena kudeta, karena perlahan erosi norma-norma politik dan lemahnya institusi demokratis"
        );
        perpustakaan politik2 = new perpustakaan(
            "Why Nations FailL The Origins of Power, Prosperity, and Poverty", "Politik", 
            new String[]{"Daron Acemoglu", "James A. Robinson"}, 2012, 
            "Buku yang membahas beberapa negara bisa makmur sedangkan yang lain tetap miskin, yang disoroti adalah peran institusi politik dan ekonomi"
        );
        perpustakaan politik3 = new perpustakaan(
            "Democracy in Chains: The Deep History of the Radical Right's Stealth Plan for America",
            "Politik", new String[]{"Nancy MacLean"}, 2017, 
            "Buku yang mengungkap sejarah gerakan politik sayap kanan di Amerika berupaya melemahkan demokrasi demi kepentingan ekonomi elite"
        );
        perpustakaan politik4 = new perpustakaan(
            "The Fifth Risk", "Politik", new String[]{"Michael Lewis"}, 2018, 
            "Buku yang mengeksplorasi bahaya tersembunyi dalam pemerintahan Amerika, khususnya pengelolaan yang buruk dapat mengancam kebijakan publik dan keselamatan masyarakat"
        );
        perpustakaan politik5 = new perpustakaan(
            "The Light That Failed: A Reckogning", "Politik", new String[]{"Ivan Krastev","Stephen Holmes"}, 2019, 
            "Buku ini membahas demokrasi liberal yang dulu dianggap sebagai masa depan dunia tapi sekarang mengalami kemunduran terutama di Eropa Timur dan Amerika"
        );

        perpustakaan fiksi1 = new perpustakaan(
            "The Night Circus", "Fiksi", new String[]{"Erin Morgenstern"}, 2011, 
            "sirkus misterius yang hanya muncul di malam hari menjadi arena persaingan dua penyihir muda yang tanpa sadar jatuh cinta meski terjebak dalam permainan berbahaya"
        );
        perpustakaan fiksi2 = new perpustakaan(
            "The Underground Railroad", "Fiksi", new String[]{"Colson Whitehead"}, 2016, 
            "perjalanan seorang budak wanita yang melarikan diri melalui jaringan kereta bawah tanah rahasia, dalam perjuangan mencari kebebasan di Amerika abad ke-19"
        );
        perpustakaan fiksi3 = new perpustakaan(
            "Babel: An Arcane History", "Fiksi", new String[]{"R.F. Kuang"}, 2022, 
            "novel fantasi sejarah yang mengeksplorasi kekuatan bahasa, kolonialisme, dan penerjemahan melalui kisah sekelompok mahasiswa di sebuah institut magis di Oxford"
        );
        perpustakaan fiksi4 = new perpustakaan(
            "Sea of Tranquility", "Fiksi", new String[]{"Emily St. John mandel"}, 2022, 
            "Penggabungan elemen fiksi ilmiah dan sejarah, mengikuti perjalanan waktu yang menghubungkan berbagai era, dari abad ke-20 hingga masa depan di koloni bulan"
        );
        perpustakaan fiksi5 = new perpustakaan(
            "Klara and the Sun", "Fiksi", new String[]{"Kazuo Ishiguro"}, 2021, 
            "Klara merupakan robot berbasis AI yang mencari makna cinta dan harapan saat ia menjadi pendamping seorang gadis di dunia yang didominasi teknologi"
        );

        perpustakaan perpustakaan = new perpustakaan(
            "Universitas X"
        );
        perpustakaan.awalan();

        teknologi1.menampilkanKategori();
        teknologi1.dataBuku();
        teknologi2.dataBuku();
        teknologi3.dataBuku();
        teknologi4.dataBuku();
        teknologi5.dataBuku();
        perpustakaan.fiturTambahan1();
        teknologi1.cekTingkatKesamaan(teknologi1, teknologi2);
        teknologi3.cekTingkatKesamaan(teknologi3, teknologi4);
        perpustakaan.fiturTambahan2();
        perpustakaan teknologi6 = new perpustakaan(teknologi1);
        teknologi6.dataBuku();
        filsafat1.menampilkanKategori();
        filsafat1.dataBuku();
        filsafat2.dataBuku();
        filsafat3.dataBuku();
        filsafat4.dataBuku();
        filsafat5.dataBuku();
        perpustakaan.fiturTambahan1();
        filsafat1.cekTingkatKesamaan(filsafat1, filsafat2);
        filsafat3.cekTingkatKesamaan(filsafat3, filsafat4);
        perpustakaan.fiturTambahan2();
        perpustakaan filsafat6 = new perpustakaan(filsafat2);
        filsafat6.dataBuku();
        sejarah1.menampilkanKategori();
        sejarah1.dataBuku();
        sejarah2.dataBuku();
        sejarah3.dataBuku();
        sejarah4.dataBuku();
        sejarah5.dataBuku();
        perpustakaan.fiturTambahan1();
        sejarah1.cekTingkatKesamaan(sejarah1, sejarah2);
        sejarah3.cekTingkatKesamaan(sejarah3, sejarah4);
        perpustakaan.fiturTambahan2();
        perpustakaan sejarah6 = new perpustakaan(sejarah3);
        sejarah6.dataBuku();
        agama1.menampilkanKategori();
        agama1.dataBuku();
        agama2.dataBuku();
        agama3.dataBuku();
        agama4.dataBuku();
        agama5.dataBuku();
        perpustakaan.fiturTambahan1();
        agama1.cekTingkatKesamaan(agama1, agama2);
        agama3.cekTingkatKesamaan(agama3, agama4);
        perpustakaan.fiturTambahan2();
        perpustakaan agama6 = new perpustakaan(agama4);
        agama6.dataBuku();
        psikologi1.menampilkanKategori();
        psikologi1.dataBuku();
        psikologi2.dataBuku();
        psikologi3.dataBuku();
        psikologi4.dataBuku();
        psikologi5.dataBuku();
        perpustakaan.fiturTambahan1();
        psikologi1.cekTingkatKesamaan(psikologi1, psikologi2);
        psikologi3.cekTingkatKesamaan(psikologi3, psikologi4);
        perpustakaan.fiturTambahan2();
        perpustakaan psikologi6 = new perpustakaan(psikologi5);
        psikologi6.dataBuku();
        politik1.menampilkanKategori();
        politik1.dataBuku();
        politik2.dataBuku();
        politik3.dataBuku();
        politik4.dataBuku();
        politik5.dataBuku();
        perpustakaan.fiturTambahan1();
        politik1.cekTingkatKesamaan(politik1, politik2);
        politik3.cekTingkatKesamaan(politik3, politik4);
        perpustakaan.fiturTambahan2();
        perpustakaan politik6 = new perpustakaan(politik1);
        politik6.dataBuku();
        fiksi1.menampilkanKategori();
        fiksi1.dataBuku();
        fiksi2.dataBuku();
        fiksi3.dataBuku();
        fiksi4.dataBuku();
        fiksi5.dataBuku();
        perpustakaan.fiturTambahan1();
        fiksi1.cekTingkatKesamaan(fiksi1, fiksi2);
        fiksi3.cekTingkatKesamaan(fiksi3, fiksi4);
        perpustakaan.fiturTambahan2();
        perpustakaan fiksi6 = new perpustakaan(fiksi2);
        fiksi6.dataBuku();
        
        perpustakaan.akhiran();
    }
}
