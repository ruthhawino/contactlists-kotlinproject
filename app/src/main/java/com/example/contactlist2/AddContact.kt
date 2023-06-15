package com.example.contactlist2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactlist2.databinding.ActivityAddContactBinding

class AddContact : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val name = binding.etName1.text.toString()
        val name2 = binding.etame2.text.toString()
        val phoneNumber = binding.etPhone.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (name.isEmpty()) {
            binding.tillName1.error = "First Namerequired"
//            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name.isEmpty()) {
            binding.tillName2.error = "Last Name required"
//            Toast.makeText(this, "Please enter first name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name2.isEmpty()) {
            binding.tillEmail.error = "Password required"
//            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (email.isEmpty()) {
            binding.tillPhone.error = "Phone Number required"
//            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (!error) {
            val intent = Intent(this, AddContact::class.java)
            startActivity(intent)
        }
        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}