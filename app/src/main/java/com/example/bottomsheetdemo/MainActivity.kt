package com.example.bottomsheetdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheetdemo.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val modalBottomSheet = ModalBottomSheet()

        binding.LoginBottomSheetButton.setOnClickListener {
            modalBottomSheet.show(supportFragmentManager, ModalBottomSheet.TAG)
        }*/

        BottomSheetBehavior.from(binding.myBottomS).apply {
            peekHeight = 200
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}