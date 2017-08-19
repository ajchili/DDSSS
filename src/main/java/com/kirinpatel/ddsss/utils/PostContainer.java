package com.kirinpatel.ddsss.utils;

import java.util.ArrayList;

public class PostContainer {

    private ArrayList<Post> posts = new ArrayList<>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
}
