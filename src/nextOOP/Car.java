package nextOOP;

public class Car {
    private String name;
    private  int door_count;
    private String color;

    public Car(String name, int door_count, String color) {
        this.name = name;
        this.door_count = door_count;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoor_count() {
        return door_count;
    }

    public void setDoor_count(int door_count) {
        this.door_count = door_count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void go(int speed){
        System.out.println(name+" is going through "+speed);
    }
}
