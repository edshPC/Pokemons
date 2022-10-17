package main;

import ru.ifmo.se.pokemon.*;

public class Functions {

	public static <T> boolean arrContainsElem(T[] array, T elem) {
		for (T check : array)
			if (elem == check)
				return true;
		return false;
	}
	
	public static void changeStat(Pokemon p, Stat stat, int delta) {
		changeStat(p, stat, delta, 1.0); //���� ���� �� ����� ������ 1 �� ���������
	}
	public static void changeStat(Pokemon p, Stat stat, int delta, double chance) {
		Effect statChange = new Effect();	
		int prevStat = (int)p.getStat(stat);  //�������� ����������
		statChange.stat(stat, prevStat+delta);   //��������
		statChange.turns(-1);          //�� ����� ����
		statChange.chance(chance);    //����
		p.addEffect(statChange);
		if(statChange.success())  //���� ������ �������� - ��������� � �������
			System.out.println(p + " �������� " + (delta>0? "+":"") + delta + " � " + stat);
	}

}
