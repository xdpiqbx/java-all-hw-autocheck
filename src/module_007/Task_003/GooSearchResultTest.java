package module_007.Task_003;
import java.net.MalformedURLException;
import java.net.URL;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult{
    private String url = "";

    GooSearchResult(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    String parseDomain(){
        try{
            URL url = new URL(this.url);
            return url.getHost();
        }catch (MalformedURLException e){
            return "MalformedURLException";
        }
    }
}