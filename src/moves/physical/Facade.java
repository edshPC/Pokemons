package moves.physical;

import ru.ifmo.se.pokemon.*;
import main.Functions;

public class Facade extends PhysicalMove {
	
	public Facade() {
		super(Type.NORMAL, 70, 100);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		Status[] doubleDamStats = {Status.BURN, Status.POISON, Status.PARALYZE};
																		//Если защищающийся покемон имеет какой либо
		if(Functions.arrContainsElem(doubleDamStats, def.getCondition())) {    //из этих эффектов, урон удваивается
			damage *= 2;
		}
		def.setMod(Stat.HP, (int) Math.round(damage));
	}
	
	@Override
	protected String describe() {
		return "использует фасад";
	}
}
