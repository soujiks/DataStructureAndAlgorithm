class checkMergeArray { 

  // Merge arr1 and arr2 into resultantArray
  public static int[] mergeArrays(int[] arr1, int[] arr2) { 
    int[] result= new int[arr1.length+arr2.length];
    int i=0;
    int j=0;
    int k=0;
     System.out.print("arr1.length="+arr1.length);
     System.out.print("arr2.length="+arr2.length);
     while(i<arr1.length && j<arr2.length){
      if(arr1[i]<arr2[j]){
        result[k++]=arr1[i++];
      }else{
        result[k++]=arr2[j++];
      }
     }
      while(i<arr1.length)
        result[k++]=arr1[i++];
      
       while( j<arr2.length)
          result[k++]=arr2[j++];
      
        return result;  
    
  
   
  } 

  public static void main(String args[]) {

    int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
    int[] arr2 = {11,19,27};  // creating a sorted array called arr2

    int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

    System.out.print("Arrays after merging: ");
    for(int i=0;i<resultantArray.length;i++){
      System.out.println(resultantArray[i]);
    }
  }
}
