package com.techelevator.model;

public interface ForumDAO {

	public void saveQuestion(String userName, String representative, String topic, String question);
	public void getQuestionsByRepresentative(String representative);
}
