package com.elang.uas_dwh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        var actionBar = getSupportActionBar()
        actionBar!!.title = "Hasil Prediksi"
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val intent = intent
        var tanggal =intent.getStringExtra("tanggal")
        var bulan =intent.getStringExtra("bulan")
        var tahun =intent.getStringExtra("tahun")
        var hasil = intent.getStringExtra("hasil")

        tvTanggal.text = tanggal + "/" + bulan + "/" + tahun
        tvHasilPrediksi.text = hasil.toString()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}