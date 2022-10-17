package moves.physical;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
	
	public RockSlide() {
		super(Type.ROCK, 75, 90);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect empty = new Effect().chance(0.3); //������ ������ ����� ��������� ����
		empty.turns(0); //����� ������� ����� ����
		p.addEffect(empty); //�������� ��������
		if(empty.success()) //���� �������� ����������� ����� (� ������ ��� ������������� �����)
			Effect.flinch(p);
	}
	
	@Override
	protected String describe() {
		return "���������� ��������� �����";
	}
}
