package module_007.Task_020;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall{
    public String calculate(String text){
        char [] charsFromText = text.toCharArray();
        int upperCaseCounter = 0;
        for (char letter: charsFromText) {
            if(Character.isUpperCase(letter)){
                upperCaseCounter++;
            }
        }
        return this.bigSmallSame(charsFromText.length, upperCaseCounter);
    }

    private String bigSmallSame(int textLength, int upperCaseCounter){
        float res = (float)textLength / (float)upperCaseCounter;
        if(res == 2){
            return "Same";
        }else if(res > 2){
            return "Small";
        }else{
            return "Big";
        }
    }
}