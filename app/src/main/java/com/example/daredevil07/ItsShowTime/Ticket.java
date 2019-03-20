package com.example.daredevil07.ItsShowTime;

import java.io.Serializable;



public class Ticket implements Serializable{
    private int ticketID;
    private String seatInfo;
    private String date;
    private String time;
    private String filmTitle;

    public Ticket(String seatInfo, String date, String time, String filmTitle) {
        this.seatInfo = seatInfo;
        this.date = date;
        this.time = time;
        this.filmTitle = filmTitle;
    }


    public String getSeatInfo() {
        return seatInfo;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
}
