package com.gvstang.dicoding.latihan.anjay

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import com.google.android.material.carousel.CarouselLayoutManager
import com.gvstang.dicoding.latihan.anjay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupCarousel()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setupCarousel() {
        val data = ArrayList<Carousel>()
        data.add(
            Carousel(
                resources.getDrawable(R.drawable.img_kobo),
                "Kobo"
            )
        )
        data.add(Carousel(
            resources.getDrawable(R.drawable.img_big),
            "Onta"
        ))
        data.add(
            Carousel(
                resources.getDrawable(R.drawable.img_kobo),
                "Kobo"
            )
        )
        data.add(Carousel(
            resources.getDrawable(R.drawable.img_big),
            "Onta"
        ))
        data.add(
            Carousel(
                resources.getDrawable(R.drawable.img_kobo),
                "Kobo"
            )
        )
        data.add(Carousel(
            resources.getDrawable(R.drawable.img_big),
            "Onta"
        ))
        binding.rvCarouselItem.layoutManager = CarouselLayoutManager()
        binding.rvCarouselItem.adapter = CarouselAdapter(data)
    }
}