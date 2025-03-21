package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(Long postId, Long CommentId);

    CommentDto  updateComment(long postId, long commentId, CommentDto commentRequest);

    void deleteCommentById(long postId, long commentId);

}
