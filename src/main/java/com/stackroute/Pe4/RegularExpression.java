package com.stackroute.Pe4;

public class RegularExpression {
    public boolean expression(String str) { //this method will check the substring present in the string or not

        if(str==""||str==null){
            return false;
        }
        boolean f = (str.matches("(.*)Harry(.*)"));
        return f;
    }


}
