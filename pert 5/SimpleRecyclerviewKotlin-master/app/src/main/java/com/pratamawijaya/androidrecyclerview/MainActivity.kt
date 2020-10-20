package com.pratamawijaya.androidrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.pratamawijaya.androidrecyclerview.domain.Hero
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHeroes = listOf(
                Hero(name = "Jauhari Ahmad", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197711212006041005.jpg"),
                Hero(name = "Malik", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197803152006041011.jpg"),
                Hero(name = "Anita", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/198304192006042006.jpg"),
                Hero(name = "Tahuchid", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/197603161997031005.jpg"),
                Hero(name = "Henry", image = "https://skp.kulonprogokab.go.id/production/imageserve.php?image=http://simasneg.kulonprogokab.go.id/simasneg/foto/198208222005011004.jpg")

        )

        val heroesAdapter = HeroAdapter(listHeroes) { hero ->
            Toast.makeText(this, "hero clicked ${hero.name}", Toast.LENGTH_SHORT).show()
        }

        rvMain.apply {
            //            layoutManager = GridLayoutManager(this@MainActivity, 3)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = heroesAdapter
        }
    }

}
