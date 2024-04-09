package com.example.Retrofetch;
import com.example.Retrofetch.Retrofetch;
import com.example.Retrofetch.apicall;


import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class Retrofetch {
    private static final String api_link="https://newsapi.org/";
    
    
    
    @Singleton
    @Provides
    public  apicall getApi(){
          return new Retrofit.Builder().baseUrl(api_link)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(apicall.class);
        }
        
    }
    

