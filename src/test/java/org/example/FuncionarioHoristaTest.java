package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {
    @Test
    void deveRetornarSalario() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setValorHora(50.0);
        funcionario.setHorasTrabalhadas(160);
        assertEquals(8000.0, funcionario.calcularSalario());
    }

    @Test
    void deveAvaliarDesempenhoComoExcelente() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setValorHora(50.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Excelente", funcionario.avaliarDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoBom() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setValorHora(30.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Bom", funcionario.avaliarDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoRegular() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setValorHora(29.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Regular", funcionario.avaliarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setValorHora(50.0);
        funcionario.setHorasTrabalhadas(100);
        funcionario.setNome("João");
        funcionario.setId(1);
        assertEquals("FuncionarioHorista{id=1, nome='João', salario=5000.0, desempenho=Excelente}", funcionario.getInfo());
    }
}