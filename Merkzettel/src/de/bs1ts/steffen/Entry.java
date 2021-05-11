package de.bs1ts.steffen;

import java.util.Date;

public class Entry {
    private String content;
    private Date date;

    public Entry(String content, Date date) {
        this.content = content;
        this.date = date;
    }

    @Override
    public String toString(){
        return date + ":" + content;
    }
}
