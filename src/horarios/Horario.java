package horarios;

import java.io.IOException;
import java.util.ArrayList;

public class Horario {
    ArrayList<Dia> diasSemana = new ArrayList<>();
    int numero, check=0;

    public Horario(int num, ArrayList<Aula> listaAulas, Aula aula, ArrayList<Aula> jaUsado) throws Excepcao{
        this.numero = num;
        diasSemana.add(new Dia("segunda"));
        diasSemana.add(new Dia("terca"));
        diasSemana.add(new Dia("quarta"));
        diasSemana.add(new Dia("quinta"));
        diasSemana.add(new Dia("sexta"));
        for(Dia dia:diasSemana){
            System.out.println("A criar dia " + dia.dia);
            if(!dia.addAulas(aula, listaAulas, jaUsado)) check =1;
            System.out.println("Adicionou dia: " + dia.dia + " " + dia.toString());
        }
        if(check==1) throw new Excepcao("Fim");
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
