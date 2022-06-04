package module_004.Task_010;

public class ArlanHelper {
    public String drawQuad(int n){
        int i = 0;
        char symbol = '*';
        String str = "";
        String resultStr = "";
        while(i < n){
            int j = 0;
            while(j < n){
                str += symbol;
                j++;
            }
            resultStr += str+"\n";
            str="";
            i++;
        }
        return resultStr.strip();
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(5));
    }
}