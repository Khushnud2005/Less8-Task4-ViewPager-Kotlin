package uz.exemple.less8_task4_kotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.exemple.less8_task4_kotlin.fragments.FirstFragment
import uz.exemple.less8_task4_kotlin.fragments.SecondFragment
import uz.exemple.less8_task4_kotlin.fragments.ThirdFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{FirstFragment()}
            1->{
                SecondFragment()
            }
            2->{
                ThirdFragment()
            }
            else->{FirstFragment()}
        }
    }


}