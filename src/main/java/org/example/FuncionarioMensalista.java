package org.example;

public class FuncionarioMensalista extends Funcionario {

    @Override
    public String avaliarDesempenho() {
        double salario = calcularSalario();
        if (salario >= 10000) {
            return "Excelente";
        } else if (salario >= 7000) {
            return "Bom";
        } else {
            return "Regular";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioMensalista";
    }
}