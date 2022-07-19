import java.util.*;
import java.util.Scanner.*;

public class LeapYear {
	public static void main(String[] args) {
				
		System.out.println("Programme to find the leap year");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year which you want to check");
        int year = scan.nextInt();
        if (( year%400 == 0) || (( year%4 ==0 ) && ( year%100 != 0)))
        {
        		System.out.println("The year is Leap Year");
        }else 
        	{
               	System.out.println("Year is Not a Leap Year");
        	}
            
        }
}