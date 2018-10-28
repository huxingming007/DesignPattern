package com.xavier.design.pattern.template.jdbc;

import java.util.List;

/**
 * @author huxingming
 * @date 2018/10/27-下午5:03
 * @Description TODO
 */
public class MemberDao {


    private JdbcTemplate jdbcTemplate = new JdbcTemplate();


    public List<?> find(String id) {
        String sql = "select * from member where id = ?";
        return jdbcTemplate.executeQuery(sql, (resultSet, rowNum) -> {
            Member member = new Member();
            member.setAge(resultSet.getInt("age"));
            member.setName(resultSet.getString("name"));
            return member;
        }, new String[]{id});
    }
}
