package entities;

import java.util.ArrayList;
import java.util.List;

public class Pasta {

	private List<Pasta> pastas;
	private List<Arquivo> arquivos;
	private String name;

	public Pasta(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("A name must be provided!");
		}
		this.name = name;
		pastas = new ArrayList<Pasta>();
		arquivos = new ArrayList<Arquivo>();
	}

	public void add(Pasta folder) {
		pastas.add(folder);
	}

	public void add(Arquivo file) {
		arquivos.add(file);
	}

	public long tamanho() {
		long size = 0;
		for (Arquivo file : arquivos) {
			size += file.getSize();
		}
		return size;
	}

	public int tamanhoTotal() {
		int cont = 0;
		for (Pasta folder : pastas) {
			cont += folder.tamanhoTotal();
		}
//		cont += tamanho();
		cont += totalFiles();
		return cont;
	}

	public int totalFiles() {
		return arquivos.size();
	}

	public int excluir(String fileName, boolean subDir) {
		int totalDeleted = 0;
		if(subDir) {
			for(Pasta folder : pastas) {
				totalDeleted = folder.excluir(fileName, subDir);
			}
		}
		for(int i = 0; i < arquivos.size(); i++) {
			if(fileName.equals(arquivos.get(i).toString())){
				arquivos.remove(i);
				totalDeleted++;
			}
		}
		return totalDeleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
