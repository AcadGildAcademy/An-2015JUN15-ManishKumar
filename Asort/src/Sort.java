
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

              
            
              int array[] = {-9, -3, -2, -7, 8, 5, 4, 2, 6, 0};
             
       
              System.out.println("Array befor sorting the elements");
              
              
              for(int i=0; i < array.length; i++){
                      System.out.print(array[i] + " ");
              }
             
  
              Sort(array);
             
              System.out.println("");
             
          
              System.out.println("Elements after sorting");
              
              
              
              for(int i=0; i < array.length; i++){
            	  
            	  
                      System.out.print(array[i] + " ");
              }

      }

      private static  void Sort(int[] intArray) {
             
            
             
              int num = intArray.length;
              int temp = 0;
             
              for(int i=0; i < num; i++){
                      for(int j=1; j < (num-i); j++){
                             
                              if(intArray[j-1] > intArray[j]){
                                      //swap the elements!
                                      temp = intArray[j-1];
                                      
                               //       System.out.println(temp);
                                      
                                      intArray[j-1] = intArray[j];
                                      
                            //          System.out.println(j-1);
                                      
                                      
                                      intArray[j] = temp;
                                      
                                      
                                     
                              }
                             
                      }
              }
     
      }
}