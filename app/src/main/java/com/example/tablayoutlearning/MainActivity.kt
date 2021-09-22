package com.example.tablayoutlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayoutlearning.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         setUpTabs()
    }
    private fun setUpTabs(){
        val adapters = ViewPagerAdapter(supportFragmentManager)
        adapters.addFragment(HomeFragment() , "Home")
        adapters.addFragment(DeshboardFragment() , "Dashboard")
        adapters.addFragment(SettingsFragment() , "Settings")
        viewPager.adapter = adapters
        tabBar.setupWithViewPager(viewPager)
        tabBar.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home)
        tabBar.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_dashboard)
        tabBar.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_setting)

    }
}