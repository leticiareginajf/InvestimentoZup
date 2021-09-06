package com.zup.InvestimentoZup.Simulacao;


import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SimulacaoService {

    public LocalDate calculo(int meses){
        return LocalDate.now().plusMonths(meses);
    }

}
