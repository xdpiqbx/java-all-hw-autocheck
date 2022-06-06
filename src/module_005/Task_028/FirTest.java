package module_005.Task_028;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

//class FirNumFactorial extends FirNum{
//    @Override
//    public int calc(int n) {
//        if(n == 0){
//            return 1;
//        }
//        return n * calc( n - 1);
//    }
//}