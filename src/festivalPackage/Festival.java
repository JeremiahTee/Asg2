package festivalPackage;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

import eventPackage.Event;

/**
 * 
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class Festival extends Event{
	protected String Arts, Beer, Comedy, Film, Fire, Folk;
	protected double ticketPrice;
	protected int duration;
	
	public String getArts() {
		return Arts;
	}
	public void setArts(String arts) {
		Arts = arts;
	}
	public String getBeer() {
		return Beer;
	}
	public void setBeer(String beer) {
		Beer = beer;
	}
	public String getComedy() {
		return Comedy;
	}
	public void setComedy(String comedy) {
		Comedy = comedy;
	}
	public String getFilm() {
		return Film;
	}
	public void setFilm(String film) {
		Film = film;
	}
	public String getFire() {
		return Fire;
	}
	public void setFire(String fire) {
		Fire = fire;
	}
	public String getFolk() {
		return Folk;
	}
	public void setFolk(String folk) {
		Folk = folk;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
