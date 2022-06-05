package module_005.Task_006;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if(bigRocketCount < 0 || bigRocketCount > 100){
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if(smallRocketCount < 0 || smallRocketCount > 100){
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }
    public void launchBigRocket(){
        if (this.bigRocketCount > 0){
            this.bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket(){
        if (this.smallRocketCount > 0){
            this.smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }
    public int getTotalPower(){
        return this.bigRocketCount * 100 + this.smallRocketCount * 50;
    }
}
