package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
	
	public Tackle() {
		super(Type.NORMAL, 40, 100);
	}
	
	//без эффектов
	
	@Override
	protected String describe() {
		return "наносит простой удар";
	}
}
