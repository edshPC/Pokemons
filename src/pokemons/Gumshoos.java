package pokemons;


import moves.physical.Bulldoze;

public class Gumshoos extends Yungoos {
	public Gumshoos(String name, int level) {
		super(name, Math.max(level, 20));  //покемон может быть минимум 20 лвл
		setStats(88, 110, 60, 55, 60, 45);
		//тип и ходы унаследуется от предыдущего, остается только добавить недостающий
		addMove(new Bulldoze());		
	}
}
