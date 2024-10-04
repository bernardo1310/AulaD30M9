public class BolaMain {
	public static void main(String[] args) {
		Bola b1 = new Bola(20);
		Bola b2 = new Bola("Plastico");
		Bola b3 = new Bola(15,"Papel");
		Bola b4 = b3;
		
		b1.setMaterial("Plastico");
		b2.setTamanho(45);
		
		/*System.out.println(b.getTamanho());
		System.out.println(b.getMaterial());*/
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		
		
	}
}
