package io.htueko.thegorgeouslogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentManger: FragmentManager = supportFragmentManager
    private val fragmentTransaction = fragmentManger.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        viewPager_main.adapter = fragmentAdapter
        tab_layout_main.setupWithViewPager(viewPager_main)

    }

}

