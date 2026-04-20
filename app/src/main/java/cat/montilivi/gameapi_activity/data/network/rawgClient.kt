package cat.montilivi.gameapi_activity.data.network

import com.google.gson.GsonBuilder
import com.google.gson.Strictness
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object rawgClient {
    const val API_KEY = "125364aa794245d68a9f5a1221d37dcb";
    const val BASE_URL = "https://api.rawg.io/api/"
    const val BASE_URL_IMG = "https://media.rawg.io/media/games/"


    val gsonConverter = GsonBuilder()
        .setStrictness(Strictness.LENIENT)
        .create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gsonConverter))
        .build()

    val service = retrofit.create(RAWGService::class.java)
}