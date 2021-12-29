class Chef{
    private String name;
    private int employeeId;
    private boolean michelin;

    public Chef(String name , int id , boolean isMichelin){
        this.name = name;
        this.employeeId = id;
        this.michelin = isMichelin;
    }

    public void namesOfDishes(){
        System.out.println("Chicken biryani, Apollo fish , Kadai paneer");
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean isMichelin() {
        return michelin;
    }
}