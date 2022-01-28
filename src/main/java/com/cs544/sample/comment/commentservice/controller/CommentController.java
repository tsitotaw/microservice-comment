package com.cs544.sample.comment.commentservice.controller;

import com.cs544.sample.comment.commentservice.dto.PostComment;
import com.cs544.sample.comment.commentservice.model.Comment;
import com.cs544.sample.comment.commentservice.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @GetMapping("/{id}")
    public PostComment getCommentById(@PathVariable("id") Long commentId){
        return this.commentService.getCommentById(commentId);
    }

    @GetMapping("/")
    public List<Comment> getAllComments(){
        return this.commentService.getAll();
    }

    @PostMapping("/")
    public Comment saveComment(@RequestBody Comment comment){
        return this.commentService.saveComment(comment);
    }
}
