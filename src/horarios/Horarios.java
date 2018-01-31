package horarios;

import java.io.IOException;
import java.util.ArrayList;

public class Horarios {
    ArrayList<Horario> horarios = new ArrayList<>();
    ArrayList<Aula> listaAulas = new ArrayList<>();
    ArrayList<Dia> listaSegunda = new ArrayList<>();
    ArrayList<Dia> listaTerca = new ArrayList<>();
    ArrayList<Dia> listaQuarta = new ArrayList<>();
    ArrayList<Dia> listaQuinta = new ArrayList<>();
    ArrayList<Dia> listaSexta = new ArrayList<>();
    public static void main(String[] argv){
        Horarios horariosMain = new Horarios();
        //Coloca as aulas
        //AED
        horariosMain.listaAulas.add(new Aula(14, 16, "João Paulo Fernandes", "AED", "PL1", "terca", 1));
        horariosMain.listaAulas.add(new Aula(9, 11, "João Paulo Fernandes", "AED", "PL2", "terca", 2));
        horariosMain.listaAulas.add(new Aula(9, 11, "Paulo Simoes", "AED", "PL3", "terca", 3));
        horariosMain.listaAulas.add(new Aula(14, 16, "Carlos Manuel Bento", "AED", "PL4", "sexta", 4));
        horariosMain.listaAulas.add(new Aula(9, 11, "Carlos Manuel Bento", "AED", "PL5", "sexta", 5));
        horariosMain.listaAulas.add(new Aula(18, 20, "Carlos Manuel Bento", "AED", "PL6", "sexta", 6));
        horariosMain.listaAulas.add(new Aula(9, 11, "Carlos Manuel Bento", "AED", "PL7", "quinta", 7));
        horariosMain.listaAulas.add(new Aula(18, 20, "Paulo Simoes", "AED", "PL8", "terca", 8));
        horariosMain.listaAulas.add(new Aula(14, 16, "Carlos Manuel Bento", "AED", "T1", "quinta", 9));
        horariosMain.listaAulas.add(new Aula(16, 17, "Carlos Manuel Bento", "AED", "TP1", "quinta", 10));

        //ATD
        horariosMain.listaAulas.add(new Aula(16, 18, "César Teixeira", "ATD", "PL1", "segunda", 11));
        horariosMain.listaAulas.add(new Aula(16, 18, "Joel Arrais", "ATD", "PL2", "segunda", 12));
        horariosMain.listaAulas.add(new Aula(18, 20, "César Teixeira", "ATD", "PL3", "terca", 13));
        horariosMain.listaAulas.add(new Aula(16, 18, "Joaquim Leitao", "ATD", "PL5", "sexta", 14));
        horariosMain.listaAulas.add(new Aula(14, 16, "Joaquim Leitao", "ATD", "PL6", "sexta", 15));
        horariosMain.listaAulas.add(new Aula(16, 18, "Alberto Cardoso", "ATD", "PL7", "terca", 16));
        horariosMain.listaAulas.add(new Aula(9, 11, "Alberto Cardoso", "ATD", "PL8", "quinta", 17));
        horariosMain.listaAulas.add(new Aula(11, 13, "Alberto Cardoso", "ATD", "T1", "terca", 18));
        horariosMain.listaAulas.add(new Aula(11, 12, "Alberto Cardoso", "ATD", "TP1", "quinta", 19));

        //MULT
        horariosMain.listaAulas.add(new Aula(16, 18, "Rui Paiva", "MULT", "PL1", "terca", 20));
        horariosMain.listaAulas.add(new Aula(14, 16, "Rui Paiva", "MULT", "PL2", "terca", 21));
        horariosMain.listaAulas.add(new Aula(9, 11, "Pedro Martins", "MULT", "PL3", "sexta", 22));
        horariosMain.listaAulas.add(new Aula(11, 13, "Pedro Martins", "MULT", "PL4", "quarta", 23));
        horariosMain.listaAulas.add(new Aula(11, 13, "Pedro Martins", "MULT", "PL5", "sexta", 24));
        horariosMain.listaAulas.add(new Aula(9, 11, "Pedro Martins", "MULT", "PL6", "quarta", 25));
        horariosMain.listaAulas.add(new Aula(16, 18, "Rui Paiva", "MULT", "PL7", "segunda", 26));
        horariosMain.listaAulas.add(new Aula(14, 16, "Rui Paiva", "MULT", "T1", "segunda", 27));

        //PC
        horariosMain.listaAulas.add(new Aula(11, 13, "Fernando Fernandes", "PC", "PL1", "quarta", 28));
        horariosMain.listaAulas.add(new Aula(14, 16, "Fernando Fernandes", "PC", "PL2", "terca", 29));
        horariosMain.listaAulas.add(new Aula(9, 11, "Fernando Fernandes", "PC", "PL3", "quarta", 30));
        horariosMain.listaAulas.add(new Aula(18, 20, "Fernando Fernandes", "PC", "PL4", "terca", 31));
        horariosMain.listaAulas.add(new Aula(16, 18, "Fernando Fernandes", "PC", "PL5", "terca", 32));
        horariosMain.listaAulas.add(new Aula(11, 13, "Fernando Fernandes", "PC", "T1", "segunda", 33));

        //SCC
        horariosMain.listaAulas.add(new Aula(18, 20, "Rui Craveirinha", "SCC", "PL1", "sexta", 34));
        horariosMain.listaAulas.add(new Aula(16, 18, "Rui Craveirinha", "SCC", "PL2", "sexta", 35));
        horariosMain.listaAulas.add(new Aula(9, 11, "Rui Craveirinha", "SCC", "PL3", "quinta", 36));
        horariosMain.listaAulas.add(new Aula(17, 19, "Rui Craveirinha", "SCC", "PL4", "quinta", 37));
        horariosMain.listaAulas.add(new Aula(14, 16, "Rui Craveirinha", "SCC", "PL5", "sexta", 38));
        horariosMain.listaAulas.add(new Aula(9, 11, "Maria Marcelino", "SCC", "T1", "segunda", 39));
        horariosMain.listaAulas.add(new Aula(12, 13, "Maria Marcelino", "SCC", "TP1", "quinta", 40));

        //Cria os horarios
        int i=1;
        while(true){
            try {
                horariosMain.horarios.add(new Horario(i, horariosMain.listaAulas));
            } catch (IllegalArgumentException e){
                break;
            }

            i++;
        }

        System.out.println(i + " horarios encontrados!");
        for(Horario horario: horariosMain.horarios){
            System.out.println(horario);
        }
    }
}
