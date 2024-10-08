class Circulo {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    public double leerRadio() {
        return radio;
    }

    
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    
    public double circunferencia() {
        return 2 * Math.PI * radio;
    }
}


class Cilindro extends Circulo {
    protected double altura;

    
    public Cilindro(double radio, double altura) {
        super(radio); 
        this.altura = altura;
    }

    
    @Override
    public double area() {
        return 2 * Math.PI * radio * altura + 2 * super.area();
    }

    
    public double volumen() {
        return super.area() * altura;
    }
}


class CilindroHueco extends Cilindro {
    private double radioInterno;

    
    public CilindroHueco(double radioExterno, double radioInterno, double altura) {
        super(radioExterno, altura);
        this.radioInterno = radioInterno;
    }

  
    @Override
    public double circunferencia() {
        return 2 * Math.PI * (radio + radioInterno) + 2 * Math.PI * altura;
    }

    
    @Override
    public double area() {
        return 2 * Math.PI * altura * (radio + radioInterno) + 2 * Math.PI * (Math.pow(radio, 2) - Math.pow(radioInterno, 2));
    }

    @Override
    public double volumen() {
        return Math.PI * altura * (Math.pow(radio, 2) - Math.pow(radioInterno, 2));
    }
}


public class HerenciaFiguras {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        System.out.println(" Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

       
        Cilindro cilindro = new Cilindro(5, 10);
        System.out.println("Área del cilindro: " + cilindro.area());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());

        
        CilindroHueco cilindroHueco = new CilindroHueco(5, 3, 10);
        System.out.println("Área del cilindro hueco: " + cilindroHueco.area());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
        System.out.println("Longitud del cilindro hueco: " + cilindroHueco.circunferencia());
    }
}
