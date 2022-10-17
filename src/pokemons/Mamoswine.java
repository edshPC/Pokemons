package pokemons;

import moves.physical.StoneEdge;

public class Mamoswine extends Piloswine {
	public Mamoswine(String name, int level) {
		super(name, level);
		
		setStats(110, 130, 80, 70, 60, 80);
		//типы и предыдущие ходы унаследуются
		addMove(new StoneEdge());
		
	}
}
