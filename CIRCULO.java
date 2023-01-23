public class CIRCULO {
	int radio;
	public CIRCULO(){
		radio=178054;
	}
	public double calcularCircunferencia(){
		return 2*Math.PI*radio;
	}
	public double calcularArea() {
		return Math.PI*(Math.pow(radio, 2));
	}
	public void cambiarRadio(int radio2) {
		radio=radio2;
	}

}

