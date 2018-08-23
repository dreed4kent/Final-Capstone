package com.techelevator.model;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class JDBCForumDAO  implements ForumDAO{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCForumDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveQuestion(String userName, String representative, String topic, String question) {
		jdbcTemplate.update("insert into forum_questions (user_name, representative_name, topic, question)\n" + 
				"values (?, ?, ?, ?);",
				userName, representative, topic, question);
		
	}

	@Override
	public void getQuestionsByRepresentative(String representative) {
		// TODO Auto-generated method stub
		
	}





}
