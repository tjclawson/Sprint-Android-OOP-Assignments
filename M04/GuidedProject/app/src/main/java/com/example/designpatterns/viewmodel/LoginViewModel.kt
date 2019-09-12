package com.example.designpatterns.viewmodel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

import com.example.designpatterns.model.User

class LoginViewModel : BaseObservable() {

    //if we were using a DB or API we would put this in an init block
    private val user: User = User("", "")
    private val successMessage = "Login Successful"
    private val failureMessage = "Login Failed"

    @Bindable
    var toastMessage: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.toastMessage)
        }

    //this allows the view to access the private val user without being able to change it
    @Bindable
    fun getUserEmail(): String? {
        return user.email
    }

    //same as above
    @Bindable
    fun getUserPassword(): String? {
        return user.password
    }

    fun onLoginClicked() {
        toastMessage = if (isValid()) {
            successMessage
        } else {
            failureMessage
        }
    }

    fun setUserEmail(email: String) {
        user.email = email
        notifyPropertyChanged(BR.userEmail)
    }

    fun setUserPassword(password: String) {
        user.password = password
        notifyPropertyChanged(BR.userPassword)
    }

    //checks if there is an email, if it matches the email pattern, and if password is at least 8 characters
    fun isValid(): Boolean {
        return !TextUtils.isEmpty(getUserEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
                (getUserPassword()?.length ?: 0) > 7
    }
}