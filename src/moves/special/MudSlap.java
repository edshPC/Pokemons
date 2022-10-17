package moves.special;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
	
	public MudSlap() {
		super(Type.GROUND, 20, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		//Изменяем аккуратность на -1 до конца игры
		Functions.changeStat(p, Stat.ACCURACY, -1);
	}
	
	@Override
	protected String describe() {
		return "использует бросок грязью";
	}
}
