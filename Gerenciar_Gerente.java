import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gerenciar_Gerente {
    private final List<Gerente> lista_de_gerentes = new ArrayList<Gerente>();

    private final Leitor Ler = new Leitor();

    public List<Gerente> getLista_de_gerentes() {
        return lista_de_gerentes;
    }

    public Gerente consGerenteSenha(Gerente gerente) {
        for (int i = 0; i < lista_de_gerentes.size(); i++) {
            if (gerente.getSenha_Gerente() == lista_de_gerentes.get(i).getSenha_Gerente()) {
                return lista_de_gerentes.get(i);
            }
        }
        return null;
    }

    public Gerente cadGerente(Gerente gerente) {

        gerente.setNome(Ler.entDados("\nInforme o nome: "));

        gerente.setEndereco(Ler.entDados("\nInforme o endereco: "));

        gerente.setIdentificador(Integer.parseInt(Ler.entDados("\nInforme o identificador: ")));

        gerente.setUsuario_Gerente(Ler.entDados("\nInforme o usuario: "));

        gerente.setSenha_Gerente(Integer.parseInt(Ler.entDados("\nInforme a senha: ")));

        if(consGerenteSenha(gerente)== null){
            lista_de_gerentes.add(gerente);
            return gerente;
        }else{
            System.out.println("Senha Indisponivel");
            return null;
        }
    }
}
