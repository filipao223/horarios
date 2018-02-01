package horarios;

import java.io.ObjectInputStream;
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

    boolean addAulas(Aula aulaArg, ArrayList<Aula> lista, ArrayList<Aula> jaUsado){
        ArrayList<Aula> temp = new ArrayList<>(lista);

        for(Aula aula:temp){
            System.out.println("A avaliar aula " + aula.toString());
            if(!verificaSobrepos(aula.data_ini, aula.data_fim) && Objects.equals(aula.dia, this.dia) && !jaUsado.contains(aula)){
                if(verificaPratica(aula) && Objects.equals(aulaArg.nome, aula.nome)) continue;
                listaAulas.add(aula);
                if(!verificaPratica(aula)){
                    jaUsado.add(aula);
                    lista.remove(aula);
                }
                else check = 1;
                System.out.println("Adicionou aula");
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

    boolean verificaPratica(Aula aula){
        if(Objects.equals(aula.turma, "T1") || Objects.equals(aula.turma, "TP1")) return true;
        else return false;
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
