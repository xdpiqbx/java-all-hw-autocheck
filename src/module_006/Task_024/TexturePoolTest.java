package module_006.Task_024;

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}

class TexturePool{
    private static final TexturePool instance = new TexturePool();
    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }
    private TexturePool(){}

    static TexturePool getInstance(){
        return instance;
    }
}