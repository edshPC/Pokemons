package moves.status;

import ru.ifmo.se.pokemon.*;
import main.Functions;

public class Amnesia extends StatusMove {
	
	public Amnesia() {
		super(Type.PSYCHIC, 0, 0);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		//Изменяем спец защиту на +2 до конца игры
		Functions.changeStat(p, Stat.SPECIAL_DEFENSE, 2);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) { //всегда успешно
		return true;
	}
	
	@Override
	protected String describe() {
		return "использует амнезию";
	}
}
