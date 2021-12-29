class SpecialRoomService extends Housekeeping implements RoomDecoration,FloralArranger{
    public SpecialRoomService(String name , int id, int tip){
        super(name,id,tip);
    }
    public void decorateRoom(){
        System.out.println("Room decorated");
    }
    public void flowerDecoration(){
        System.out.println("Special Flower Arrangement done");
    }
}