package horarios;

import java.io.IOException;
import java.util.ArrayList;

public class Horario {
    ArrayList<Dia> diasSemana = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    int numero;

    public Horario(int num, ArrayList<Aula> listaAulas){
        this.numero = num;
        diasSemana.add(new Dia("segunda"));
        diasSemana.add(new Dia("terca"));
        diasSemana.add(new Dia("quarta"));
        diasSemana.add(new Dia("quinta"));
        diasSemana.add(new Dia("sexta"));
        for(Dia dia:diasSemana){
            if(!dia.addAulas(listaAulas, ids, this)) throw new IllegalArgumentException("INVALID");
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for(Dia dia:diasSemana){
            ret += (" " + dia.toString());
        }
        return ret;
    }
}
