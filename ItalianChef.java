class ItalianChef extends Chef{

    private int numberOfDishes;

    public ItalianChef(String name , int id , boolean val , int numberOfDishes){
        super(name,id,val);
        this.numberOfDishes = numberOfDishes;
    }

    public void specialDishes(){
        System.out.println("Pizza , Burger , Pasta");
    }
}
