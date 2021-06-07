package com.example.myapplication

import android.util.Log
import javax.security.auth.callback.Callback
import okhttp3.OkHttpClient;
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
class LoginRepoModel: InterfaceMVP.ModelRepoImpl {
    override fun LoginModel(email: String, password: String) {
            val endpoint = RetofitDataRepo.create()
            endpoint.LoginSuccess(email,password).enqueue(object : Callback<List<ModelUser>> {
                override fun onResponse(
                    call: Call<List<ModelUser>>,
                    response: Response<List<ModelUser>>) {
                    if (response.isSuccessful) {

                    }
                }
                override fun onFailure(call: Call<List<ModelUser>>, error: Throwable) {
            }
        })
    }
}


}

}