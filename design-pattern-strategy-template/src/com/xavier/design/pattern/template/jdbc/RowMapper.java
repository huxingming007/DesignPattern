package com.xavier.design.pattern.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:48
 * @Description TODO
 */
public interface RowMapper<T> {


    public T mapRow(ResultSet resultSet, int rowNum) throws SQLException;
}
