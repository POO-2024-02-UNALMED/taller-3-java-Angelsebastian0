package taller3.televisores;

public class TV {
	int canal = 1;
	int precio = 500;
	int volumen = 1;
	boolean estado;
	Marca marca;
	Control control;
	static int numTv;
	
	TV(Marca marca, boolean estado ){//constructor marca, volumen 
		this.marca = marca;
		this.estado = estado;
	}
	// metodos set y get de los atributos
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	public Marca getMarca(){
		return marca;
	}
	public void setCanal(int canal){
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio(){
		return precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
    public void setControl(Control control) {
    	this.control = control;
    }
    public Control getControl() {
    	return control;
    }
    //contar
       	
    public TV() {
    	numTv++;   	
    }
    public static int contador() {
    	return numTv;
    }
    
    //apagado y encendido
    
    public void turnOn(boolean estado) {
    	if(estado == true) {
    		this.estado = true;
    	}
    }
    public void turnOff(boolean estado) {
    	if(estado == false) {
    		this.estado = false;
    	}
    }
    //retornar valor del atributo estado
    public boolean getEstado() {
    	return estado;
    }
    
    //metodos canalUp y canalDown
    
    public void canalUp () {
    	if(estado == true) {
    		if(this.canal >= 1 && this.canal <= 119) {
    			this.canal ++;
    		}
    	}
    	
    }
    public void canalDown() {
    	if(estado == false) {
    		if(this.canal >= 2 && this.canal <= 120) {
    			this.canal --;
    		}
    	}
    	
    }
    //metodos volumenUp, y volumenDown
    
    public void volumenUp () {
    	if(estado == true) {
    		if(this.volumen >= 0 && this.volumen <= 6) {
    			this.volumen ++;
    		}
    	}
    	
    }
    public void volumenDown() {
    	if(estado == false) {
    		if(this.volumen >= 1 && this.volumen <= 7) {
    			this.volumen --;
    		}
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}