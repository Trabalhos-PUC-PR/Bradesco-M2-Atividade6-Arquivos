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

		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", main, main.tamanho(), main.totalFiles());
		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", sub, sub.tamanho(), sub.totalFiles());
		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", subsub, subsub.tamanho(), subsub.totalFiles());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", main, main.tamanhoTotal(), main.arquivosTotais());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", sub, sub.tamanhoTotal(), sub.arquivosTotais());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", subsub, subsub.tamanhoTotal(), subsub.arquivosTotais());
		
		System.out.printf("\n");
		int totalExcluded = main.excluir("7.txt", true);
		System.out.printf("Total de arquivos excluidos: %d\n", totalExcluded);
		
		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", main, main.tamanho(), main.totalFiles());
		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", sub, sub.tamanho(), sub.totalFiles());
		System.out.printf("Tamanho da pasta %s: %d bytes (%d arquivos, excluindo sub-pastas)\n", subsub, subsub.tamanho(), subsub.totalFiles());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", main, main.tamanhoTotal(), main.arquivosTotais());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", sub, sub.tamanhoTotal(), sub.arquivosTotais());
		System.out.printf("Tamanho total da %s: %d bytes (%d arquivos, incluindo sub-pastas)\n", subsub, subsub.tamanhoTotal(), subsub.arquivosTotais());		
	}
	
}