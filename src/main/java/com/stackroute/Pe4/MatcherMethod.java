package com.stackroute.Pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatcherMethod {

    public String match(String text,String patternString)
        {
            if(text==""){
                return "Empty";
            }

        String result="";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            int i = count++;


            result=result.concat( "Found at: "+ matcher.start() + " - " + matcher.end()+"\n");
            }
        return result.trim();
    }

}

