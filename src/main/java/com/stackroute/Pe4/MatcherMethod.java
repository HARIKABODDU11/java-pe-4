package com.stackroute.Pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatcherMethod {

    public String match(String text,String patternString)//this method will find the index of substring
        {
            String result="";
            if(text==""){
                result="Empty";
            }
            else {
              result="String Null";
            }

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) { //start of while loop
            int i = count++;


            result=result.concat( "Found at: "+ matcher.start() + " - " + matcher.end()+"\n");// end of while loop
            }
        return result.trim();
    }

}

