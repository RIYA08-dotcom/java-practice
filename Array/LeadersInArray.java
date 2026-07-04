/*
time Complexity-O(n)
Space Complexity-O(1)
Approach-
1.last element of the array will always be a leader and initailise the max variable with last element.
2.traverse the array from the end.
3.compare  the current element with the max variable.
4.if current element is greater ,update the max variable with current element.
*/
import java.util.Scanner;
public class leader {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      
      /*
      Time complexity-O(n^2)
        brute force approach
        for(int i=0;i<n;i++){
            boolean leader=true;
           
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                System.out.print(arr[i]+" ");

        }
          */


        //optimal approach
        int max=arr[n-1];
        System.out.print(max+" ");
        for(int i=n-2;i>=0;i--){ 
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }       
        }      
    }

    

