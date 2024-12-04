package com.ibm.training.io.serialization;

import java.io.Serializable;

public class GameInfo implements Serializable {
	
	int level = 1;

	int points ;
	
	String avatar = "fighter";

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "GameInfo [level=" + level + ", points=" + points + ", avatar=" + avatar + "]";
	}
	
	
}
