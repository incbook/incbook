package com.incbook.project.domain;

public class LexiconVO {

	private int id;
	private String lex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLex() {
		return lex;
	}

	public void setLex(String lex) {
		this.lex = lex;
	}

	@Override
	public String toString() {
		return "LexiconVO [id=" + id + ", lex=" + lex + "]";
	}

}
