package module_007.Task_024;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter{
    public int count(String text){
        String [] words = text.split(" ");
        int nameCounter = 0;
        for (String word: words) {
            if(this.isName(word)){
                nameCounter++;
            }
        }
        return nameCounter;
    }

    private boolean isName(String word){
        if(word.length() >= 2 && Character.isUpperCase(word.charAt(0))){
            char [] letters = word.toCharArray();
            for (int i = 1; i < letters.length; i++) {
                if(!Character.isUpperCase(letters[i])){
                    return true;
                }
            }
        }
        return false;
    }
}