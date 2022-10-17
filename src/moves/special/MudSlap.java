package moves.special;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
	
	public MudSlap() {
		super(Type.GROUND, 20, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		//�������� ������������ �� -1 �� ����� ����
		Functions.changeStat(p, Stat.ACCURACY, -1);
	}
	
	@Override
	protected String describe() {
		return "���������� ������ ������";
	}
}
