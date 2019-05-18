// Matthew Glover's Final Question Seven Answer
//Question: What are the bugs in this code. Write about them. Fix them and paste a link

package finalQuestionSevenPackage;


class Main {
  public static void main(String[] args) {
	  // Fix 1: Instantiated a specific array for the program to use.
	int[] arr = {6,4,5,2,3,7,1};
	
    int N = arr.length;
    // Fix 2: Set default min value to a value larger than all values in the array, to make sure default value will never be min.
    double min = 1000;
    int minLocation= -1;

    // Fix 3: Fixed syntax errors in for loop
    for(int i =0; i <= N - 1; i++) 
    {
      if( arr[i] < min)
         min = arr[i]; 
      	// Subtract from minLocation for program to output appropriate arr[] location.
         minLocation = i;
    }
 System.out.print("The minimal value is arr[");
 System.out.println(minLocation + "] = " + min);
  }
}