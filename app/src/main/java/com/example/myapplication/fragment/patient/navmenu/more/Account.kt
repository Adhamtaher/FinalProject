package com.example.myapplication.fragment.patient.navmenu.more

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAccountBinding

class Account : Fragment() {
        private lateinit var binding: FragmentAccountBinding

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?
        ): View? {
            binding = FragmentAccountBinding.inflate(inflater, container, false)
            binding.Username.isEnabled = false
            binding.Email.isEnabled = false
            binding.Password.isEnabled = false
            binding.City.isEnabled = false
            binding.Address.isEnabled = false
            binding.Birthday.isEnabled = false
            binding.PhoneNo.isEnabled = false

            binding.editBtn.setOnClickListener {
                if (binding.editBtn.isChecked) {
                    binding.Username.isEnabled = true
                    binding.Email.isEnabled = true
                    binding.Password.isEnabled = true
                    binding.City.isEnabled = true
                    binding.Address.isEnabled = true
                    binding.Birthday.isEnabled = true
                    binding.PhoneNo.isEnabled = true
                }
            }

            binding.backButton.setOnClickListener {
                findNavController().navigate(R.id.action_account_to_more)
            }

            return binding.root
        }

    }