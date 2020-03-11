package com.example.testviewpager2

import android.util.Log
import android.view.View
import androidx.viewpager2.widget.ViewPager2

class ViewPager2PageTransformation : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val absPos = Math.abs(position)
        page.apply {
            translationY = absPos * 500f
            translationX = absPos * 300f
            scaleX = 1f
            scaleY = 1f
        }
        when {
            position < -1 ->
                page.alpha = 0.1f
            position <= 1 -> {
                page.alpha = Math.max(0.2f, 1- absPos)
                Log.i("$position", "${page.alpha}")
            }
            else -> page.alpha = 0.1f
        }
    }
}