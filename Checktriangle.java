import java.util.Scanner;
public class Checktriangle {
    public static void main(String args[])
    {	// your code goes here
		try{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0;i<T;i++){
		        int arr[] = new int[3];
		        int sum=0;
		        for(int j=0;j<3;j++){
		            arr[j] = sc.nextInt();
		            sum =sum + arr[j];
		        }
		        if(sum == 180){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}catch(Exception e){
		    
		}
	}
}