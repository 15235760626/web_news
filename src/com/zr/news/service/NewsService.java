package com.zr.news.service;

import com.zr.news.dao.NewsDao;
import com.zr.news.dao.daoimpl.NewsDaoImpl;
import com.zr.news.entity.News;
import com.zr.news.entity.NewsType;
import com.zr.news.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class NewsService {


    private NewsDao dao = new NewsDaoImpl();

    public List<News> findImageNews(){
        return dao.findImageNews();
    }
    public News findHeadNews(){
        News headNews = dao.findHeadNews();
        String context = headNews.getContext();
        String text = StringUtil.html2Text(context);
        if (text.length()>=40){
            headNews.setContext(text.substring(0,40));
        }else{
            headNews.setContext(text);
        }
        return headNews;
    }
    public List<News> findNewNews(){
        return dao.findNewNews();

    }
    public List<News> findHotNews(){
        return dao.findHotNews();
    }
    public List<List<News>> findNewsByType(){
        List<List<News>> listnewsLists = new ArrayList<>();
        NewsTypeService service = new NewsTypeService();
        List<NewsType> typeList = service.findAll();
        for (NewsType newsType: typeList) {
            List<News> newsList = dao.findNewsByType(newsType.getTypeId());
            listnewsLists.add(newsList);
        }
        return listnewsLists;
    }
}
