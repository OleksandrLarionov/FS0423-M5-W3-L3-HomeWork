package larionovoleksandr.design.patterns.es1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserData implements DataSource {
    private String nomeCompleto;
    public int eta;
    public void getData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}
