package org.example;

import static java.lang.Integer.parseInt;

public class PicoPlaca {

    public boolean tienePicoPlaca(String ciudad, String dia, String placa) {
        boolean resultado = false;
        ciudad = ciudad.toUpperCase();
        dia = dia.toUpperCase();
        placa = placa.toUpperCase();

        if (placa == null || placa.length() == 0) {
            throw new IllegalArgumentException("");
        }
        int ultimoDigito = Integer.parseInt(String.valueOf(placa.charAt(5)));//Ultimo digito de la placa
        if (ciudad.equals("BOGOTA")) {
            switch (dia) {
                case "LUNES":
                    resultado = ultimoDigito == 3 || ultimoDigito == 4;
                    break;
                case "MARTES":
                    resultado = ultimoDigito == 5 || ultimoDigito == 6;
                    break;
                case "MIERCOLES":
                    resultado = ultimoDigito == 7 || ultimoDigito == 8;
                    break;
                case "JUEVES":
                    resultado = ultimoDigito == 9 || ultimoDigito == 0;
                    break;
                case "VIERNES":
                    resultado = ultimoDigito == 1 || ultimoDigito == 2;
                    break;
                case "SABADO":
                    break;
                case "DOMINGO":
                    break;

            }
        }
        return resultado;
    }
}
