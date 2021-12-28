// S : Single Responsibility
/*
class SingleResponsibilityViolation{
    private String type_of_employee;
    private int employee_id;
    private int rating;
    private int tip;

    public SingleResponsibilityViolation(String type,int id,int rate,int tip){
        this.type_of_employee=type;
        this.employee_id = id;
        this.rating = rate;
        this.tip = tip;

    }
    public void chef_cooking(){
        System.out.println("The chef is cooking");
    }
    public void room_cleaning(){
        System.out.println("The housekeeping is going on..")
    }
}
*/






// O : Open-Close Principle


// Violation implies modifying the chef class..
/*
class Chef {
    private String name;
    private int emp_id;
    private boolean michelin;

    public Chef(String name, int id, boolean val) {
        this.name = name;
        this.emp_id = id;
        this.michelin = val;
    }

    public void namesOfDishes() {
        System.out.println("Chicken biryani, Apollo fish , Kadai paneer");
    }

    public void newItalianDish(){
        System.out.println("Pizza , Burger , Pasta");
    }
}*/

// L : Liskov Principle:

/*
class ItalianChef extends Chef{

    private int no_of_spl_dishes;

    public ItalianChef(String name , int id , boolean val , int dish_count){
        super(name,id,val);
        this.no_of_spl_dishes = dish_count;
    }

    public void Spl_dishes(){
        System.out.println("Pizza , Burger , Pasta");
    }

    // Overriding the names of dishes method from parent class:

    @Override
    public void namesOfDishes() {
        System.out.println("I dont know to cook the old dishes.")
    }
}

*/


//I : Interface Segregation

/*
interface splHousekeepingTasks{
    void decorate();
    void decorate_room();
    void clean_room();
}

*/

// D : Dependency Inversion
// Sample code DOI
/*
class HotelRecruitmentTeam{
    private Manager manager1;
    public HotelRecruitmentTeam(){
        manager1 = new Manager();
    }

}
*/
public class Restaurant {
        public static void main(String args[]){
            //S : Single Responsibility::
            Chef chef3 = new Chef("Ramesh",3004,false);
            Waiter waiter1 = new Waiter("Rakesh",4001,5);
            Housekeeping keeper1 = new Housekeeping("Pratik",7001,550);

            Introduction intro1 = new Introduction(chef3);
            Introduction intro2 = new Introduction(waiter1);
            Introduction intro3 = new Introduction(keeper1);


            // L : Liskov Substitution Rule:
            Chef chef1 = new Chef("Sanjeev",3001,true);
            chef1.namesOfDishes();
            ItalianChef chef2 = new ItalianChef("Robert",3009,false,5);
            chef2.namesOfDishes();
            chef2.Spl_dishes();

            //Creating and calling Spl room service
            SplRoomService server1 = new SplRoomService("Ramesh",2001,500);
            server1.decorate();
            server1.decorate_room();


            // Dependency Inversion:
           HotellRecruitmentTeam obj1 = new HotellRecruitmentTeam();

        }
}
