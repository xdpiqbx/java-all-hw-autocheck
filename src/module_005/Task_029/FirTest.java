package module_005.Task_029;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
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

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                continue;
            }
            result *= i;
        }
        return result;
    }
}