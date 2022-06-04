package module_004.Task_016;

public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }
    public int countSumOfDigits(int number){
        String numStr = Integer.toString(number);
        int i = 0;
        int len = numStr.length();
        int total = 0;
        while(i < len){
            total += Integer.parseInt(String.valueOf(numStr.charAt(i)));
            i++;
        }
        return total;
    }
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
