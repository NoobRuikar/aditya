
import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {int a[]=new int[]{1,2,9,8,10,5};
    
    int n=a.length;
    
    Arrays.sort(a);
    
   
   
  int j =-1,temp;
   
     
      for (int i = 0; i < n; i++) {
   
          
          if (a[i] % 2 == 0) {
   
             
              j++;
  
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
          }
      }
      
      
      for (int i = 0; i < n; i++)
          System.out.print(a[i] + " ");
}
		// TODO Auto-generated method stub

	}

}

