package taller3.televisores;


public class Control {
	TV tv;
	// estado
	public void turnOn() {
		tv.turnOn(true);
	}
	public void turnOff() {
		tv.turnOff(false);
	}
	
	// cambio de canal
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	
	// manejo de volumen
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	
	// set canal y set volumen
	public int setCanal(int canal) {
		return tv.canal;
		
	}
	public int setVolumen(int volumen) {
		return tv.volumen;
	}
	
	//enlazar
	public void enlazar(TV tv) {
		this.tv = tv;
		
		tv.setControl(this);
	}
	public TV getTv() {
		return tv;
	}
    public void setTv(TV tv2) {
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}