package module_007.Task_019;

import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter{
    public int[] extract(String text){
        String strNums = this.getAllNumbersFromString(text);
        return this.convertStringNumbersToIntArr(strNums);
    }
    private boolean isNum(char symbol){
        try{
            Integer.parseInt(String.valueOf(symbol));
            return true;
        }catch (NumberFormatException ignored){
            return false;
        }
    }

    private String getAllNumbersFromString (String text){
        char [] arrTextSymbols = text.toCharArray();
        String strNums = "";
        for (char symbol: arrTextSymbols) {
            if(this.isNum(symbol)){
                strNums += symbol;
            }
        }
        return strNums;
    }

    private int [] convertStringNumbersToIntArr(String strNums){
        char [] arrStrNums = strNums.toCharArray();
        int [] intArrNums = new int[arrStrNums.length];
        for (int i = 0; i < arrStrNums.length; i++) {
            intArrNums[i] = Integer.parseInt(Character.toString(arrStrNums[i]));
        }
        return intArrNums;
    }
}