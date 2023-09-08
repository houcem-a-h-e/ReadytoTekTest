package com.readytotek.testapi.entities;

import javax.persistence.*;

@Embeddable
public class Custom {

	private int level;
	private int sergn;
	private int mny;
	private int score;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getSergn() {
		return sergn;
	}
	public void setSergn(int sergn) {
		this.sergn = sergn;
	}
	public int getMny() {
		return mny;
	}
	public void setMny(int mny) {
		this.mny = mny;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Custom() {}
	public Custom(int level, int sergn, int mny, int score) {
		super();
		this.level = level;
		this.sergn = sergn;
		this.mny = mny;
		this.score = score;
	}
	
}
