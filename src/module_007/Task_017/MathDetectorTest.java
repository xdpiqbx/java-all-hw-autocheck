package module_007.Task_017;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector{
    public boolean isMath(String text){
        if(text.contains("=")){
            char [] mathOperators = new char[]{'+', '-', '*', '/'};
            if(isContainsMathOperator(text.replace('=', ' '), mathOperators)){
                String textWithoutMath = clearFromMathOperations(text.replace('=', ' '), mathOperators);
                if(isContainsTwoNums(textWithoutMath)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isContainsMathOperator(String text, char[] mathOperators){
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            for (char operator: mathOperators) {
                if(operator == text.charAt(i)){
                    return true;
                }
            }
        }
        return false;
    }
    private String clearFromMathOperations(String text, char[] mathOperators){
        String res = text;
        for (char operator: mathOperators) {
            res = res.replace(operator, ' ');
        }
        return res;
    }
    private boolean isContainsTwoNums (String textWithoutMath){
        String [] splittedText = textWithoutMath.split(" ");
        int numCounter = 0;
        for (String element: splittedText) {
            try{
                Integer.parseInt(element.trim());
                numCounter++;
            }catch(NumberFormatException ignored){}
        }
        return numCounter > 1;
    }
}