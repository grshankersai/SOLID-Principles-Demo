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