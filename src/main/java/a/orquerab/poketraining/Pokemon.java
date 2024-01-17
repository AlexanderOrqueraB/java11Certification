package a.orquerab.poketraining;

public class Pokemon extends CharacterCreator implements IExtraDataPokemon {
    private String name;
    public Pokemon (){
        super();
    }
    public Pokemon(String name){
        super(name);
    }

    public void pokemonSentence(String name){
        if (name.equals("charmander"))
            System.out.println("Char char, my name is: "+name);
        if (name.equals("squirtle"))
            System.out.println("Squirtle squir, my name is: "+name);
        if (name.equals("bulbasaur"))
            System.out.println("I am rubbish, but my name is: "+name);
    }
}
