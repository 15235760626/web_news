package com.zr.news.dao.daoimpl;





import com.zr.news.dao.LinkDao;
import com.zr.news.entity.Link;
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
public class LinkDaoImpl implements LinkDao {

    @Override
    public List<Link> findAll() {
        List<Link> list = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql ="select * from link ";
        Connection con = JdbcUtils.getConnection();

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){

                Link link = new Link();

                int link_id = rs.getInt("link_id");
                String link_name = rs.getString("link_name");
                String email = rs.getString("email");
                String link_url = rs.getString("link_url");
                int link_order = rs.getInt("link_order");

                link.setLinkId(link_id);
                link.setLinkName(link_name);
                link.setEmil(email);
                link.setLinkUrl(link_url);
                link.setLinkOrder(link_order);

                list.add(link);

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
