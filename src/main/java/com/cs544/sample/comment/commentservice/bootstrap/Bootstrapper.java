package com.cs544.sample.comment.commentservice.bootstrap;

import com.cs544.sample.comment.commentservice.model.Comment;
import com.cs544.sample.comment.commentservice.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements CommandLineRunner {
    @Autowired
    private ICommentService commentService;

    @Override
    public void run(String... args) throws Exception {
        this.commentService.saveComment(new Comment(null,"My First Post", 1L));
        this.commentService.saveComment(new Comment(null,"My Second Post", 2L));
    }
}
