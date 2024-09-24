package com.news.demo.service;

import com.news.demo.model.News;
import com.news.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public News saveNews(News news){
        return newsRepository.save(news);
    }

    public List<News> getAllNews(){
        return newsRepository.findAll();
    }

}
