package main;

import java.util.Scanner;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Привет! Набери покемонов в первую команду (или пустые строки для авто).");
		System.out.println("Введи тип, имя и уровень покемона через пробел, и пустую строку когда закончишь набор.");
		System.out.println("Типы покемонов:\n1. Phione\n2. Yungoos\n3. Gumshoos\n4. Swinub\n5. Piloswine\n6. Mamoswine");
		
		Battle bat = new Battle();
		
		addPokemonsToBattle(bat, true);
		System.out.println("Теперь набери покемонов во вторую команду.");
		addPokemonsToBattle(bat, false);
		
		bat.go();

	}
	
	public static void addPokemonsToBattle(Battle bat, boolean isAlly) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			String enter = sc.nextLine();
			if(enter.isEmpty())
				break;
			String[] splitLine = enter.split(" ");
			if(splitLine.length < 3) { //Если менее 3 слов неуспешно
				System.out.println("Не введены все аргументы, попробуй еще раз");
				continue;
			}
			int level, id;
			try {
				id = Integer.valueOf(splitLine[0]);
				level = Integer.valueOf(splitLine[splitLine.length - 1]);
			} catch (NumberFormatException e) { //если не получилось перевести в int неуспешно
				System.out.println("Неправильно введён тип или уровень, попробуй еще раз");
				continue;
			}
			String name = "";
			for(int j = 1; j < splitLine.length-1; j++) { //Собираем имя покемона
				name += splitLine[j];
				if(j < splitLine.length-2)
					name += ' ';
			}
			if(isAlly)
				switch (id) {
					case 1 -> bat.addAlly(new Phione(name, level));
					case 2 -> bat.addAlly(new Yungoos(name, level));
					case 3 -> bat.addAlly(new Gumshoos(name, level));
					case 4 -> bat.addAlly(new Swinub(name, level));
					case 5 -> bat.addAlly(new Piloswine(name, level));
					case 6 -> bat.addAlly(new Mamoswine(name, level));
					default -> {System.out.println("Такого покемона не существует, попробуй еще раз");
						count--;}
				}
			else
				switch (id) {
					case 1 -> bat.addFoe(new Phione(name, level));
					case 2 -> bat.addFoe(new Yungoos(name, level));
					case 3 -> bat.addFoe(new Gumshoos(name, level));
					case 4 -> bat.addFoe(new Swinub(name, level));
					case 5 -> bat.addFoe(new Piloswine(name, level));
					case 6 -> bat.addFoe(new Mamoswine(name, level));
					default -> {System.out.println("Такого покемона не существует, попробуй еще раз");
						count--;}
			}
		}
		if(count == 0) {
			System.out.println("Ты не указал ни одного покемона. Автоматически добавлено 3");
			if(isAlly) {
				bat.addAlly(new Phione("Фион", 50));
				bat.addAlly(new Gumshoos("Гамшус", 50));
				bat.addAlly(new Piloswine("Папа Свин", 50));
			}
			else {
				bat.addFoe(new Yungoos("Гусь", 50));
				bat.addFoe(new Swinub("Свин", 50));
				bat.addFoe(new Mamoswine("Мама Свин", 50));
			}
		}
		if(!isAlly)
			sc.close();
	}

}

