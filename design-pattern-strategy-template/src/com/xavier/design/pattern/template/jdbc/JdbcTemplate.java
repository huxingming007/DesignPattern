package com.xavier.design.pattern.template.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:45
 * @Description TODO
 */
public class JdbcTemplate {


    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 取连接
            connection = JDBCUtils.getConnection();
            // 创建语句集
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < values.length; i++) {
                preparedStatement.setObject(i + 1, values[i]);
            }
            // 执行语句集
            resultSet = preparedStatement.executeQuery();
            // 解析结果集
            List<Object> resultList = new ArrayList<>();
            int rowNum = 0;
            while (resultSet.next()) {
                resultList.add(rowMapper.mapRow(resultSet, rowNum++));
            }
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.free(resultSet, preparedStatement, connection);
        }
        return null;
    }
}
