package com.prog2.labs;
/**
 * @author adinashby
 *
 */
public class LabThree {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public int[] rotateTheArray(int arraySize, int startingInteger) {
                int [] array = new int[arraySize];
                int currentValue = startingInteger;
                
                for (int i = arraySize -1; i >= 0; i--) {
                    array[i] = currentValue;
                    currentValue -= 3;
                }
                
                int temp = array[0];
                for (int i = 0; i < arraySize -1; i +=2){
                    array[i] = array[(i +2) % arraySize];
                }
                
                array[arraySize -1] = temp;
                for (int i =1; i < arraySize -1; i += 2){
                    temp = array[i];
                    array[i] = array[{i +2) % arraySize];
                    array[(i + 2 ) % arraySize] = temp;
                }
                    System.out.println("Resulting array: ");
                    for (int i = 0; i < arraySize, i++){
                        System.out.println(array[i] + " ");
                    }
                    System.out.println();
            
                
                return array;
	}
	
	
	public int jumpGame(int[] nums) {
		int jumps = 0;
                int currentEnd = 0;
                int farthest = 0;
                for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
            jumps++;
            currentEnd = farthest;
        }
    }
            return jumps;
	}
}
