package app;

import entities.Arquivo;
import entities.Pasta;

public class Sistema {

	public static void main(String[] args) {
		Arquivo file1 = new Arquivo("7", "txt", 2048);
		Arquivo file2 = new Arquivo("2", "txt", 1024);
		Arquivo file3 = new Arquivo("3", "txt", 1024);
		Arquivo file4 = new Arquivo("4", "txt", 1024);
		Arquivo file5 = new Arquivo("7", "txt", 1024);
		Arquivo file6 = new Arquivo("6", "txt", 1024);
		Arquivo file7 = new Arquivo("7", "txt", 1024);

		Pasta main = new Pasta("main");
		Pasta sub = new Pasta("sub");
		Pasta subsub = new Pasta("sub-sub");
		main.add(sub);
		sub.add(subsub);
		
		main.add(file1);
		main.add(file6);
		sub.add(file2);
		sub.add(file5);
		subsub.add(file3);
		subsub.add(file4);
		subsub.add(file7);
		System.out.printf("Tamanho em bytes da %s: %d\n", main, main.tamanho());
		System.out.printf("Tamanho em bytes da %s: %d\n", sub, sub.tamanho());
		System.out.printf("Tamanho em bytes da %s: %d\n", subsub, subsub.tamanho());
		System.out.printf("Tamanho total da %s: %d\n", main, main.tamanhoTotal());
		System.out.printf("Tamanho total da %s: %d\n", sub, sub.tamanhoTotal());
		System.out.printf("Tamanho total da %s: %d\n", subsub, subsub.tamanhoTotal());
		
		System.out.printf("\n");
		int totalExcluded = main.excluir("7.txt", true);

		System.out.printf("Excluidos: %d\n", totalExcluded);
		System.out.printf("Tamanho em bytes da %s: %d\n", main, main.tamanho());
		System.out.printf("Tamanho em bytes da %s: %d\n", sub, sub.tamanho());
		System.out.printf("Tamanho em bytes da %s: %d\n", subsub, subsub.tamanho());
		System.out.printf("Tamanho total da %s: %d\n", main, main.tamanhoTotal());
		System.out.printf("Tamanho total da %s: %d\n", sub, sub.tamanhoTotal());
		System.out.printf("Tamanho total da %s: %d\n", subsub, subsub.tamanhoTotal());
	}

}