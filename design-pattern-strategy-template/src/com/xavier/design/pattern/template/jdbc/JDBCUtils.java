package com.xavier.design.pattern.template.jdbc;

import java.sql.*;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:45
 * @Description TODO
 */
public class JDBCUtils {
    private static String url = "jdbc:mysql://localhost:3306/jdbcstudy";
    private static String user = "root";
    private static String password = "123456";

    private JDBCUtils() {
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void free(ResultSet rs, PreparedStatement ps, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
