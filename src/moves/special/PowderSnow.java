package moves.special;

import ru.ifmo.se.pokemon.*;

public class PowderSnow extends SpecialMove {
	
	public PowderSnow() {
		super(Type.ICE, 40, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if(p.hasType(Type.ICE)) //Если есть ледяной тип ничего не накладываем
		return;
		
		Effect freeze = new Effect().condition(Status.FREEZE).chance(0.1); //Эффект накладывает лед с шансом 0.1
		p.addEffect(freeze);
	}
	
	@Override
	protected String describe() {
		return "использует усиленный снег";
	}
}
