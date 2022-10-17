package moves.physical;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
	
	public StoneEdge() {
		super(Type.ROCK, 100, 80);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		double speed = att.getStat(Stat.SPEED);
		double chance = speed / 512 * 3; //���� ������������ ����� � 3 ���� ������
		if(chance > Math.random()) //���� ���� ��������
			return 2;
		return 1;
	}
	
	@Override
	protected String describe() {
		return "���������� �������� ����";
	}
}
