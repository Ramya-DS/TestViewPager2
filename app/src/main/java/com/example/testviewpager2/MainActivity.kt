package com.example.testviewpager2

import android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = listOf(
            Category(1, "Your Recording"),
            Category(2, "Film"),
            Category(3, "Series"),
            Category(4, "Kids"),
            Category(5, "Sport")
        )
        val viewPager2=findViewById<ViewPager2>(R.id.viewPager2)
        viewPager2.adapter=ViewPagerAdapter(categories)
        viewPager2.setPageTransformer(ViewPager2PageTransformation())

//        val marginPageTransformer= MarginPageTransformer(20)

//        viewPager2.setPageTransformer(CompositePageTransformer().also {
//            it.addTransformer(marginPageTransformer)
//            it.addTransformer { page, position ->
//                page.apply {
//                    translationY = abs(position) * 500f
//                    scaleX = 1f
//                    scaleY = 1f
//                }
//            }
//        })

        with(viewPager2) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }

//        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
//        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)
//        viewPager2.setPageTransformer { page, position ->
//            val viewPager = page.parent.parent as ViewPager2
//            val offset = position * -(2 * offsetPx + pageMarginPx)
//            if (viewPager.orientation == ORIENTATION_HORIZONTAL) {
//                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
//                    page.translationX = -offset
//                } else {
//                    page.translationX = offset
//                }
//            } else {
//                page.translationY = offset
//            }
//        }

//        type 2
//        viewPager2.orientation=ViewPager2.ORIENTATION_VERTICAL



    }
}
