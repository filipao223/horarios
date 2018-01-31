package horarios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Dia {
    String dia;
    ArrayList<Aula> listaAulas = new ArrayList<>();
    int check = 0;

    public Dia(String dia){
        this.dia = dia;
    }

    boolean addAulas(ArrayList<Aula> lista, ArrayList<Integer> ids, Horario horario){
        for(Aula aula:lista){
            if(aula.usado != 0 && !verificaSobrepos(aula.data_ini, aula.data_fim) && Objects.equals(aula.dia, this.dia) && !ids.contains(aula.id)){
                listaAulas.add(aula);
                if(!Objects.equals(aula.turma, "T1") && !Objects.equals(aula.turma, "TP1")) horario.ids.add(aula.id);
                else check = 1;
            }
        }
        if(check == 1) return true;
        else return false;
    }

    boolean verificaSobrepos(int data1, int data2){
        for(Aula aula:this.listaAulas){
            if(aula.data_ini > data1 && aula.data_fim < data2) return true;
            else if(aula.data_ini < data1 && aula.data_fim > data2) return true;
            else if(aula.data_ini < data1 && (aula.data_fim > data1 && aula.data_fim < data2)) return true;
            else if((aula.data_ini > data1 && aula.data_fim < data2) && aula.data_fim > data2) return true;
            else if(aula.data_ini == data1 && aula.data_fim == data2) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String ret = "";
        for(Aula aula:listaAulas){
            ret+= (" " + aula.toString());
        }
        return ret;
    }
}
