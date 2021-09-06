package com.zup.InvestimentoZup.Simulacao;

import com.zup.InvestimentoZup.Usuario.Usuario;

import java.time.LocalDate;

public class Simulacao {

    private Usuario valor;
    private LocalDate data;
    private double rendimento;

    public Simulacao(){

    }

    public Usuario getValor() {
        return valor;
    }

    public void setValor(Usuario valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
