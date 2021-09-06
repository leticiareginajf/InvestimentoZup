package com.zup.InvestimentoZup.Simulacao;


import com.zup.InvestimentoZup.Usuario.UsuarioDTO;

import java.time.LocalDate;
import java.util.Date;

public class SimulacaoDTO {

    private UsuarioDTO valor;

    private double rendimento;
    private LocalDate dataR;

    public SimulacaoDTO(){

    }

    public UsuarioDTO getValor() {
        return valor;
    }

    public void setValor(UsuarioDTO valor) {
        this.valor = valor;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public LocalDate getDataR() {
        return dataR;
    }

    public void setDataR(LocalDate dataR) {
        this.dataR = dataR;
    }
}
