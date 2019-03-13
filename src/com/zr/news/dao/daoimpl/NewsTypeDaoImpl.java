package com.zr.news.dao.daoimpl;


import com.zr.news.dao.NewsTypeDao;
import com.zr.news.entity.NewsType;
import com.zr.news.fromework.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class NewsTypeDaoImpl implements NewsTypeDao {
    @Override
    public List<NewsType> findAll() {
        List<NewsType> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql ="select *from news_type";
        Connection con = JdbcUtils.getConnection();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){

                NewsType newsType = new NewsType();

                int type_id = rs.getInt("type_id");
                String type_name = rs.getString("type_name");

                newsType.setTypeId(type_id);
                newsType.setTypeName(type_name);

                list.add(newsType);

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
