public class Bola {
	
	private int tamanho = 10;
	private String material = "Couro";
	
	public Bola(int tamanho) {
		setTamanho(tamanho);
	}
	public Bola(String material) {
		setMaterial(material);
	}
	
	public Bola(int tamanho, String material) {
		setMaterial(material);
		setTamanho(tamanho);
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		if(tamanho > 0 )
			this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		if(material.length()>4)
			this.material = material;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bola [tamanho=");
		builder.append(tamanho);
		builder.append(", material=");
		builder.append(material);
		builder.append("]");
		return builder.toString();
	}
	
}
