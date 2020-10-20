package com.jauhari.androidrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jauhari.androidrecyclerview.domain.Pegawai
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_pegawai.view.imgHeroes
import kotlinx.android.synthetic.main.item_pegawai.view.txtHeroName
import kotlinx.android.synthetic.main.item_pegawai.view.txtNIP
import kotlinx.android.synthetic.main.item_pegawai.view.txtJabatan

class PegawaiAdapter(private val pegawais: List<Pegawai>,
                     private val adapterOnClick: (Pegawai) -> Unit) : RecyclerView.Adapter<PegawaiAdapter.HeroHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HeroHolder {
        return HeroHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_pegawai, viewGroup, false))
    }

    override fun getItemCount(): Int = pegawais.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.bindHero(pegawais[position])
    }

    inner class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindHero(pegawai: Pegawai) {
            itemView.apply {
                txtHeroName.text = pegawai.name
                txtNIP.text = pegawai.nip
                txtJabatan.text = pegawai.jabatan
                Picasso.get().load(pegawai.image).into(imgHeroes)

                setOnClickListener {
                    adapterOnClick(pegawai)
                }
            }
        }
    }
}