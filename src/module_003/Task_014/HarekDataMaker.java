package module_003.Task_014;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet){
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        return new String[]{
                aggregateSingle(names[0], ""+ages[0], planets[0]),
                aggregateSingle(names[1], ""+ages[1], planets[1]),
                aggregateSingle(names[2], ""+ages[2], planets[2]),
        };
    }
}
