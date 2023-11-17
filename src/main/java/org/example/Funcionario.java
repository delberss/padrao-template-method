package org.example;

public abstract class Funcionario {

    private int id;
    protected String nome;
    private double horasTrabalhadas;
    private double valorHora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

    public abstract String avaliarDesempenho();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", salario=" + this.calcularSalario() +
                ", desempenho=" + this.avaliarDesempenho() +
                '}';
    }
}