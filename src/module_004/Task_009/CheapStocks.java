package module_004.Task_009;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        String cheapGoods = "";
        for (String item: stocks) {
            String[] arr = item.split(" ");
            int price = Integer.parseInt(arr[1]);
            if (price < 200){
                cheapGoods += arr[0]+" ";
            }
        }
        return cheapGoods.trim();
    }
}