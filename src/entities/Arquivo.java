package entities;

public class Arquivo {

	private String name;
	private String extension;
	private int size;

	public Arquivo(String name, String extension, int size) {
		this(name, extension);
		if (size <= 0) {
			throw new IllegalArgumentException("A file with size equal or smaller than 0 does not exist!");
		}
		this.size = size;
	}

	public Arquivo(String name, String extension) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("A name must be provided!");
		}
		if (extension == null || extension.isBlank()) {
			throw new IllegalArgumentException("A extension must be provided!");
		}
		this.name = name;
		this.extension = extension;
		this.size = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}	
	
	@Override
	public String toString() {
		return name + "." + extension;
	}
	
}
