package com.cs544.sample.comment.commentservice.service;

import com.cs544.sample.comment.commentservice.dto.PostComment;
import com.cs544.sample.comment.commentservice.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICommentService {
    PostComment getCommentById(Long commentId);
    List<Comment> getAll();
    Comment saveComment(Comment comment);
}
