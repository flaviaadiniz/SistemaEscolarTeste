import java.util.List;

public class Relatorio <T> {

    public void relatorioUnico(T t){
        System.out.println("_______________________");
        System.out.println("| Gerando relatório...|");
        System.out.println("|_____________________|");
        System.out.println(t);
    }

    public void relatorioGrupo(List<T> lista){
        System.out.println("________________________");
        System.out.println("| Gerando relatórios...|");
        System.out.println("|______________________|");
        for (T t : lista) {
            System.out.println(t);
        }
    }

}
