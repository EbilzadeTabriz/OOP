public class Manager extends employee {

    private int chargedMan;
    private int added;

    public Manager(String name, int salary, String department, int chargedMan,int added) {
        super(name, salary, department);
        this.chargedMan = chargedMan;
        this.added  = added;
    }
public void promoteSalary(int amountPromotion){
        if(amountPromotion!=0){
            added = added+amountPromotion;
            System.out.println("Increased salary: "+ added);
        }
    System.out.println("to employees " +added+ " promotion");


}

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" charged man : "+this.chargedMan);
        System.out.println("Total salary : "+(this.added+getSalary())+"for this month");


    }
//Subclass
}
