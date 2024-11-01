package listas.lista01;

public class Triangulo {
    private double lado1, lado2, lado3, altura, base;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = lado1;
    }

    public void setAltura(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public String obterTipo() {
        if (lado1 == lado2 && lado2 == lado3) return "Equilátero";
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) return "Isósceles";
        return "Escaleno";
    }
}
