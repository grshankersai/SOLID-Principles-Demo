class HotelRecruitmentTeam{
    private Process manager;
    private Process humanResource;


    public HotelRecruitmentTeam(Process manager , Process humanResource){
        this.manager = manager;
        this.humanResource = humanResource;
        manager.recruitProcess();
        humanResource.recruitProcess();


    }

}

/*
 public HotelRecruitmentTeam(Process object[]){
        for(Process p: object)
              p.recuritProcess();
    }
 */
