package com.ll.domain.post.post.service;

import com.ll.domain.post.post.repository.PostRepository;
import com.ll.framework.ioc.ApplicationRunner;
import com.ll.framework.ioc.annotations.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final ApplicationRunner initDataAll;
}
