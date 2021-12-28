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