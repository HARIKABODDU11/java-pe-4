package com.stackroute.Pe4;

public class CharacterCount {
    public String count(String str, char ch) { //counting the character in the given string
         String s;
        if (str == "") {
            s = "empty";
        } else if (str == null) {
            s = " string given is null";
        } else {
            s = "string must not be  null or empty";
        }

        int charcount = s.length() - s.replace(String.valueOf(ch), "").length();
        s = "occurence of A :" + charcount;




        return s;
    }
}

