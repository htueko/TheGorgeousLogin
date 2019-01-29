package io.htueko.thegorgeouslogin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ExistingFragment()
            1 -> NewFragment()
            else -> ExistingFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Existing"
            1 -> "New"
            else -> {
                return "Unknown"
            }
        }
    }

}