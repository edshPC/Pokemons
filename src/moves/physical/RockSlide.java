package moves.physical;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
	
	public RockSlide() {
		super(Type.ROCK, 75, 90);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect empty = new Effect().chance(0.3); //пустой эффект чтобы проверить шанс
		empty.turns(0); //чтобы убрался после хода
		p.addEffect(empty); //пытаемся добавить
		if(empty.success()) //если сработал накладываем страх (у страха нет реализованого шанса)
			Effect.flinch(p);
	}
	
	@Override
	protected String describe() {
		return "использует катящиеся камни";
	}
}
