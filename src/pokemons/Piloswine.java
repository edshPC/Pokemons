package pokemons;

import moves.status.Amnesia;

public class Piloswine extends Swinub {
	public Piloswine(String name, int level) {
		super(name, Math.max(level, 33)); //������� 33 ���
		
		setStats(100, 100, 80, 60, 60, 50);
		//���� � ���������� ���� ������������
		addMove(new Amnesia());
		
	}
}
