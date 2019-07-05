package com.stackroute.Pe4;

public class SortParagraph {


    public String[] sortString(String input){
        String[] output;
        String temp="";
        output=input.split(" ");//split the string input with spaces and store in string array
        for (int i=0;i<output.length;i++){//start of outer for loop
            for(int j=i+1;j<output.length;j++){//start of inner for loop
                if(output[i].compareTo(output[j])>0){//if loop
                    temp=output[i];
                    output[i]=output[j];
                    output[j]=temp;

                }//end of if loop
            }//end of inner for loop
        }//end of outer for loop
        return output;
    }
}
