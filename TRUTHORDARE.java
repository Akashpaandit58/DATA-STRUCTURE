import java.util.Scanner ;
public class TRUTHORDARE {
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int a = sc.nextInt();
		    int[] arr1 = new int[a];
            for(int j=0;j<a;j++)
                       arr1[j] = sc.nextInt();
		    int b = sc.nextInt();
		    int[] arr2 = new int[b];
		    for(int j=0;j<b;j++)
                       arr2[j] = sc.nextInt();
		    int c = sc.nextInt();
		    int[] arr3 = new int[c];
		    for(int j=0;j<c;j++)
                       arr3[j] = sc.nextInt();
		    int d = sc.nextInt();
		    int[] arr4 = new int[d];
		    for(int j=0;j<d;j++)
                       arr4[j] = sc.nextInt();
                       
         int z=0;
		    for(int j=0;j<c;j++){
		        for(int k=0;k<a;k++){
		            if(arr3[j]==arr1[k]){
		                z++;
		                break;
		            }
		        }
		    }
		    int y=0;
		    for(int j=0;j<d;j++){
		        for(int k=0;k<b;k++){
		            if(arr4[j]==arr2[k]){
		                y++;
		                break;
		            }
		        }
		    }
		    if(z==c && y==d){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
	    }
		}
	    }
	    catch(Exception e)
	    {}
	}
}