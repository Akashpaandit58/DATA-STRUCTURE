
import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSet {
  public static void main(String args[]) {
 
      List<Integer> inpa = new ArrayList<Integer>();
     List<Integer> inpb = new ArrayList<Integer>();
     
     inpa.add(2);
     inpa.add(4);
     inpb.add(16);
     inpb.add(32);
     inpb.add(96);
     
     int a[] = new int[inpa.size()];
         int b[] = new int[inpb.size()];
     
     for(int i=0; i<inpa.size(); i++) {
                  a[i] = inpa.get(i);
     
              }

              for(int k=0; k<inpb.size(); k++) {
                  b[k] = inpb.get(k);
              }
     
//      int a[] = {2,4};
//      int b[] = {16,32,96};
     int c[] = new int[a.length + b.length];
     int cnt = 0;
     int count = 0;
     int factorCnt = 0;
     
     for(int i = 0; i < a.length; i++) {
         c[i] = a[i];
         count++;
      }
      for(int j = 0; j < b.length;j++) {
         c[count++] = b[j];
      }
     
      for(int i=a[a.length-1]; i<=b[0]; i++) {
      for(int j=0; j<c.length; j++) {
         if((i >= c[j] && i%c[j] == 0) || (c[j] > i && c[j]%i == 0)) {
         cnt++;
         }
      }
        if(cnt == c.length) {
         factorCnt++;
         }
         cnt = 0;
      }
     
      System.out.println(factorCnt);
     
  }
}