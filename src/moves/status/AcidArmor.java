package moves.status;

import ru.ifmo.se.pokemon.*;
import main.Functions;

public class AcidArmor extends StatusMove {
	
	public AcidArmor() {
		super(Type.POISON, 0, 0);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		//�������� ������ �� +2 �� ����� ����
		Functions.changeStat(p, Stat.DEFENSE, 2);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) { //������ �������
		return true;
	}
	
	@Override
	protected String describe() {
		return "���������� ��������� �����";
	}
}
