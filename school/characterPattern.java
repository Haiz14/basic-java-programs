import java.util.*;
public class characterPattern {
public static void main (String [] args){
	
	  int  i, element_1, element_2,n,j;
	  Scanner in = new Scanner (System.in);
	  System.out.println("Enter value of n");
	  n=in.nextInt();
	 
	  if (n<=10){
	    
	    char a,b,c; 
	    char [][] arr = new char [n][n];
	    System.out.println("enter 3 characters");
	    a=in.next().charAt(0);
	    b=in.next().charAt(0);
	    c=in.next().charAt(0);
	    
	    element_1 =0;
	    element_2= n-1;
	    for (i=0; i<n; i++){
	        // upper triangle and left triangle
	        if (element_1<element_2){
	        for (j=element_1+1;j<element_2;j++){
	    	    arr[i][j]=a;
	    	    arr[j][i]=b;}
	    	}
	        // lower triangle and right triangle
	    	if (element_2<element_1){
	    	  for (j=element_2+1;j<element_1;j++){
	    	    arr[i][j]=a;
	    	    arr[j][i]=b;}
	    	}
		    //diagnols 
		    arr[i][element_1]=c;
		    arr[i][element_2]=c; 
	        element_1++;
	        element_2--;
	    }
	    System.out.println(Arrays.deepToString(arr).replace("], ", "\n").replaceAll(",|\\[|\\]",""));
		}
	else {
	    System.out.println("out of range");
	}
	  
	}

}
