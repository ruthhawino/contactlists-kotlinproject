package com.example.contactlist2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist2.databinding.ContactListItemsBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class ContactAdapter(private var contactData: List<ContactData>): RecyclerView.Adapter<ContactAdapter.ContactsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
            val binding =ContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ContactsViewHolder(binding)
        }
        override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
            val currentContact = contactData[position]
            val binding=holder.binding
            binding.ivContact.tag =currentContact.image
            binding.ivEmail.text=currentContact.emailAddress
            binding.tvName.text=currentContact.name
            binding.tvNumber.text =currentContact.phoneNumber
            Picasso.get()
                .load(currentContact.image)
                .resize(90,90)
                .centerInside()
                .transform(CropCircleTransformation())
                .into(binding.ivContact)


        }
        override fun getItemCount(): Int {
            return  contactData.size
        }
        class ContactsViewHolder(var binding:ContactListItemsBinding): RecyclerView.ViewHolder(binding.root)
    }

