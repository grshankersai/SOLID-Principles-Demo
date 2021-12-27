// S : Single Responsibility

class Chef{
    private String name;
    private int emp_id;
    private boolean michelin;

    public Chef(String name , int id , boolean val){
        this.name = name;
        this.emp_id = id;
        this.michelin = val;
    }

    public void namesOfDishes(){
        System.out.println("Chicken biryani, Apollo fish , Kadai paneer");
    }

    public String getName() {
        return name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public boolean isMichelin() {
        return michelin;
    }
}

class Waiter{
    private String name;
    private int emp_id;
    private int rating;

    public Waiter(String name , int id , int rate){
        this.name = name;
        this.emp_id = id;
        this.rating = rate;
       }

    public String getName() {
        return name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getRating() {
        return rating;
    }
    // few methods..

}
class Housekeeping{
    private String name;
    private int emp_id;
    private int tip;
    public Housekeeping(String name , int id, int tip){
        this.name = name;
        this.emp_id = id;
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getTip() {
        return tip;
    }
    // few methods.

}

class Introduction{
    public Introduction(){

    }
    public Introduction(Chef ob1){
        System.out.println("Hello I am a chef");
        System.out.println("My name is : "+ob1.getName());
        System.out.println("My Employee Id is "+ob1.getEmp_id());
       String val= ob1.isMichelin() ?  "I am a Mitchlin Star chef" :  "I am  not a Mitchlin Star chef" ;
       System.out.println(val);
    }
    public Introduction(Waiter ob1){
        System.out.println("Hello I am a Waiter");
        System.out.println("My name is : "+ob1.getName());
        System.out.println("My Employee Id is "+ob1.getEmp_id());
        System.out.println("My rating is "+ ob1.getRating());

    }
    public Introduction(Housekeeping ob1){
        System.out.println("Hello I am a HouseKeeper");
        System.out.println("My name is : "+ob1.getName());
        System.out.println("My Employee Id is "+ob1.getEmp_id());
        System.out.println("My rating is "+ ob1.getTip());

    }
}

// O : Open-Close Principle

class ItalianChef extends Chef{

    private int no_of_spl_dishes;

    public ItalianChef(String name , int id , boolean val , int dish_count){
        super(name,id,val);
        this.no_of_spl_dishes = dish_count;
    }

    public void Spl_dishes(){
        System.out.println("Pizza , Burger , Pasta");
    }
}

//I : Interface Segregation

interface RoomCleaning{
    void clean_room();
}

interface RoomDecoration{
    void decorate_room();
}
interface FloralArranger{
    void decorate();
}

class SplRoomService extends Housekeeping implements RoomDecoration,FloralArranger{
    public SplRoomService(String name , int id, int tip){
        super(name,id,tip);
    }
    public void decorate_room(){
        System.out.println("Room decorated");
    }
    public void decorate(){
        System.out.println("Special Flower Arrangement done");
    }
}

// D : Dependency Inversion

class Problem{
    private String text;
    public Problem(String value){
        this.text = value;
    }
    public String return_statement(){
        return this.text;
    }
}

interface Manager{
    static void resolve(Problem obj){
        System.out.println(obj.return_statement() + "Will be resolved");
    }

}

class Management{

    public Management(Problem obj){
        Manager.resolve(obj);
    }
}



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
            Problem my_problem = new Problem("Room not clear");
            Management mang = new Management(my_problem);


        }
}
