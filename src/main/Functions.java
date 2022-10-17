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
		changeStat(p, stat, delta, 1.0); //если шанс не задан ставим 1 по умолчанию
	}
	public static void changeStat(Pokemon p, Stat stat, int delta, double chance) {
		Effect statChange = new Effect();	
		int prevStat = (int)p.getStat(stat);  //получаем предыдущее
		statChange.stat(stat, prevStat+delta);   //изменяем
		statChange.turns(-1);          //до конца игры
		statChange.chance(chance);    //шанс
		p.addEffect(statChange);
		if(statChange.success())  //если эффект сработал - сообщение в консоль
			System.out.println(p + " получает " + (delta>0? "+":"") + delta + " к " + stat);
	}

}
