package com.eroglu.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.eroglu.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.pikachu1,
            R.drawable.pikachu2,
            R.drawable.pikachu3,
            R.drawable.pikachu4,
            R.drawable.pikachu5,
            R.drawable.pikachu6,
            R.drawable.pikachu7,
            R.drawable.pikachu8,
            R.drawable.pikachu9,
            R.drawable.pikachu10,
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter
//        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL // Yukarıdan aşağıya kaydırma

        binding.viewPager.beginFakeDrag() //sahte bir sürükleme işlemini başlatır.
        binding.viewPager.fakeDragBy(-10f) //belirli bir mesafe kadar sürüklemeyi sağlar.
        binding.viewPager.endFakeDrag()
    }
}