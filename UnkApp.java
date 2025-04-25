public class UnkApp {

    private final Unk unk;

    public UnkApp(Unk unk){
        this.unk=unk;
    }

    public void SaveTeam(){
        if(this.unk != null){
            this.unk.unk();
        }
        else{
            System.out.println("IS NULL");
        }
    }
    
}
