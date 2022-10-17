package moves.status;

import ru.ifmo.se.pokemon.*;
import main.Functions;

public class Amnesia extends StatusMove {
	
	public Amnesia() {
		super(Type.PSYCHIC, 0, 0);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		//�������� ���� ������ �� +2 �� ����� ����
		Functions.changeStat(p, Stat.SPECIAL_DEFENSE, 2);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def) { //������ �������
		return true;
	}
	
	@Override
	protected String describe() {
		return "���������� �������";
	}
}
