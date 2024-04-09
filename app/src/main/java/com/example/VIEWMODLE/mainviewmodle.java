package com.example.VIEWMODLE;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.REPOSITORY.repo;
import com.example.Retrofetch.modelClass;
import com.example.VIEWMODLE.mainviewmodle;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@HiltViewModel
public class mainviewmodle extends ViewModel{
    private repo mainrepo;
    
    @Inject
    public mainviewmodle (repo repo){
        mainrepo= repo;
    }
    public mainviewmodle(){
        
    }
    
    public LiveData<modelClass> getLiveData(){
       return mainrepo.getData();
    }
}
