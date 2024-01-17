package a.orquerab.poketraining;

public class CharacterCreator {
    private String name;
    public CharacterCreator (){
    }
    public CharacterCreator (String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
