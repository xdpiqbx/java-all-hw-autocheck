package module_007.Task_016;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator{
    public String create(String text){
        int textLen = text.length();
        if (textLen <= 15){
            return text;
        }
        boolean is16SymbIsSpase = text.charAt(15) == ' ';
        return is16SymbIsSpase ? text.substring(0, 15) : text.substring(0, 15)+"...";
    }
}