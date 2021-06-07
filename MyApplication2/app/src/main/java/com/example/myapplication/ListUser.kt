package com.example.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ListUser : AppCompatActivity(), InterfaceMVP.ViewUser{
    private var editEmail: EditText? = null
    private var editPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)
    }
    override fun ListUser() {


}
}