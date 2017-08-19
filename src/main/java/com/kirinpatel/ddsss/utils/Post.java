package com.kirinpatel.ddsss.utils;

public class Post {

    private POST_TYPE type;
    private String html;

    public enum POST_TYPE {
        ERROR(0),
        FACEBOOK(1),
        TWITTER(2),
        INSTAGRAM(3),
        SOUNDCLOUD(4),
        MIXCLOUD(5);

        private int postId;

        POST_TYPE(int postId) {
            this.postId = postId;
        }

        public int getPostId() {
            return postId;
        }
    }

    public Post(POST_TYPE type) {
        this.type = type;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public POST_TYPE getType() {
        return type;
    }

    public String getHtml() {
        return html;
    }
}
