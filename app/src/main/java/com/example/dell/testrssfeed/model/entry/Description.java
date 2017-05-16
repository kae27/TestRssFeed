package com.example.dell.testrssfeed.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dell on 5/13/2017.
 */


@Root(name = "description", strict = false)
public class Description implements Serializable
{



    @Element(name = "![CDATA[")
    private String __cdata;

    public String get__cdata()
    {
        return __cdata;
    }

    public void set__cdata(String __cdata)
    {
        this.__cdata = __cdata;
    }


}
