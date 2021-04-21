package me.san.api.service

import me.san.api.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductService {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}