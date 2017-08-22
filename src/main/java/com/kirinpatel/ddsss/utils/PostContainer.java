package com.kirinpatel.ddsss.utils;

import java.util.ArrayList;

public class PostContainer {

    private ArrayList<Post> posts = new ArrayList<>();

    public PostContainer() {
        addPost(new Post(Post.POST_TYPE.FACEBOOK));
        addPost(new Post(Post.POST_TYPE.TWITTER));
        addPost(new Post(Post.POST_TYPE.SOUNDCLOUD));
        addPost(new Post(Post.POST_TYPE.MIXCLOUD));
        addPost(new Post(Post.POST_TYPE.INSTAGRAM));
    }

    private void addPost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
}
