package moves.physical;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
	
	public Bulldoze() {
		super(Type.GROUND, 60, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		//�������� �������� �� -1 �� ����� ����
		Functions.changeStat(p, Stat.SPEED, -1);
	}
	
	@Override
	protected String describe() {
		return "���������� ���������";
	}
}
