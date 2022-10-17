package moves.physical;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
	
	public Crunch() {
		super(Type.DARK, 80, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		//�������� ������ �� -1 �� ����� ���� � ������ 0.2
		Functions.changeStat(p, Stat.DEFENSE, -1, 0.2);
	}
	
	@Override
	protected String describe() {
		return "������� � �������";
	}
}
