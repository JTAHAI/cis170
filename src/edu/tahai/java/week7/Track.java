package edu.tahai.java.week7;

public class Track
{

	// define attributes of track
private int trackLength;
private int numberOfTurns;

// track constructor
public Track(int trackLength, int numberOfTurns)
{
	this.trackLength = trackLength;
	this.numberOfTurns = numberOfTurns;
	
}

// getters and setters
public int getTrackLength() {
	return trackLength;
}
public void setTrackLength(int trackLength) {
	this.trackLength = trackLength;
}
public int getNumberOfTurns() {
	return numberOfTurns;
}
public void setNumberOfTurns(int numberOfTurns) {
	this.numberOfTurns = numberOfTurns;
}



}
