package com.example.Retrofetch;

public class Articles {
        public String author;
        public String title;
        public String url;
        public String urlToImage;
        public String content;

        public Articles(
                String author, String title, String url, String urlToImage, String content) {
            this.author = author;
            this.title = title;
            this.url = url;
            this.urlToImage = urlToImage;
            this.content = content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return this.urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }