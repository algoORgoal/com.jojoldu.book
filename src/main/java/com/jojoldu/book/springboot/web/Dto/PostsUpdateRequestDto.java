package com.jojoldu.book.springboot.web.Dto;

import com.jojoldu.book.springboot.domain.posts.Posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
