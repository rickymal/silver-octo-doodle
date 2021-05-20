package tests;

import java.util.Arrays;

public class LisaNumbers {


static int beautifulDays(int i, int j, int k) {
    int[] range = new int[j - i + 1];
    
    for(int m = 0; m < range.length;m++) {
    	range[m] = m + i; 
    }
    
    System.out.println("Array");
    System.out.println(Arrays.toString(range));

    int nof_beautifulNumbers = 0;
    //reverse
    for(int m = 0;m < range.length; m++) {
        String content = String.valueOf(range[m]);
        char[] vector_content = content.toCharArray();
        char[] reversed_content = new char[vector_content.length];
        
        for(int n = vector_content.length - 1; n >= 0; n--) {
            reversed_content[reversed_content.length - n - 1] = vector_content[n];
        }
        int reversed_number = Integer.parseInt(String.valueOf(reversed_content));
        
        //boolean is_beautiful = (range[m] - reversed_number) % k == 0;
        float number = ((float)(range[m]) - (float)(reversed_number)) / k;
        boolean isBeautiful = (number - (int)(number)) == 0;

        
        if(isBeautiful) 
        {
            nof_beautifulNumbers++;
        }
 }
    
    return nof_beautifulNumbers;
}
 public static void main(String[] args) {
	 System.out.println("OI");
	 
	 int[] range = new int[] {
			 20,21,22,23,
	 };
	 
	 int k = 6;
	 
	 System.out.print(beautifulDays(range[0],range[3],k));
	 
	 
 }
}
