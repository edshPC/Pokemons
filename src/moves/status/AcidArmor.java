package moves.status;

import ru.ifmo.se.pokemon.*;
import main.Functions;

public class AcidArmor extends StatusMove {
	
	public AcidArmor() {
		super(Type.POISON, 0, 0);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		//Изменяем защиту на +2 до конца игры
		Functions.changeStat(p, Stat.DEFENSE, 2);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) { //всегда успешно
		return true;
	}
	
	@Override
	protected String describe() {
		return "использует кислотную броню";
	}
}
