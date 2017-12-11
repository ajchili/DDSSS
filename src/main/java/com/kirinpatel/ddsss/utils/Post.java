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

    Post(POST_TYPE type) {
        this.type = type;
        loadPost();
    }

    private void loadPost() {
        switch (type) {
            case ERROR:
                break;
            case FACEBOOK:
                setHtml(PostPuller.getFacebookPost());
                break;
            case TWITTER:
                setHtml(PostPuller.getTwitterPost());
                break;
            case INSTAGRAM:
                setHtml(PostPuller.getInstagramPost());
                break;
            case SOUNDCLOUD:
                break;
            case MIXCLOUD:
                break;
            default:
                break;
        }
    }

    private void setHtml(String html) {
        this.html = html;
    }

    public POST_TYPE getType() {
        return type;
    }

    public String getHtml() {
        return html;
    }
}
