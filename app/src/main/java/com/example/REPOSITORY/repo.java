package com.example.REPOSITORY;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.example.Retrofetch.Retrofetch;
import com.example.Retrofetch.apicall;
import com.example.Retrofetch.modelClass;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Inject;

public class repo {
    
    private apicall call;
    private  CompositeDisposable dispose= new CompositeDisposable();
   
    @Inject
    public repo(apicall apicall){
       call= apicall;
    }
    
    public MutableLiveData<modelClass> getData(){
         MutableLiveData data= new MutableLiveData();
         
         dispose.add(call.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(sets->{
                data.setValue(sets);
            },throwable->{
                Log.e("daya",throwable.getLocalizedMessage());
            }
        ));
        
        return data;
    }
}
