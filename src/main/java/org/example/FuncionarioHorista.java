package org.example;

public class FuncionarioHorista extends Funcionario {

    @Override
    public String avaliarDesempenho() {
        double salario = calcularSalario();
        if (salario >= 5000) {
            return "Excelente";
        } else if (salario >= 3000) {
            return "Bom";
        } else {
            return "Regular";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioHorista";
    }
}