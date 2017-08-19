package com.kirinpatel.ddsss.spring.controllers;

import com.kirinpatel.ddsss.utils.Post;
import com.kirinpatel.ddsss.utils.PostContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(path= "/")
    public String loadIndex(ModelMap map) {
        map.addAttribute("postContainer", loadPosts());
        return "index";
    }

    private PostContainer loadPosts() {
        PostContainer postContainer = new PostContainer();
        postContainer.addPost(new Post(Post.POST_TYPE.FACEBOOK));
        postContainer.addPost(new Post(Post.POST_TYPE.TWITTER));
        for (int i = 0; i < postContainer.getPosts().size(); i++) {
            Post post = postContainer.getPosts().get(i);
            switch (post.getType()) {
                case FACEBOOK:
                    post.setHtml("<p>POOPY</p>");
                    break;
                case TWITTER:
                    break;
            }
        }
        return postContainer;
    }
}
