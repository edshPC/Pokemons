package pokemons;


import moves.physical.*;
import moves.special.MudSlap;
import ru.ifmo.se.pokemon.*;

public class Yungoos extends Pokemon {
	public Yungoos(String name, int level) {
		super(name, level);
		
		setStats(48, 70, 30, 30, 30, 45);
		setType(Type.NORMAL);
		setMove(new MudSlap(), new Tackle(), new Crunch());
		
	}
}
