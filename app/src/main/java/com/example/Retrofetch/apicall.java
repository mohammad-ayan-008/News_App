package com.example.Retrofetch;
import com.example.Retrofetch.modelClass;
import io.reactivex.Observable;
import retrofit2.http.GET;

public  interface apicall {
    @GET("v2/top-headlines?apiKey=c413f72d21c04e9ebae9d8b86b2bc859&pageSize=50&country=in")
    Observable<modelClass> getData();
}

