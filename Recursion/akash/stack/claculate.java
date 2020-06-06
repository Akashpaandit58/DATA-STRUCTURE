package com.akash.stack;
import java.util.*;
public class claculate {
public static void main(String[] args) {
	int numberof_coin;
	int numberof_dollars=0;
	int numberof_cents=0;
	int totalcoin_value=0;
	int coin_values[]={1,5,10,25,25,100};
	//{there should be no  braces  here and the closing braces was also not given in the qiestion
	int i=0;// i should be zero so that it should take upto six values//or we can put i value 1 and in while we have to put i<=6 then will take six value;
		
		while(i<6)//
		{ Scanner sc=new Scanner(System.in);
			System.out.println("input number of coins");
			numberof_coin=sc.nextInt();
			 totalcoin_value= totalcoin_value+(numberof_coin*coin_values[i]);
			 i=i+1;// it should be inside the loop as  i value will be increamenting and changing for all the coin_value[i];
		}
///	i=i+1 if we keep the increment value here than  loop wil go to the infnite loop
		
		
		numberof_dollars=totalcoin_value/100;
		System.out.println(totalcoin_value);
		numberof_cents=totalcoin_value-(100*numberof_dollars);
		System.out.println("no of dollars ="+numberof_dollars);
		System.out.println("no of cents ="+numberof_cents);

	
	
}
}
