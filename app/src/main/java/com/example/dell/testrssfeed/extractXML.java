package com.example.dell.testrssfeed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 5/16/2017.
 */

public class ExtractXML
{

    private static final String TAG = "ExtractXML";

    String tag;
    String xml;

    public ExtractXML(String tag, String xml) {
        this.tag = tag;
        this.xml = xml;
    }


    public List<String> start(){
        List<String> result = new ArrayList<>();

        String[] splitXML = xml.split(tag + "\"");
        int count = splitXML.length;

        for( int i = 1; i < count; i++){
            String temp = splitXML[i];
            int index = temp.indexOf("\"");
            //Log.d(TAG, "start: index: " + index);
            //Log.d(TAG, "start: extracted: " + temp);

            temp = temp.substring(0,index);
            //Log.d(TAG, "start: snipped: " + temp);
            result.add(temp);
        }

        return result;
    }
}
