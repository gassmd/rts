import java.util.Arrays;

public class AboveOrBelow {

  

   public static void main(String[] args) {
      int[] arr = {1, 5, 2, 1, 10};
      int k = 6;
      int arrLength = arr.length;
      int countBelow = 0;
      int countAbove = 0;
      int countEqual = 0;
       
     Arrays.sort(arr);                               // sorts array in ascending order to minimize searching

       for (int i = 0; arr[i]<=k; i++){                // iterates through sorted array up to when arr[i] is equal
           if (arr[i] == k){                           // gets temporary equal count to subtract (assuming equals are not included)
               countEqual++;
           }
           countBelow++;                               // gets below count each time loop is iterated
       }
       countAbove = arrLength - countBelow;            // gets above count by subtracting improper below count

       countBelow -= countEqual;                       // subtracts equal count from loop count for "proper" below count number


       System.out.println("above: " + countAbove + " below: " + countBelow);


   }
}
