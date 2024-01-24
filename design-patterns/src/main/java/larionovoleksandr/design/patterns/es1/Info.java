package larionovoleksandr.design.patterns.es1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

}
