package com.example.recyclerviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.Retrofetch.Articles;
import com.example.movieapp.databinding.LayoutNewsBinding;
import com.example.recyclerviewadapter.recyclerAdapter;
import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.Holder> {
    private Context c;
    private List<Articles> data;

    public recyclerAdapter(Context c, List<Articles> data) {
        this.c = c;
        this.data = data;
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView title, author;
        ImageView img;

        public Holder(LayoutNewsBinding bind) {
            super(bind.getRoot());
            title = bind.title;
            author = bind.Author;
            img = bind.imageView;
        }
    }

    
    @Override
    public Holder onCreateViewHolder(ViewGroup arg0, int arg1) {
        return new recyclerAdapter.Holder(LayoutNewsBinding.inflate(LayoutInflater.from(c),arg0,false));
    }

    @Override
    public void onBindViewHolder(Holder arg0, int arg1) {
      
        Articles article = data.get(arg1);
        if(article!=null)
           arg0.author.setText(article.getAuthor());
           arg0.title.setText(article.getTitle());
           Glide.with(c).load(article.getUrlToImage()).into(arg0.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    
    
}
