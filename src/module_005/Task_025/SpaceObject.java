package module_005.Task_025;

abstract class SpaceObject {
}

abstract class Planet extends SpaceObject {
}

class Mars extends Planet{
}

class Moon extends SpaceObject{
}

class PlanetTester{
    public String test(SpaceObject object){
        if(object instanceof Planet){
            return "true";
        }
        return "false";
    }
}