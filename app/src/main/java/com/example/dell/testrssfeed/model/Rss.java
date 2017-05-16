package com.example.dell.testrssfeed.model;

/**
 * Created by Dell on 5/13/2017.
 */

import com.example.dell.testrssfeed.model.entry.Item;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Dell on 5/13/2017.
 */
@Root(name = "rss", strict = false)
public class Rss implements Serializable
{

    @Element(required = false,name = "channel")
    private String channel;

    @Element(name = "title")
    private String titleChannel;

    @Element(name = "description")
    private String descriptionChannel;

    @Element(name = "pubDate")
    private String pubDateChannel;

    @ElementList(inline = true, name = "item")
    private List<Item> item;



    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }


    public String getTitleChannel()
    {
        return titleChannel;
    }

    public void setTitleChannel(String titleChannel)
    {
        this.titleChannel = titleChannel;
    }

    public String getDescriptionChannel()
    {
        return descriptionChannel;
    }

    public void setDescriptionChannel(String descriptionChannel)
    {
        this.descriptionChannel = descriptionChannel;
    }

    public String getPubDateChannel()
    {
        return pubDateChannel;
    }

    public void setPubDateChannel(String pubDateChannel)
    {
        this.pubDateChannel = pubDateChannel;
    }

    public List<Item> getItem()
    {
        return item;
    }

    public void setItem(List<Item> item)
    {
        this.item = item;
    }

}