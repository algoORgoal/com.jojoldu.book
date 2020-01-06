package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.Dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String
                                             name, //@RequestParam: 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션, 파라미터를 name에 저장
                                     @RequestParam("amount") int
                                             amount) {
        return new HelloResponseDto(name, amount);
    }
}


