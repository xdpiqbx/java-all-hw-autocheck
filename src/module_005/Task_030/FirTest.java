package module_005.Task_030;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFizzBuzz();
        FirTest firTest = new FirTest();

        //Should be 83
        System.out.println(firTest.test(firNum, 20));
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

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                if((i % 3 == 0) != (i % 5 == 0)){
                    sum += i;
                }
            }
        }
        return sum;
    }
}