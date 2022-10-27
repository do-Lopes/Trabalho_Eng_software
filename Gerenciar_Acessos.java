import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Gerenciar_Acessos {

    private final List<Acesso> lista_de_acessos = new ArrayList<Acesso>();

    private final Gerenciar_Gerente gerenciador_Gerentes = new Gerenciar_Gerente();
    private final Leitor Ler = new Leitor();

    public List<Acesso> getLista_de_acessos() {
        return lista_de_acessos;
    }


    public Acesso consAcessoCod(Acesso acesso) {
        if (acesso.getCodigo() == null) {
            return acesso;
        } else {
            for (int i = 0; i < lista_de_acessos.size(); i++) {
                if (Objects.equals(acesso.getCodigo(), lista_de_acessos.get(i).getCodigo())) {
                    return lista_de_acessos.get(i);
                }
            }
        }
        return null;
    }

    public Acesso verificaResponsavel(Acesso acesso) {
        if (acesso.getResponsavel() == null) {
            return acesso;
        } else {
            return null;
        }
    }

    public Acesso verificaCargo(Acesso acesso) {
        if (acesso.getCargo() == null) {
            return acesso;
        } else {
            return null;

        }
    }

    public Acesso consAcessoSet(Acesso acesso) {
        if (Objects.equals(acesso.getSetor(), "insumos")||Objects.equals(acesso.getSetor(), "transporte")||Objects.equals(acesso.getSetor(), "financeiro")) {
            return null;
        } else {
            return acesso;
        }
    }

    public Acesso removeAcesso (Acesso acesso){
        acesso = consAcessoCod(acesso);
        if (acesso != null) {
            lista_de_acessos.remove(acesso);
        }
        return acesso;
    }

    public Acesso consAcessoPermissoes(Acesso acesso) {
        if ((acesso.getCadastro())==null||(acesso.getAtualizacao())==null||(acesso.getRemocao())==null) {
            return acesso;
        }else {
            return null;
        }
    }

        public Acesso cadAcesso (Acesso acesso) {
            if (consAcessoSet(acesso) == null) {
                if (verificaCargo(acesso) == null) {
                    if (verificaResponsavel(acesso) == null) {
                        if (consAcessoCod(acesso) == null) {
                            System.out.println("");
                            lista_de_acessos.add(acesso);
                            return acesso;
                        } else {
                            System.out.println("");
                            return null;
                        }
                    } else {
                        System.out.println("");
                        return null;
                    }
                } else {
                    System.out.println("");
                    return null;
                }
            }else {
                System.out.println("");
                return null;
            }
        }
        public void ImprimeListaAcessos () {
            for (int i = 0; i < lista_de_acessos.size(); i++) {
                System.out.println("\n------------------------------------");
                System.out.println("\nInfos dos Alunos");
                System.out.println("\n Identificador de Permissão: " + lista_de_acessos.get(i).getCodigo());
                System.out.println("\n Cargo do Acesso: " + lista_de_acessos.get(i).getCargo());
                System.out.println("\n Responsável:" + lista_de_acessos.get(i).getResponsavel());
                System.out.println("\n Setor:" + lista_de_acessos.get(i).getSetor());
                System.out.println("\n Permissão de Cadastro:" + lista_de_acessos.get(i).getCadastro());
                System.out.println("\n Permissão de Atualização:" + lista_de_acessos.get(i).getAtualizacao());
                System.out.println("\n Permissão de Remoção:" + lista_de_acessos.get(i).getRemocao());
                System.out.println("\n------------------------------------");
            }
        }

        public Acesso atualizarAcesso(Acesso acesso){
            if(consAcessoPermissoes(acesso) == null){
                if (consAcessoSet(acesso) == null) {
                    if (verificaCargo(acesso) == null) {
                        if (verificaResponsavel(acesso) == null) {
                            for (int i = 0; i < lista_de_acessos.size(); i++) {
                                if (Objects.equals(acesso.getCodigo(), lista_de_acessos.get(i).getCodigo())) {
                                    lista_de_acessos.set(i, acesso);
                                }
                            }
                            System.out.println("Atualização Concluida");
                            lista_de_acessos.add(acesso);
                            return acesso;
                        } else {
                        System.out.println("Erro de atualização");
                            return null;
                        }
                    } else {
                        System.out.println("Erro de atualização");
                        return null;
                    }
                }else {
                    System.out.println("Erro de atualização");
                    return null;
                }
            }else {
                System.out.println("Erro de atualização");
                return null;
            }
        }
}

