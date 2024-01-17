package a.orquerab.poketraining;

//Basic game example to let trainers fight with their pokemon against other trainers
public class Trainer extends CharacterCreator implements IExtraDataTrainer{
    private Boolean leagueWinner;

    public Trainer() {
        super();
    }
    public Trainer(String name) {
        super(name);
    }
    public Trainer(Boolean leagueWinner) {
        this.leagueWinner=leagueWinner;
    }

    public void trainerSentence(String name){
        System.out.println("\nHello there, my name is: "+name);
    }

}
