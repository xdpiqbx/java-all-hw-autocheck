package module_004.Task_011;

public class ArlanHelper {
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawRect(int width, int height, char c){
        String result = "";
        while (height > 0){
            height--;
            int temp = width;
            while (width > 0){
                result += c;
                width--;
            }
            width = temp;
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(4, 3, 'X'));
    }
}
