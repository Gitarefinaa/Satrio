package com.example.myapplication

interface InterfaceMVP {
    interface ViewLogin{
    fun Login()
    }
    interface  ViewUser{
    fun ListUser()
    }
    interface ModelRepoImpl{
    fun LoginModel( email : String ,  password : String)
    }



    }