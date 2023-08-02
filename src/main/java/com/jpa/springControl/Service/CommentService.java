package com.jpa.springControl.Service;

import com.jpa.springControl.Repository.CommentRepository;
import com.jpa.springControl.domain.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {

    private final CommentRepository commentRepository;



}
