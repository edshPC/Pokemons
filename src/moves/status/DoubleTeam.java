package moves.status;

import main.Functions;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
	
	public DoubleTeam() {
		super(Type.NORMAL, 0, 0);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		//�������� ��������� �� +1 �� ����� ����
		Functions.changeStat(p, Stat.EVASION, 1);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) { //������ �������
		return true;
	}
	
	@Override
	protected String describe() {
		return "���������� ������� �������";
	}
}
