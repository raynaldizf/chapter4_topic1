package com.example.chapter4_topic1.latihan

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chapter4_topic1.R

class NewsViewModel : ViewModel() {

    val listBerita = arrayListOf(
        DataNews("Suciwati Buka Suara Usai Hacker Bjorka Ungkap Pembunuh Munir","14 Sep 2022","CNN",
            R.drawable.munir,"Jakarta, CNN Indonesia -- Istri aktivis hak asasi manusia (HAM) Munir Said Thalib, Suciwati menilai tindakan hacker Bjorka yang membeberkan pelaku pembunuhan suaminya merupakan pesan penting.\n" +
                    "Suci berpendapat aksi Bjorka itu memperlihatkan bahwa masyarakat masih berharap kasus pembunuhan yang terjadi 18 tahun lalu itu bisa dibongkar.\n" +
                    "\n" +
                    "\"Dengan adanya bocoran yang sedang ramai hari ini menurut saya justru sebetulnya ini pesan penting, orang masih terus kok bertanya tentang kasus Munir,\" kata Suci di kantor KontraS, Jakarta, Selasa (13/9)."),
        DataNews("Harga Minyak Dunia Naik Lagi Nih, BBM Nggak Jadi Turun Dong?","13 Sep 2022","Zulfi Suhendra",R.drawable.minyak,"Jakarta - Harga minyak dunia pada hari ini naik. Kenaikan ini berlanjut karena investor masih khawatir dengan pasokan yang menipis jelang musim dingin.\n" +
                "Dilansir reuters, Selasa (13/9/2022), harga minyak mentah Brent naik 5 sen ke US\$ 94,05 per barel. Sementara minyak West Texas Intermediate naik 7 sen ke US\$ 87,85 per barel.\n" +
                "\n" +
                "Harga minyak mentah di kedua bagian Atlantik sudah naik lebih dari 15% pada tahun ini disebabkan ketidakpastian dari perang Rusia-Ukraina. Biaya energi juga mengalami kenaikan usai Rusia memangkas pasokan gas ke Eropa sebagai respons sanksi yang dikenakan negara barat."),
        DataNews("Muncul 'Kembaran' Jefri Nichol Kenakan Seragam Pramuka, Reaksi Sang Artis Tak Terduga","14 September 2022","Vania Ika Aldida",R.drawable.nichol,"AKTOR Jefri Nichol mendadak ramai dibicarakan oleh netizen di media sosial. Hal tersebut berawal dari unggahan akun @jakarta.keras, yang memposting sebuah foto pelajar menggunakan seragam pramuka.\n" +
                "\n" +
                "Sekilas tak ada yang aneh dari foto tersebut. Namun, ketika dilihat lebih dalam, wajah pelajar tersebut cukup mirip dengan sosok Jefri Nichol."),
        DataNews("Beredar Pengisian Data BSU Melalui Sosmed, Kemenaker: Itu Hoaks","14 September 2022","Kompas.com",R.drawable.bsu,"JAKARTA, KOMPAS.com - Kementerian Ketenagakerjaan (Kemenaker) memastikan bahwa informasi yang beredar di media sosial berupa permintaan pengisian data penerima bantuan subsidi upah (BSU) atau subsidi gaji dengan mengatasnamakan Kemenaker adalah hoaks. \"Form yang beredar yang isinya meminta untuk mengisi data penerima BSU yang mengatasnamakan Kementerian Ketenagakerjaan itu hoaks,\" kata Kepala Biro Humas, Chairul Fadhly Harahap melalui pernyataan tertulisnya, Rabu (14/9/2022)."),
        DataNews("Pengacara Benarkan Putri Candrawathi Bikin Rekening atas Nama Bripka RR dan Brigadir J","14 September 2022","Kompas.com",R.drawable.brigj,"JAKARTA, KOMPAS.com – Pengacara Putri Candrawathi, Arman Hanis membenarkan bahwa kliennya membuat rekening atas Bripka RR atau Ricky Rizal dan Brigadir J atau Nofriansyah Yosua Hutabarat. “Berdasarkan informasi dan keterangan dari klien kami tentang rekening, memang ada rekening yang dibuat atas nama RR dan J,” kata Arman saat dikonfirmasi, Rabu (14/9/2022)."),
        DataNews("Bripka RR Umbar Drama Saat Detik-detik Brigadir J Ditodong Pistol oleh Bharada E, Lihat Ferdy Sambo Lakukan Hal ini Sebelum Brigadir J Dihabisi","14 September 2022","Kompas.com",R.drawable.sambo,"Jakarta - Bripka RR Umbar Drama Saat Detik-detik Brigadir J Ditodong Pistol oleh Bharada E, Lihat Ferdy Sambo Sempat Lakukan ini Sebelum Brigadir J Dihabisi Kasus pembunuhan Brigadir Nofriansyah Yosua Hutabarat atau Brigadir J pelan-pelan mulai terungkap. Namun, tak dipungkiri bahwa terdapat banyak 'drama' pada kasus yang melibatkan 5 tersangka, yakni Ferdy Sambo, Ricky Rizal (Bripka RR), Richard Eliezer (Bharada E), Putri Candrawathi, dan Kuat Maruf."),
        DataNews("Effendi Simbolon Minta Maaf soal Pernyataan TNI Seperti Gerombolan","14 September 2022","CNN",R.drawable.effendi,"Jakarta, CNN Indonesia -- Anggota Komisi I DPR RI dari Fraksi PDIP Effendi Simbolon meminta maaf terkait pernyataannya yang menyebut TNI seperti 'gerombolan'.\n" +
                "Sebelumnya pernyataan itu diungkap Effendi saat rapat Komisi I DPR dengan Panglima TNI Jenderal Andika Perkasa.\n" +
                "\n" +
                "\"Saya dari lubuk hati paling dalam saya minta maaf atas perkataan saya yang menyakiti di hati prajurit siapapun dia dari mulai tamtama perwira sampai sesepuh dengan pernyataan yang diartikan lain,\" kata Effendi di kompleks parlemen, Senayan, Jakarta, Rabu (14/9)."),
        DataNews("Data Pribadi Dibobol Bjorka, Cak Imin Pamit dari WA : Ini Mengerikan, Banyak Teror Pesan Masuk","14 September 2022","Theresia Felisiani",R.drawable.bjorka,"TRIBUNNEWS.COM, JAKARTA - Ketua Umum Partai Kebangkitan Bangsa (PKB) Muhaimin Iskandar\n" +
                "memutuskan pamit sementara waktu dari penggunaan aplikasi Whatsapp (WA) setelah\n" +
                "nomor ponsel dan WA pribadinya tersebar.\n" +
                "\n" +
                "\"Saya mengundurkan diri dari WA hari ini. Karena WA saya bocor dengan macam-macam isinya,\" kata Muhaimin di Kompleks Parlemen, Senayan, Jakarta, Selasa (13/9)."),
        DataNews("Polisi Antisipasi Demo BBM di Patung Kuda dan Flyover Pasar Rebo","14 September 2022","Zunita Putri",R.drawable.kuda,"Jakarta - Polda Metro Jaya menyiagakan personel untuk mengantisipasi demo penolakan kenaikan harga BBM. Hari ini, sekelompok elemen massa akan kembali turun demo di kawasan Patung Kuda dan Flyover Pasar Rebo.\n" +
                "\"Untuk massa demo yang dengan pemberitahuan hari ini belum ada, tetapi kami mengantisipasi demo yang tanpa pemberitahuan,\" ujar Kabid Humas Polda Metro Jaya Kombes Endra Zulpan dalam keterangan kepada detikcom, Rabu (14/9/2022)."),
        DataNews("BSU 2022 Cair! Cek Namamu di bsu.bpjsketenagakerjaan.go.id","14 September 2022","Tim Redaksi, CNBC Indonesia",R.drawable.cair,"Jakarta, CNBC Indonesia - Pemerintah melalui Kementerian Ketenagakerjaan telah menyalurkan bantuan subsidi upah (BSU) sebesar Rp 600 ribu kepada 4,1 juta pekerja berpenghasilan maksimal Rp 3,5 juta per bulan pada awal pekan ini.\n" +
                "BSU ini diberikan kepada para pekerja melalui rekening masing-masing para pekerja, yang bekerja sama dengan Himpunan Bank Negara (Himbara) seperti BNI, Bank Rakyat Indonesia, Bank Tabungan Negara, hingga Bank Mandiri."),
    )
    val listberita : MutableLiveData<List<DataNews>> = MutableLiveData()

    fun getBerita(){
        var berita = listBerita
        listberita.value = berita
    }
}