package module_007.Task_009;

import java.util.Locale;

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};
        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}

class StringByteWorker{
    public String process(byte[] bytes){
        String str = new String(bytes);
        return str.toLowerCase();
    }
}