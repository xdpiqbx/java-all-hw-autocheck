package module_006.Task_028;

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
//        int index = 0;
//        while(true) {
//            try {
//                result += scores[index++];
//            } catch (IndexOutOfBoundsException ex) {
//                break;
//            }
//        }
        for (int points: scores) {
            result += points;
        }


        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}