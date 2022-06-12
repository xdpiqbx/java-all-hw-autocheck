package module_007.Task_023;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
        System.out.println(new EmailDetector().isPresent("No email present, but ther@e"));
    }
}

class EmailDetector{
    public boolean isPresent(String text){
        if(!text.contains("@")){
            return false;
        }
        if(text.startsWith("@") || text.endsWith("@")){
            return false;
        }
        int atIndex = text.indexOf('@');
        try{
            boolean isLeftSymbols = (text.charAt(atIndex-1) != ' ') && (text.charAt(atIndex-2) != ' ');
            boolean isRightSymbols = (text.charAt(atIndex+1) != ' ') && (text.charAt(atIndex+2) != ' ');
            if(!isLeftSymbols || !isRightSymbols){
                return false;
            }
        }catch (StringIndexOutOfBoundsException e){
            return false;
        }
        return true;
    }
}
