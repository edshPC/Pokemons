package pokemons;


import moves.physical.*;
import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public class Phione extends Pokemon {
	public Phione(String name, int level) {
		super(name, level);
		
		setStats(80, 80, 80, 80, 80, 80);
		setType(Type.WATER);
		setMove(new Facade(), new IceBeam(), new DoubleTeam(), new AcidArmor());
		
	}
}
