package com.jauhari.androidrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.jauhari.androidrecyclerview.domain.Pegawai
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHeroes = listOf(
                Pegawai(nip="197711212006041005", name = "Jauhari Ahmad", jabatan="Pranata Komputer Penyelia", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197711212006041005.jpg"),
                Pegawai(nip="197812122006041004", name = "Malik", jabatan="Pranata Komputer Penyelia",  image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197803152006041011.jpg"),
                Pegawai(nip="198310101006042001", name = "Anita", jabatan="Pranata Komputer Penyelia",   image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/198304192006042006.jpg"),
                Pegawai(nip="197602022006041001", name = "Tahuchid", jabatan="Analis Data",  image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197603161997031005.jpg"),
                Pegawai(nip="198001012006041007", name = "Henry", jabatan="Pengolah Data",  image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/198208222005011004.jpg")

        )

        val heroesAdapter = PegawaiAdapter(listHeroes) { hero ->
            Toast.makeText(this, "Informasi detail tentang  ${hero.name}", Toast.LENGTH_SHORT).show()
        }

        rvMain.apply {
            //            layoutManager = GridLayoutManager(this@MainActivity, 3)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = heroesAdapter
        }
    }

}
