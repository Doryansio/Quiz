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
	
	public int GetId() {
		return _id;
	}

	public String GetQuestion() {
		return _questions;
	}
	public String GetResponse() {
		return _response;
	}
}
