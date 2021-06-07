package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), InterfaceMVP.ViewLogin{
    private var editEmail: EditText? = null
    private var editPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun Login(login : Boolean) {
        if (login){

            val intent = Intent(this, ListUser::class.java).apply {
                putExtra("EXTRA_MESSAGE", "login success")
            }
            startActivity(intent)
        }

}
}