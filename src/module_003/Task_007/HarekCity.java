package module_003.Task_007;

import java.util.Arrays;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace){
        int namesLen = names.length;
        int replaceIndex = 0;
        for (int i = 0; i < namesLen; i++) {
            if (i % 2 != 0){
                names[i] = toReplace[replaceIndex];
                replaceIndex++;
            }
        }
    }
    /*
    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    */

    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }
}
