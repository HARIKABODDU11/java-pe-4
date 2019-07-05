package com.stackroute.Pe4;

public class StringReplace {
    public String stringRepl(String str) { // in this method character in the string will be replaced by other character
        if(str=="") {
            return "empty";
        }
        else if(str==null){
            return "null";
        }
        String rs = str.replace("d", "f"); // Replace 'h' with 's'
        rs = rs.replace("l", "t");

        return rs;
    }
}

