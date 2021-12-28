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
