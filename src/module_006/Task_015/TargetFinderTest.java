package module_006.Task_015;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int targetsCount = targets.length;
        int [] distances = new int[1];
        int i = 0;
        double minDistance = this.getDistance(aiCoords[0], aiCoords[1], targets[0][0], targets[0][1]);
        for (int[] target: targets) {
            double temp = this.getDistance(aiCoords[0], aiCoords[1], target[0], target[1]);
            if(minDistance > temp){
                distances = target;
            }
            i++;
        }
        return distances;
    }

    public double getDistance(int x1, int y1, int x2, int y2){
        double intermediateResult = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        return Math.sqrt(intermediateResult);
    }
}