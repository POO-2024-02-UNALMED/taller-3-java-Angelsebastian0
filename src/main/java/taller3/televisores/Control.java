package taller3.televisores;

public class Control {
    private TV tv;

    // Encender y apagar
    public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    // Cambio de canal
    public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }

    // Manejo de volumen
    public void volumenUp() {
        if (tv != null) {
            tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (tv != null) {
            tv.volumenDown();
        }
    }

    // Cambiar canal y volumen
    public void setCanal(int canal) {
        if (tv != null) {
            tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (tv != null) {
            tv.setVolumen(volumen);
        }
    }

    // Enlazar control con TV
    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
