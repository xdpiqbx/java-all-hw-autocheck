package module_007.Task_015;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText{
    public boolean detect(String text){
        String [] isNumsArr = text.split(" ");
        for (String item: isNumsArr) {
            try{
                Integer.parseInt(item);
            }catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}