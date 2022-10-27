import java.util.List;
import java.util.ArrayList;

public class Main {
    private final Leitor leitor_de_entrada = new Leitor();

    private final Leitor Ler = new Leitor();
    private final List<Gerente> lista_de_gerentes = new ArrayList<Gerente>();

    private final Gerenciar_Gerente gerenciador_Gerentes = new Gerenciar_Gerente();
    private Acesso acesso;

    private Gerente gerente;
    private final Gerenciar_Acessos gerenciador_acessos = new Gerenciar_Acessos();

    private final List<Acesso> lista_de_acessos = new ArrayList<Acesso>();
    public void MenuEsc() {
        int escolha_usuario = 0;
        System.out.println("Sistema SOFAZ");
        System.out.println("\n1)Cadastrar de acesso");
        System.out.println("\n2)Consulta de acesso");
        System.out.println("\n3)Atualização de acesso");
        System.out.println("\n4)Exclusão de acesso");
        System.out.println("\n5)Sair");

        try {
            escolha_usuario = Integer.parseInt(leitor_de_entrada.entDados("\nEscolha uma opcao"));
        } catch (NumberFormatException nfe) {
            leitor_de_entrada.entDados("\nO valor deve ser um inteiro");
        }

        switch (escolha_usuario) {
            case 1:
                acesso = new Acesso();
                acesso = gerenciador_acessos.cadAcesso(acesso);
                if (acesso != null) {
                    leitor_de_entrada.entDados("\nCadastro de Acesso COMPLETO");
                    MenuEsc();
                } else {
                    leitor_de_entrada.entDados("\nO codigo de identificação ja foi utilizado");
                    MenuEsc();
                }
                break;
            case 2:
                gerenciador_acessos.ImprimeListaAcessos();
                MenuEsc();
                break;
            case 3:
                acesso = new Acesso();
                acesso.setCodigo(leitor_de_entrada.entDados("\n Informe o codigo do Acesso a ser atualizado: "));
                acesso = gerenciador_acessos.consAcessoCod(acesso);
                if (acesso != null) {
                    gerenciador_acessos.atualizarAcesso(acesso);
                    MenuEsc();
                } else {
                    leitor_de_entrada.entDados("\nInformacao de acesso nao encontrada");
                    MenuEsc();
                }
                break;
            case 4:
                acesso = new Acesso();
                acesso.setCodigo(leitor_de_entrada.entDados("\n Informe o codigo de Acesso a ser removido: "));
                acesso = gerenciador_acessos.consAcessoCod(acesso);
                if (acesso != null) {
                    gerenciador_acessos.removeAcesso(acesso);
                    MenuEsc();
                } else {
                    leitor_de_entrada.entDados("\nAcesso não localizado");
                    MenuEsc();
                }
                break;
            }
        }
    }

