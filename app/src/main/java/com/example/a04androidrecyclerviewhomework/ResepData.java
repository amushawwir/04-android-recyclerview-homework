package com.example.a04androidrecyclerviewhomework;

import java.util.ArrayList;

public class ResepData {
    private static String[] resepName = {
            "Coto Makassar",
            "Sop Konro",
            "Pallubasa",
            "Songkolo",
            "Jalangkote",
            "Es Pisang Ijo",
            "Barongko"
    };

    private static String[] resepDetail = {
            "Makanan khas Makassar ini menggunakan segudang rempah sehingga menghasilkan makanan bercita rasa tinggi. Ada berbagai jenis bumbu lokal seperti kacang, lengkuas, serai, jahe, daun salam, ketumbar, dan lainnya. \n\nBahan bahan \n1 kg daging sapi, cuci bersih\n" +
                    "5 batang serai, memarkan\n" +
                    "2.000 ml air cucian beras putih\n" +
                    "5 lembar daun salam\n" +
                    "3 sendok makan minyak goreng\n" +
                    "250 gram kacang tanah, goreng dan haluskan\n" +
                    "5 cm jahe, memarkan\n" +
                    "1 ruas lengkuas, memarkan\n10 siung bawang putih\n" +
                    "8 butir kemiri sangrai\n" +
                    "1 sendok makan ketumbar, sangrai\n" +
                    "1 sendok teh jintan, sangrai\n" +
                    "1 sendok teh merica butiran\n" +
                    "1 sendok teh garam\n\n Cara Membuat \n Rebus daging sapi menggunakan air cucian beras bersama dengan lengkuas, jahe, daun salam, dan serai. Masak hingga daging empuk.\n" +
                    "Potong dadu daging, lalu tiriskan. Jangan dibuang dahulu air rebusannya.\n" +
                    "Panaskan minyak, lalu tambahkan bumbu halus. Tumis hingga harum dan matang. Masukkan bumbu halus ke dalam air rebusan.\n" +
                    "Panaskan dengan menambahkan kacang tanah goreng. Rebus hingga mendidih dan matikan kompor.\n" +
                    "Siapkan piring saji, tambahkan irisan daun bawang, seledri, dan garam. Masukkan potongan daging dan tuang air kaldu ke dalamnya.\n" +
                    "Taburi bawang merah goreng dan jeruk nipis.",

            "Sop Konro juga menjadi salah satu makanan khas Makassar yang cukup banyak dikenal. Konro merupakan masakan sup iga sapi. Masakan berkuah warna coklat kehitaman ini biasa dimakan dengan burasa atau ketupat.",
            "Pallubasa adalah makanan khas Makassar yang juga berbahan dasar daging. Pallubasa hampir mirip dengan Coto Makassar, yang disajikan dengan irisan daging dan jeroan sapi.",
            "Songkolo merupakan makanan khas Makassar yang terbuat dari beras ketan. Makanan ini dapat ditemui di penjual jajanan pasar di Makassar, atau dengan mengunjungi kedai Songkolo.",
            "Jalangkote menjadi salah satu makanan ringan khas Makassar yang sangat populer. Jalangkote sekilas mirip kue pastel. Bedanya, kue pastel memiliki kulit yang lebih tebal dibandingkan jalangkote dan bila pastel dimakan bersama cabe rawit, jalangkote dimakan bersama sambal cair campuran cuka dan cabe.",
            "Nama pisang ijo diambil dari tampilan hidangan ini. Pisang sebagai bahan baku dibalut dengan adonan dadar hijau. Penyajiannya es pisang ijo diberi kuah bubur sumsum, kuah santan dan sirop merah serta es.",
            "Makanan khas Makassar selanjutnya adalah Barongko. Terbuat dari pisang yang dihaluskan, telur, santan, gula pasir, dan garam. Kemudian dibungkus daun pisang lalu dikukus. Barongko lebih nikmat disajikan dingin."
    };

    private static int[] resepImage = {
            R.drawable.coto,
            R.drawable.konro,
            R.drawable.pallubasa,
            R.drawable.songkolo,
            R.drawable.jalangkote,
            R.drawable.pisangijo,
            R.drawable.barongko
    };

    static ArrayList<Resep> getListData(){
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < resepName.length; position++) {
            Resep resep = new Resep();
            resep.setName(resepName[position]);
            resep.setDetail(resepDetail[position]);
            resep.setPhoto(resepImage[position]);
            list.add(resep);
        }
        return list;
    }

}
