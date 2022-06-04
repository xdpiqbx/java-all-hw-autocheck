package module_003.Task_027;

public class NumberTranslator {
    public int translate(String romanNumber){
        String rom = romanNumber.toUpperCase().strip().replace(" ", "");
        switch (rom){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            default:
                return -1;
        }
    }
}
