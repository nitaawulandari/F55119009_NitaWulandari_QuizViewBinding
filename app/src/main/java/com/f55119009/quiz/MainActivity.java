package com.f55119009.quiz;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.f55119009.quiz.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);

        // Data Ahmad Dahlan
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_dahlan));
        binding.txtName1.setText("Ahmad Dahlan");
        binding.txtDescription1.setText("Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.");
        // Data Ahmad Yani
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_yani));
        binding.txtName2.setText("Ahmad Yani");
        binding.txtDescription2.setText("Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.");
        // Data Sutomo
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bung_tomo));
        binding.txtName3.setText("Sutomo");
        binding.txtDescription3.setText("Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan.");
        // Data Gatot Soebroto
        binding.imgPhoto4.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.gatot_subroto));
        binding.txtName4.setText("Gatot Soebroto");
        binding.txtDescription4.setText("Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan militer Indonesia dalam merebut kemerdekaan dan juga pahlawan nasional Indonesia. Ia dimakamkan di Ungaran, kabupaten Semarang.");
        // Data Ki Hajar Dewantara
        binding.imgPhoto5.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ki_hadjar_dewantara));
        binding.txtName5.setText("Ki Hajar Dewantara");
        binding.txtDescription5.setText("Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun; selanjutnya disingkat sebagai \"Soewardi\" atau \"KHD\") adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda. Ia adalah pendiri Perguruan Taman Siswa, suatu lembaga pendidikan yang memberikan kesempatan bagi para pribumi untuk bisa memperoleh hak pendidikan seperti halnya para priyayi maupun orang-orang Belanda.");
        // Data Mohammad Hatta
        binding.imgPhoto6.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mohammad_hatta));
        binding.txtName6.setText("Mohammad Hatta");
        binding.txtDescription6.setText("Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Ia mundur dari jabatan wakil presiden pada tahun 1956, karena berselisih dengan Presiden Soekarno. Hatta juga dikenal sebagai Bapak Koperasi Indonesia.");
        // Data Soediirman
        binding.imgPhoto7.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.sudirman));
        binding.txtName7.setText("Soedirman");
        binding.txtDescription7.setText("Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Menjadi panglima besar Tentara Nasional Indonesia pertama, ia secara luas terus dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya pindah ke Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang dijalankan oleh organisasi Islam Muhammadiyah. Saat di sekolah menengah, Soedirman mulai menunjukkan kemampuannya dalam memimpin dan berorganisasi, dan dihormati oleh masyarakat karena ketaatannya pada Islam. Setelah berhenti kuliah keguruan, pada 1936 ia mulai bekerja sebagai seorang guru, dan kemudian menjadi kepala sekolah, di sekolah dasar Muhammadiyah; ia juga aktif dalam kegiatan Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah pada tahun 1937. Setelah Jepang menduduki Hindia Belanda pada 1942, Soedirman tetap mengajar. Pada tahun 1944, ia bergabung dengan tentara Pembela Tanah Air (PETA) yang disponsori Jepang, menjabat sebagai komandan batalion di Banyumas. Selama menjabat, Soedirman bersama rekannya sesama prajurit melakukan pemberontakan, namun kemudian diasingkan ke Bogor.");
        // Data Soekarno
        binding.imgPhoto8.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.sukarno));
        binding.txtName8.setText("Soekarno");
        binding.txtDescription8.setText("Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.");
        // Data Soepomo
        binding.imgPhoto9.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.supomo));
        binding.txtName9.setText("Soepomo");
        binding.txtDescription9.setText("Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah, 22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun) adalah seorang pahlawan nasional Indonesia. Soepomo dikenal sebagai arsitek Undang-undang Dasar 1945, bersama dengan Muhammad Yamin dan Soekarno.");
        // Data Tan Malaka
        binding.imgPhoto10.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.tan_malaka));
        binding.txtName10.setText("Tan Malaka");
        binding.txtDescription10.setText("Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang, Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung, Kediri, Jawa Timur, 21 Februari 1949 pada umur 51 tahun) adalah seorang pembela kemerdekaan Indonesia, tokoh Partai Komunis Indonesia, juga pendiri Partai Murba, dan merupakan salah satu Pahlawan Nasional Indonesia.");
    }
}