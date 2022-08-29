package uz.exemple.less8_task4_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.exemple.less8_task4_kotlin.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        viewPager = findViewById<ViewPager2>(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        viewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tabLayout,viewPager){tab,index ->
            tab.text = when(index){
                0->{"First"}
                1->{"Second"}
                2->{"Third"}
                else -> {"First"}
            }

        }.attach()
    }
}