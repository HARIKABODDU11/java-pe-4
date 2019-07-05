package com.stackroute.Pe4;
import java.lang.String;


public class TransposeString {  // the string will be reversed
    public String transpose(String str)
    {
        if(str==null||str==""){
            return "error";
        }

        String[] words=str.split(" ");
        String revString="";
        for(int i=0;i<words.length;i++){//start of outer for loop
            String word=words[i];
            String revWord="";
            for(int j=word.length()-1;j>=0;j--)//start of inner for loop
            {
                revWord=revWord+word.charAt(j);
            }//end of inner for loop
            revString=revString+revWord+" ";
        }//end of outer for loop
     return revString.trim();
    }

}
