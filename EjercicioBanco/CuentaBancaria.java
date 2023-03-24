package EjercicioBanco;

import java.util.*;

public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private ArrayList<String> movimientos;

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }

    // No se van a hacer setters ya que en el enunciado nos indican que estos no van
    // a poder cambiar.
    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double numero) {
        saldo += numero;
        if (numero > 3000) {
            System.out.println("Se va a notificar a Hacienda sobre este ingreso.");
        }
        if (saldo < -50) {
            System.out.println("Aviso. Saldo negativo");
        }
        movimientos.add("Se ha ingresado " + numero + " Su saldo actual es; " + saldo);
    }

    public void retirar(double numero) {
        saldo -= numero;
        if (numero > 3000) {
            System.out.println("Se va a notificar a Hacienda sobre este ingreso.");
        }
        if (saldo < -50) {
            System.out.println("Aviso. Saldo negativo");
        }
        movimientos.add("Se ha retirado " + numero + " Su saldo actual es: " + saldo);
    }

}
