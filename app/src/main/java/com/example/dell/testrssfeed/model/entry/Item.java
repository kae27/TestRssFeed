package com.example.dell.testrssfeed.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by Dell on 5/13/2017.
 */

@Root(name = "item", strict = false)
public class Item implements Serializable {

    @Element(name = "title")
    private String title;

    @Element(name = "pubDate")
    private String pubDate;

    @Element(required = false, name = "description")
    private String description;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}


