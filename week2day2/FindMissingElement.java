package week2day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array[] = {0,1,4,3,2,8,6,7};
		
   
        for(int i=1; i<=array.length; i++) {
        	  Arrays.sort(array);
        	  if(i != array[i]) {
        		  System.out.println("Missing Element is: "+i);
        		  break;
        	  }     	         	  	      	
        }       
	}
}
