package next2OOP;

public class Manager extends Worker {
    private int chargedMan_count;

    public Manager(int id, String name, String secondName,int chargedMan_count) {
        super(id, name, secondName);
        this.chargedMan_count =chargedMan_count;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Manager is charged appropriately: "+chargedMan_count);
    }
    public void promote(int promotionAmount){

        System.out.println(getName()+" promoted "+promotionAmount);
    }
}
