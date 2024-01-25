package larionovoleksandr.design.patterns.es1;


import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
@Getter
@ToString
//da implementare
public class AdapterInfoToUser implements DataSource{
    private Info info;
    public AdapterInfoToUser(Info info){
        this.info = info;
        getNomeCompleto();
        getEta();
    }


    @Override
    public String getNomeCompleto() {
       return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate oggi = LocalDate.now();
        Period periodo = Period.between(info.getDataDiNascita(), oggi);
        return periodo.getYears();
    }
}
