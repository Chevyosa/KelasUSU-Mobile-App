package com.usu.kelasusumobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.usu.kelasusumobile.databinding.ActivityMainBinding
import com.usu.kelasusumobile.home.adapter.RecyclerSubjectAdapter
import com.usu.kelasusumobile.home.data.SubjectDataClass

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<SubjectDataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageList = arrayOf(
            R.drawable.computergraphics_ic,
            R.drawable.researchmethod_ic,
            R.drawable.ai_ic,
            R.drawable.sp_ic
        )
        titleList = arrayOf(
            "Computer Graphics",
            "Research Method",
            "Artificial Intelligence",
            "Software Project"
        )

        recyclerView = findViewById(R.id.recyler_subject)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<SubjectDataClass>()
        getData()

        val navView: BottomNavigationView = binding.bottomNav
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }

    private fun getData(){
        for (i in imageList.indices){
            val subjectDataClass = SubjectDataClass(imageList[i], titleList[i])
            dataList.add(subjectDataClass)
        }
        recyclerView.adapter = RecyclerSubjectAdapter(dataList)
    }
}