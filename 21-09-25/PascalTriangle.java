import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // First row is always [1]
        result.add(Arrays.asList(1));

        // Build remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            // First element is always 1
            newRow.add(1);

            // Middle elements = sum of two above elements
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element is always 1
            newRow.add(1);

            result.add(newRow);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 5; // strictly given input
        PascalTriangle pt = new PascalTriangle();  // create object of PascalTriangle
        List<List<Integer>> ans = pt.generate(numRows);

        // Print output in required format
        System.out.println(ans);
    }
}
