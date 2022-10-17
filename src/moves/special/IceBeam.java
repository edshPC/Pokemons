package moves.special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
	
	public IceBeam() {
		super(Type.ICE, 90, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if(p.hasType(Type.ICE)) //≈сли есть лед€ной тип ничего не накладываем
			return;
		
		Effect freeze = new Effect().condition(Status.FREEZE).chance(0.1); //Ёффект накладывает лед с шансом 0.1
		p.addEffect(freeze);
	}
	
	@Override
	protected String describe() {
		return "использует лед€ной луч";
	}
}
