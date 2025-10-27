package model;

public class Questions {
	private int _id;
	private String _questions;
	private String _response;
	
	public Questions(int ID,String question, String response) {
		this._id = ID;
		this._questions = question;
		this._response = response;
	}
	
	public int getId() {
		return _id;
	}

	public String getQuestion() {
		return _questions;
	}
	public String getResponse() {
		return _response;
	}
}
