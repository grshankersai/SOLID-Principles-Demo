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