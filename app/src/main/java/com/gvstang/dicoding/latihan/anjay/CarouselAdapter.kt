package com.gvstang.dicoding.latihan.anjay

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gvstang.dicoding.latihan.anjay.databinding.ItemCarouselBinding

class CarouselAdapter(private val data: ArrayList<Carousel>) :
    RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    private lateinit var binding: ItemCarouselBinding

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemCarouselBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        binding.apply {
            tvCarousel.text = data[position].title
//            imageView.setImageDrawable(holder.itemView.resources.getDrawable(R.drawable.img_kobo))
            Glide.with(holder.itemView)
                .load(data[position].image)
                .into(imageView)
        }
    }
}