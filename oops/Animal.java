package oops;

public class Animal {
   public String color = "red";

    public String getAnimalDetails(String name) {
        String retStr = name + " - " + color;
        return retStr;
    }
}
