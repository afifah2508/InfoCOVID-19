package com.nida.idn.infocovid_19.api

import com.nida.idn.infocovid_19.model.IndonesiaResponse
import com.nida.idn.infocovid_19.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("Indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("Indonesia/Provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}