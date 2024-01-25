package larionovoleksandr.design.patterns.es2;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Pagina implements Component {
    private int indicePagina;
    public Pagina(int indicePagina){
        this.indicePagina = indicePagina;
    }
    @Override
    public void stampa() {
        System.out.println(indicePagina);
    }

    @Override
    public int getNumeroDiPagine() {
        return 1;
    }
}
