package com.cs544.sample.comment.commentservice.service;

import com.cs544.sample.comment.commentservice.dto.PostComment;
import com.cs544.sample.comment.commentservice.dto.Post;
import com.cs544.sample.comment.commentservice.model.Comment;
import com.cs544.sample.comment.commentservice.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CommentService implements ICommentService{
    @Autowired
    private ICommentRepository commentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public PostComment getCommentById(Long commentId) {
        Comment comment = commentRepository.findById(commentId).get();
        Post post = restTemplate.getForObject("http://localhost:8081/posts/" + comment.getId(), Post.class);

        PostComment pcdto  = new PostComment();
        pcdto.setComment(comment);
        pcdto.setPost(post);

        return pcdto;
    }

    @Override
    public List<Comment> getAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment saveComment(Comment comment) {
        return this.commentRepository.save(comment);
    }
}
