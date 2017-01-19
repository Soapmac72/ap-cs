import java.util.Scanner;
class MergeArrays {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int[] firstArray = new int[100];
   int[] secondArray = new int[100];
   
   System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
   int count = 0;
   boolean correctOrder = true;
   
   for (int i = 0; i < firstArray.length; i++) {
    int input = scan.nextInt();
    if (input <= 0) {
     break;
    }else if (i > 0 && firstArray[i] < firstArray[i-1]) {
      correctOrder = false;
    }else {
      firstArray[i] = input;
      count++;
     }
    }
   
   System.out.println("First Array:");
   for (int i = 0; i < firstArray.length; i++) {
   System.out.print(firstArray[i] + " ");
  }
   
   System.out.println();
   System.out.println("Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit");
   int secondCount = 0;
   
   for (int i = 0; i < secondArray.length; i++) {
    int secondInput = scan.nextInt();
    if (secondInput <= 0) {
     break;
    }else if (i > 0 && secondArray[i] < firstArray[i-1]) {
      correctOrder = false;
    }
    else {
     secondArray[i] = secondInput;
     secondCount++;
    }
   }
   
  int[] sortedSecondArray = new int[secondCount];
  for (int i = 0; i < sortedSecondArray.length; i++) {
   sortedSecondArray[i] = secondArray[i];
  }
  
  for (int i = 0; i < sortedSecondArray.length; i++) {
    int j = i;
    for (int k = i+1; k < sortedSecondArray.length; k++) {
      if (sortedSecondArray[k] < sortedSecondArray[i]) {
        j = k;
      }
      int t = sortedSecondArray[i]; 
      sortedSecondArray[i] = sortedSecondArray[j]; 
      sortedSecondArray[j] = t;
      j = i;
    }
   }
  
  int finalCount = 0;
  
  System.out.println();
  
  System.out.println("Second Array:");
  for (int i = 0; i < sortedSecondArray.length; i++) {
    System.out.print(sortedSecondArray[i] + " ");
    finalCount++;
  }
  
  int[] sortedFinalArray = concat(firstArray, sortedSecondArray);
  
  for (int i = 0; i < sortedFinalArray.length; i++) {
  int j = i;
  for (int k = i+1; k < sortedFinalArray.length; k++) {
    if (sortedFinalArray[k] < sortedFinalArray[i]) {
      j = k;
    }
    int t = sortedFinalArray[i]; 
    sortedFinalArray[i] = sortedFinalArray[j]; 
    sortedFinalArray[j] = t;
    j = i;
    }
   }
  
 
  System.out.println();
  
  System.out.println("Merged Array:");
  for (int i = 0; i < sortedFinalArray.length; i++) {
    System.out.print(sortedFinalArray[i] + " ");
  }
  
}
 public static int[] concat(int[] a, int[] b) {
   int aLen = a.length;
   int bLen = b.length;
   int[] c= new int[aLen+bLen];
   System.arraycopy(a, 0, c, 0, aLen);
   System.arraycopy(b, 0, c, aLen, bLen);
   return c;
 }
}
