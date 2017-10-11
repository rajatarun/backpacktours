package com.backpack.backpacktours.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

@Component
public class LoginRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private String USER_QUERY = "SELECT * FROM ROOT.USERS WHERE USERID='";
    public DeferredResult<?> fetchloginDataFromDatabase() {
        DeferredResult<?> result = new DeferredResult();
        return result;
    }

    public Map<String, Object> fetchUserInfoFromDatabase(String userId) {
//        System.out.println( );
        return jdbcTemplate.queryForMap(USER_QUERY+userId+"'");
    }
}
