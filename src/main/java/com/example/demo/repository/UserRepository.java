package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User findByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{username}, new UserRowMapper());
    }

    public void save(User user) {
        String query = "INSERT INTO users (username, password, roles) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, user.getUsername(), user.getPassword(), user.getRoles());
    }
}
