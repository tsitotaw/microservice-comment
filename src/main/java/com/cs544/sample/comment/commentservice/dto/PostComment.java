package com.cs544.sample.comment.commentservice.dto;

import com.cs544.sample.comment.commentservice.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostComment {
    private Post post;
    private Comment comment;
}
