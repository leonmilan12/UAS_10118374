//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import java.util.ArrayList;
import java.util.List;

public class TempatData {
    public static List<Tempat> getListTempat(){
        Tempat tempat1 = new Tempat(R.drawable.ic_tempat, "Farmhouse Lembang", -6.832777247653288, 107.60563975419706, "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391");
        Tempat tempat2 = new Tempat(R.drawable.ic_tempat, "Kawah Tangkuban Perahu", -6.758221183712884, 107.61049226768978, "Cicadas, Sagalaherang, Kabupaten Subang, Jawa Barat 41282");
        Tempat tempat3 = new Tempat(R.drawable.ic_tempat, "Curug Cimahi / Air Terjun Pelangi", -6.798572247562518, 107.5757609388547, "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551");
        Tempat tempat4 = new Tempat(R.drawable.ic_tempat, "Kebun Teh Sukawana", -6.776725979182752, 107.58399765604487, "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551");
        Tempat tempat5 = new Tempat(R.drawable.ic_tempat, "Bird And Bromelia Pavilion", -6.8407144032867695, 107.63780317138757, "Jl. Akaza Utama No.9, Mekarwangi, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391");
        Tempat tempat6 = new Tempat(R.drawable.ic_tempat, "Dago Dream Park", -6.8483866402147155, 107.62590681001974, "Jl. Dago Giri Km. 2.2 Mekarwangi, Pagerwangi, Lembang, Kabupaten Bandung Barat, Jawa Barat 40135");
        Tempat tempat7 = new Tempat(R.drawable.ic_tempat, "Tebing Keraton", -6.833823285035507, 107.66361509652609, "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat 40198");
        Tempat tempat8 = new Tempat(R.drawable.ic_tempat, "Taman Hutan Raya Djuanda", -6.85633409657477, 107.63240558303274, "Taman Hutan Raya Juanda, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198");
        Tempat tempat9 = new Tempat(R.drawable.ic_tempat, "Jalan Braga", -6.914819077522979, 107.6089734676914, "Babakan Ciamis, Kec. Sumur Bandung, Kota Bandung, Jawa Barat");
        Tempat tempat10 = new Tempat(R.drawable.ic_tempat, "Ranca Upas", -7.137905744106008, 107.3922273253648, "Jl. Raya Ciwidey - Patengan No.KM. 11, Patengan, Kec. Rancabali, Bandung, Jawa Barat 40973");

        List<Tempat> list = new ArrayList<>();
        list.add(tempat1);
        list.add(tempat2);
        list.add(tempat3);
        list.add(tempat4);
        list.add(tempat5);
        list.add(tempat6);
        list.add(tempat7);
        list.add(tempat8);
        list.add(tempat9);
        list.add(tempat10);
        return list;


    };
}
