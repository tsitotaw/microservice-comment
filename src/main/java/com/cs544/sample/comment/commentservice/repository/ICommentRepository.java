package com.cs544.sample.comment.commentservice.repository;

import com.cs544.sample.comment.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends JpaRepository<Comment, Long> {

}
