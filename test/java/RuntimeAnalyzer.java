
import java.util.Random;

public class RuntimeAnalyzer {
    public static void main(String[] args) 
    {
        int totalTime = 0;
        int totalAssignmentStatement = 0;
        long startTime;
        long stopTime;

        for (int arraySize = 5; arraySize < 51; arraySize += 5) {


            for (int i = 1; i <= 20; i++) {
                startTime = System.nanoTime();
                totalAssignmentStatement += MethodTester.algorithm1(GenerateArray(arraySize));
                stopTime = System.nanoTime();

                totalTime += (stopTime - startTime);

            }
            System.out.println("=Array size " + arraySize + "=\naverage assignment statements: " + totalAssignmentStatement / 20.0 +
                    "\nAverage execution time: " + totalTime/20.0 + "ns (" + totalTime / 20.0 / 1000000.0 + "ms)\n");
            totalTime=0;
            totalAssignmentStatement=0;
        }
    }
/**
 * 
 * @param arraySize the size of the array to generate 
 * @return an array of random integers
 */
    public static int[] GenerateArray (int arraySize)
    {
        int[] array = new int[arraySize];
       
        //TODO
        for(int i = 0; i < arraySize; i++)
        {
            array[i] = (int)(Math.random() * (99 - (-10) + 1) + (-10));
        }

        return array;
    }


}
