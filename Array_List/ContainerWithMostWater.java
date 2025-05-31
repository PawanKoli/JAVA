import java.util.ArrayList;

public class ContainerWithMostWater {

    // Brut Force - O(n^2)
    public static int FMWC(ArrayList<Integer> height){
        int maxWater = 0;
        
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;  // container width
                int currentWater = minHeight * width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }

    // OPTEMIZED 2 Pointers Approach - O(n)
    public static int findMaxWaterContainer(ArrayList<Integer> height){
        int maxWater = 0;
        int leftPointer = 0, rightPointer = height.size() -1;
        
        while(leftPointer < rightPointer){
            
            int minHeight = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width = rightPointer - leftPointer;  // container width
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            // Move Pointers
            if(height.get(leftPointer) < height.get(rightPointer))
                leftPointer++;
            else 
                rightPointer--;
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(FMWC(height));
        System.out.println(findMaxWaterContainer(height));
    }
}