package com.stackroute.Pe4;

public class CharacterCount {
    public String count(String str,char ch) { //counting the character in the given string
        if(str==""){
            return "empty";
        }
        else if(str == null){
            return null;
        }
         String s=str.toLowerCase();
            int charcount = s.length() - s.replace(String.valueOf(ch), "").length();
             return "occurence of A :"+charcount;
        }
    }

