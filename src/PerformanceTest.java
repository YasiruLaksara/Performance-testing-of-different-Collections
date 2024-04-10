// Import the collection you intend to test. For example, ArrayList.
// You will have to import the parent classes also

import java.util.List;
import java.util.ArrayList;


public class PerformanceTest {
    public static void main(String[] args) {

        // First declarer a class for SomeObject.
        // For example a StudentRecord, SalesTransaction, SensorData, etc.
        // Then create a collection of those objects

        List<MathsMarks> list = new ArrayList<MathsMarks>();

        // You will be changing size variable from 10 to 100, 100, 100, 10000, etc
        // to get different performance values
        int size = 10000;

        for (int i = 0; i <= size; i++) {
            list.add(new MathsMarks(i));
        };

        // Get a Java runtime instance.
        // You need this to obtain system details at runtime.
        // RunTime class is available as a "static" class. What does that mean?

        Runtime runtime = Runtime.getRuntime();

        // Get the runtime to execute the garbage collector.
        // This is making a direct request to run the GC.
        // Otherwise, the system decides when to run the GC.

        runtime.gc();

        // Calculate the amount of memory used by your program

        long memory = runtime.totalMemory() - runtime.freeMemory();
         int objSize=4;

        // Print the performance test data to the console
        // Find the size of the SomeObject instance that you are storing. Let's call it objSize


        System.out.println("Size of the stored object: " + objSize + " bytes");
        int calculatedSize = objSize*size;
        System.out.println("Size of the stored collection: " + calculatedSize + " bytes");
        System.out.println("Used memory: " + memory + " bytes");
        System.out.println("Memory overhead: " + (memory-calculatedSize) + " bytes");
    }
}
class MathsMarks {
    int marks;

    public MathsMarks(int marks){
        this.marks = marks;

    }
}