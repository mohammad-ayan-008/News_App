package com.example.Retrofetch;

import com.example.Retrofetch.Articles;
import java.util.List;

public class modelClass {
    public String status;
    public List<Articles> articles;

    public modelClass(String status, List<Articles> articles) {
        this.status = status;
        this.articles = articles;
    }

    

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Articles> getArticles() {
        return this.articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
