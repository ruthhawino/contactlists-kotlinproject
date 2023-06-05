package com.example.contactlist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactlist2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var name1=ContactData("Karen aluoch","0728374618","karen@gmail.com","")
        var name2 =ContactData("Ruth awino","0728374618","ruth@gmail.com","")
        var name3=  ContactData("Mercy akoth","0728374618","mercy@gmail.com","")
        var name4=ContactData("Janet  neema","0728374618","janet@gmail.com","")
        var name5= ContactData("Atieno  cynthia","0728374618","atieno@gmail.com","")
        var name6= ContactData("Sheryl  akinyi","0728374618","sheryl@gmail.com","")
        var name7= ContactData("Barack ouma","0728374618","brack@gmail.com","")
        var name8= ContactData("Naomi awuor","0728374618","naomi@gmail.com","")
        var name9= ContactData("Daniel ooko","0728374618","daniel@gmail.com","")
        var name10= ContactData("Lase Otieno","0728374618","atieno@gmail.com","")






        var names = listOf(name1,name2,name3,name4,name5,name6,name7,name8,name9,name10)
        val contactAdapter=ContactAdapter(names)
        binding.rvCont1.layoutManager =LinearLayoutManager(this)
        binding.rvCont1.adapter= contactAdapter
    }
}