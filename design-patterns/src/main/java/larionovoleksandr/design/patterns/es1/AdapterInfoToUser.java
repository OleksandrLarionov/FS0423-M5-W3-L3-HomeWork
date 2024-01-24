package larionovoleksandr.design.patterns.es1;


import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
@Getter
@ToString
public class AdapterInfoToUser extends UserData{
    private Info info;
    public AdapterInfoToUser(Info info){
        super();
        this.info = info;
        adaptInfoToUser();
    }

    private void adaptInfoToUser(){
        setNomeCompleto(info.getNome() + " " + info.getCognome());
        setEta(calcolaEta(info.getDataDiNascita()));
        System.out.println("Nome completo: " + this.getNomeCompleto() + " , " + "età: " + this.getEta());
    }
    private int calcolaEta(LocalDate dataDiNascita){
        LocalDate oggi = LocalDate.now();
        Period periodo = Period.between(dataDiNascita, oggi);
        return periodo.getYears();
    }
}
