package ir.arcademy.blog.modules.posts.controller;

import ir.arcademy.blog.modules.posts.model.Posts;
import ir.arcademy.blog.modules.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import ir.arcademy.blog.modules.posts.model.Posts;
import ir.arcademy.blog.modules.posts.service.PostsService;
import ir.arcademy.blog.modules.users.model.Users;
import ir.arcademy.blog.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {


    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public @ResponseBody
    List<Posts> getPosts() {
        return postsService.findAllPosts();
    }

    @RequestMapping(value = "/rest", method = RequestMethod.POST)
    public @ResponseBody Posts registerPost(@RequestBody Posts posts) {
    return postsService.registerPost(posts);
    }


}