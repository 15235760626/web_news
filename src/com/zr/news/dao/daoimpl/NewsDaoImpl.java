package com.zr.news.dao.daoimpl;

import com.zr.news.dao.NewsDao;
import com.zr.news.entity.News;
import com.zr.news.fromework.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class NewsDaoImpl implements NewsDao {
    @Override
    public List<News> findAll() {
        return null;
    }

    @Override
    public List<News> findImageNews() {

        String sql = "select *from  news where is_image=1 order by publish_date desc limit 0,4 ";
        return getNewsList(sql);
    }

    @Override
    public News findHeadNews() {
        String sql = "select *from  news order by publish_date desc";
        return getNewsList(sql).get(0);
    }

    @Override
    public List<News> findNewNews() {
        String sql = "select *from  news order by publish_date desc limit 0,8";
        return getNewsList(sql);
    }

    @Override
    public List<News> findHotNews() {
        String sql = "select *from  news where is_hot=1 order by publish_date desc limit 0,8";
        return getNewsList(sql);
    }

    @Override
    public List<News> findNewsByType( int typeId) {
        String sql = "select *from  news where type_id="+typeId+" order by publish_date desc limit 0,8 ";


        return getNewsList(sql);
    }


    public List<News> getNewsList(String sql) {
        List<News> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = JdbcUtils.getConnection();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int news_id = rs.getInt("news_id");
                String title = rs.getString("title");
                String context = rs.getString("context");
                String author = rs.getString("author");
                int type_id = rs.getInt("type_id");
                Date publish_date = rs.getDate("publish_date");
                int is_image = rs.getInt("is_image");
                String image_url = rs.getString("image_url");
                int click = rs.getInt("click");
                int is_hot = rs.getInt("is_hot");

                News news = new News(news_id,title,context,author,type_id,publish_date,is_image,image_url,click,is_hot);

                list.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs!=null)rs.close();
                if (ps!=null)ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            JdbcUtils.close();

        }
        return list;
    }
}
