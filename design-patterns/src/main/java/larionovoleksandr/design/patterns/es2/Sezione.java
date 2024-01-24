package larionovoleksandr.design.patterns.es2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Component {
    private String nomeSezione;
    private List<Component> components = new ArrayList<>();

    public Sezione(String nomeSezione) {
        this.nomeSezione = nomeSezione;
    }

    public void addComponent(Component component){
        components.add(component);
    }
    @Override
    public void stampa() {
        System.out.println("Sezione: " + nomeSezione);
        for (Component component : components) {
            component.stampa();
        }
    }

    @Override
    public int getNumeroDiPagine() {
        int total = 0;
        for (Component component : components) {
            total += component.getNumeroDiPagine();
        }
        return total;
    }

}
