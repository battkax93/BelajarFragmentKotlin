package sunny.belajarfragmentkotlin.rest.StackRest

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class StackRestApi2 {
    private val gson = GsonBuilder().create()!!
    private val retrofit: Retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(sunny.belajarfragmentkotlin.BuildConfig.BASE_URL2)
            .build()

    val services: StackRest2 = retrofit.create(StackRest2::class.java)
}