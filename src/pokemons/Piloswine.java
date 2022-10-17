package pokemons;

import moves.status.Amnesia;

public class Piloswine extends Swinub {
	public Piloswine(String name, int level) {
		super(name, Math.max(level, 33)); //минимум 33 лвл
		
		setStats(100, 100, 80, 60, 60, 50);
		//типы и предыдущие ходы унаследуются
		addMove(new Amnesia());
		
	}
}
