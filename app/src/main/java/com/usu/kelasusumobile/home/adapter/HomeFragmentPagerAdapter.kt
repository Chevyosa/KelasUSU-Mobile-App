package com.usu.kelasusumobile.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.usu.kelasusumobile.home.Tab1Fragment
import com.usu.kelasusumobile.home.Tab2Fragment

class HomeFragmentPagerAdapter (
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
):FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        val fragment : Fragment = when (position){
            0 -> {
                Tab1Fragment()
            }
            1 -> {
                Tab2Fragment()
            }
            else -> {
                Fragment()
            }
        }
        return Fragment()
    }
}