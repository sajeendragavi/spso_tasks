package com.news.demo.controller;

import com.news.demo.model.News;
import com.news.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @PostMapping
    public News createNews(@RequestBody News news){
        return newsService.saveNews(news);
    }

    @GetMapping
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

}
