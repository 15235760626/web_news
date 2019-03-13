package com.zr.news.fromework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class JdbcUtils {

    private static String driverClassName ="com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql:///newsdb?serverTimezone=UTC";
    private static String user = "root";
    private static String password = "123";
    private static Connection connection;

        public static Connection getConnection(){

            try {
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(url,user,password);
                return connection;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static void close(){
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

//        public static void main(String[] args) {
//
//            System.out.println(getConnection());
//
//
//        }




}
