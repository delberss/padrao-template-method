package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {
    @Test
    void deveRetornarSalario() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setValorHora(100.0);
        funcionario.setHorasTrabalhadas(160);
        assertEquals(16000.0, funcionario.calcularSalario());
    }

    @Test
    void deveAvaliarDesempenhoComoExcelente() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setValorHora(100.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Excelente", funcionario.avaliarDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoBom() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setValorHora(70.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Bom", funcionario.avaliarDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoRegular() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setValorHora(69.0);
        funcionario.setHorasTrabalhadas(100);
        assertEquals("Regular", funcionario.avaliarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setValorHora(100.0);
        funcionario.setHorasTrabalhadas(160);
        funcionario.setNome("Maria");
        funcionario.setId(2);
        assertEquals("FuncionarioMensalista{id=2, nome='Maria', salario=16000.0, desempenho=Excelente}", funcionario.getInfo());
    }
}