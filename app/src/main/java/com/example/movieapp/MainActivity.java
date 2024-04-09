
package com.example.movieapp;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.Retrofetch.Articles;
import com.example.VIEWMODLE.mainviewmodle;
import com.example.movieapp.databinding.ActivityMainBinding;
import com.example.movieapp.databinding.LayoutMainViewBinding;
import com.example.movieapp.databinding.LayoutNewsBinding;
import com.example.recyclerviewadapter.recyclerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.jakewharton.rxbinding2.widget.RxTextView;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private LayoutMainViewBinding binding;
    private mainviewmodle vm;
    private RecyclerView rv;
    private recyclerAdapter adapter;
    private List<Articles> articles= new ArrayList<>();
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = LayoutMainViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        rv =binding.recyclerView;
        rv.setLayoutManager(new LinearLayoutManager(this));
       
        
     
     
        vm = new ViewModelProvider(this).get(mainviewmodle.class);
      
      
        vm.getLiveData().observe(this,x->{
             adapter = new recyclerAdapter(getApplicationContext(),x.getArticles());
             rv.setAdapter(adapter);
             adapter.notifyDataSetChanged();
            Toast.makeText(getApplicationContext(),x.getArticles().get(0).getAuthor(),0).show();
        });
        
     
    }
    
    
    
   
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
     //   this.binding = null;
    }
}
