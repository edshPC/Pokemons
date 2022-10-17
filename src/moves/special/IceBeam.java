package moves.special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
	
	public IceBeam() {
		super(Type.ICE, 90, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if(p.hasType(Type.ICE)) //���� ���� ������� ��� ������ �� �����������
			return;
		
		Effect freeze = new Effect().condition(Status.FREEZE).chance(0.1); //������ ����������� ��� � ������ 0.1
		p.addEffect(freeze);
	}
	
	@Override
	protected String describe() {
		return "���������� ������� ���";
	}
}
