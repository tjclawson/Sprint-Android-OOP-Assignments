package com.example.designpatterns.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.designpatterns.R
import com.example.designpatterns.databinding.ActivityLoginBinding
import com.example.designpatterns.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //this binds the view, gets the variable
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        binding.viewModel = LoginViewModel()
        binding.executePendingBindings()
    }

    companion object {
        @BindingAdapter("toastMessage")
        @JvmStatic
        fun showToast(view: View, message: String?) {
            message?.let {
                Toast.makeText(view.context, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
