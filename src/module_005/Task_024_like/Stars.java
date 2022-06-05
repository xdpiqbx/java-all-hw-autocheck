package module_005.Task_024_like;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String intergalacticGuildCount = "";

        int [] arabicCount = new int []{1000, 100, 10, 1};
        String [] guildCount = new String[]{"X", "Y", "Z", "*"};

        int arrLen = arabicCount.length;
        int tempCount = this.count;

        for (int i = 0; i < arrLen; i++){
            int res = tempCount/arabicCount[i];
            for (int j = 0; j < res; j++) {
                intergalacticGuildCount += guildCount[i];
            }
            tempCount %= arabicCount[i];
        }

        return intergalacticGuildCount;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(1153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
