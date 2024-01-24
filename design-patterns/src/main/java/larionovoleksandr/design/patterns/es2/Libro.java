package larionovoleksandr.design.patterns.es2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Component{
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<Component> components = new ArrayList<>();

    public Libro(String title, List<String> authors, double price) {
        this.titolo = title;
        this.autori = authors;
        this.prezzo = price;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void stampa()  {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: $" + prezzo);
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

