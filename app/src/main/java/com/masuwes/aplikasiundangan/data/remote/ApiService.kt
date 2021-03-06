package com.masuwes.aplikasiundangan.data.remote

import com.masuwes.aplikasiundangan.data.model.CheckCouponResponse
import com.masuwes.aplikasiundangan.data.model.GuestResponse
import com.masuwes.aplikasiundangan.data.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("api/coupon/list")
    suspend fun getCouponList() : Response<GuestResponse>

    @FormUrlEncoded
    @POST("api/coupon/check")
    suspend fun postCouponCheck(
        @Field("coupon") coupon: String
    ) : Response<CheckCouponResponse>

    @FormUrlEncoded
    @POST("api/login")
    suspend fun login(
        @Field("email") email: String
    ) : Response<LoginResponse>

}