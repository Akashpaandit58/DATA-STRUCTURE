package com.queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class sortqueuewithoutextraspace {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		if(in.hasNext())

		{

			int t = in.nextInt();

			int peaks[] = new int[t];

			for(int i = 0;i<t;i++)

			{

				int n = in.nextInt();

				int arr[] = new int[n];



				for(int j = 0;j<n;j++)

				{

					arr[j] = in.nextInt();



				}

				for(int j = 1;j<(n-1);j++)

				{

					if(arr[(j-1)]<arr[j]&&arr[j]>arr[(j+1)])

					{

						peaks[i]++;

					}

				}

			}

			for(int j = 0;j<t;j++)

			{

				System.out.println("Case #"+(j+1)+": "+peaks[j]);

			}

		}

	}



}