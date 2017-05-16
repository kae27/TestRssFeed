package com.example.dell.testrssfeed;

import com.example.dell.testrssfeed.model.Rss;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Dell on 5/13/2017.
 */

public interface FeedApi
{
    String BASE_URL = "https://tmd.go.th/xml/";


    @GET("warning.php")
    Call<Rss> getRss();
}
