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
        var name1=ContactData("Karen aluoch","0728374618","karen@gmail.com","https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8YmxhY2twZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var name2 =ContactData("Ruth awino","0728374618","ruth@gmail.com","https://media.istockphoto.com/id/1208585275/photo/profile-of-a-serene-young-woman.webp?b=1&s=170667a&w=0&k=20&c=b0YisufDREAYdpfFBhuBHFkohw58QW-CpCIUX4LsGmY=")
        var name3=  ContactData("Mercy akoth","0728374618","mercy@gmail.com","https://media.istockphoto.com/id/1142434150/photo/stylish-afro-girl-with-red-braided-hair-dancing-and-shaking-head.webp?b=1&s=170667a&w=0&k=20&c=hgAG7VkVIKFJV8Bg_K4ORh1BFoY8U4C36x1oxoAgqeo=")
        var name4=ContactData("Janet  neema","0728374618","janet@gmail.com","https://media.istockphoto.com/id/1347495860/photo/african-american-man-wearing-glasses-side-view.webp?b=1&s=170667a&w=0&k=20&c=xlAkb_WWKsfX5lyTcCH0MZ4Z6ci0QahkB-FS4RZfRM4=")
        var name5= ContactData("Atieno  cynthia","0728374618","atieno@gmail.com","https://media.istockphoto.com/id/1465454175/photo/portrait-of-beautiful-black-millennial-entrepreneur-woman-with-an-afro-hairstyle-and-looking.jpg?s=612x612&w=0&k=20&c=jtvDUfJGhxlT6S5vCgdhe7NNeOfCM4n4rmjvUuZGfWk=")
        var name6= ContactData("Sheryl  akinyi","0728374618","sheryl@gmail.com","https://media.istockphoto.com/id/938709362/photo/portrait-of-a-girl.jpg?s=612x612&w=0&k=20&c=UQGXpeiLrI78nO1B9peUn0D0fCSRrm-J8xohMWG2Lms=")
        var name7= ContactData("Barack ouma","0728374618","brack@gmail.com","https://media.istockphoto.com/id/1351285381/photo/happy-young-african-american-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=e6sawVkyC7t_NTsFb13RWnLq4b9CYon4TJODpS2WU4I=")
        var name8= ContactData("Naomi awuor","0728374618","naomi@gmail.com","https://media.istockphoto.com/id/1311634222/photo/portrait-of-successful-black-male-modern-day-student-holding-smartphone.jpg?s=612x612&w=0&k=20&c=vl2FeMtO91rpRUcq0reIfqAQPrQsf30JF-JAxU5baro=")
        var name9= ContactData("Daniel ooko","0728374618","daniel@gmail.com","https://media.istockphoto.com/id/1338767515/photo/proud-african-woman-smiling-profile-of-successful-businesswoman-in-red-suit-excited-touching.jpg?s=612x612&w=0&k=20&c=51pi7rGUJps8sfEWtNDfKVw3rHxE_qCNkEFcUXyZ9cI=")
        var name10= ContactData("Lase Otieno","0728374618","atieno@gmail.com","https://media.istockphoto.com/id/1208585275/photo/profile-of-a-serene-young-woman.jpg?s=612x612&w=0&k=20&c=GU_NrBvXEiKL8GDe6MIVmx_M3xzwMKzjJ27RI0rHmw8=")






        var names = listOf(name1,name2,name3,name4,name5,name6,name7,name8,name9,name10)
        val contactAdapter=ContactAdapter(names)
        binding.rvCont1.layoutManager =LinearLayoutManager(this)
        binding.rvCont1.adapter= contactAdapter
    }
}