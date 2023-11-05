package nextOOP;


public class TypeOfCar extends Car{
    private int horseCount;
    private int speed;
    public TypeOfCar(String name, int door_count, String color, int horseCount,int speed) {
        super(name, door_count, color);
        this.horseCount=horseCount;
        this.speed=speed;
    }
    public void go(int speed){
        super.go(speed);
    }
    public void compare(int horseCount){
        System.out.println(getName()+" is better than Mercedes compared to "+horseCount);
    }

    public static void main(String[] args) {
        TypeOfCar typeOfCar = new TypeOfCar("BMW",2,"Black mat",2000,300);
        typeOfCar.go(300);
        typeOfCar.compare(2000);
    }
}
