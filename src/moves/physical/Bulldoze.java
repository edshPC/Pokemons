package moves.physical;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
	
	public Bulldoze() {
		super(Type.GROUND, 60, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		//Изменяем скорость на -1 до конца игры
		Functions.changeStat(p, Stat.SPEED, -1);
	}
	
	@Override
	protected String describe() {
		return "использует бульдозер";
	}
}
