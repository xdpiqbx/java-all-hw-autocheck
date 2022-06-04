package module_004.Task_017;

public class ATM {
    public int countBanknotes(int sum){
        int [] banknotes = new int []{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int len = banknotes.length;
        int banknotesCount = 0;
        int i = 0;
        while (i < len) {
            banknotesCount += sum/banknotes[i];
            sum %= banknotes[i];
            i++;
        }
        return banknotesCount;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(578));
    }
}
