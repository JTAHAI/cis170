package edu.tahai.java.week7;

public class Race 
{
	// define attributes of race
private int startTime;
private float finishTime;
private String winner;


// race constructor
public Race(int startTime, float finishTime)
{
	this.startTime = startTime;
	this.finishTime = finishTime;

	
}

// getters and setters
public int getStartTime() {
	return startTime;
}
public void setStartTime(int startTime) {
	this.startTime = startTime;
}
public float getFinishTime() {
	return finishTime;
}
public void setFinishTime(float finishTime) {
	this.finishTime = finishTime;
}
public String getWinner() {
	return winner;
}
public void setWinner(String winner) {
	this.winner = winner;
}
public boolean isFinished()
{

return false;
	
}

}
