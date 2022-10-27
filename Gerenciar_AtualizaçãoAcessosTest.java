import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Gerenciar_AtualizaçãoAcessosTest {

    @Test
    void AtualizaçãoCertaAtualizaçãoCorreta(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("teste");

        acesso.setResponsavel("teste");

        acesso.setSetor("insumos");

        acesso = acessoGer.cadAcesso(acesso);

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor("transporte");

        acesso.setCadastro(true);

        acesso.setAtualizacao(true);

        acesso.setRemocao(true);

        assertNotNull(acessoGer.atualizarAcesso(acesso));
    }

    @Test
    void EntradasErradasAtualizaçãoFalha(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("teste");

        acesso.setResponsavel("teste");

        acesso.setSetor("insumos");

        acesso = acessoGer.cadAcesso(acesso);

        acesso.setCargo(null);

        acesso.setResponsavel(null);

        acesso.setSetor(null);

        acesso.setCadastro(null);

        acesso.setAtualizacao(null);

        acesso.setRemocao(null);

        assertNull(acessoGer.atualizarAcesso(acesso));
    }

    @Test
    void PermissõesErradasAtualizaçãoFalha(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("teste");

        acesso.setResponsavel("teste");

        acesso.setSetor("insumos");

        acesso = acessoGer.cadAcesso(acesso);

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor("transporte");

        acesso.setCadastro(null);

        acesso.setAtualizacao(null);

        acesso.setRemocao(null);

        assertNull(acessoGer.atualizarAcesso(acesso));
    }

    @Test
    void DoisErradosAtualizaçãoFalha(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("teste");

        acesso.setResponsavel("teste");

        acesso.setSetor("insumos");

        acesso = acessoGer.cadAcesso(acesso);

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor(null);

        acesso.setCadastro(null);

        acesso.setAtualizacao(null);

        acesso.setRemocao(null);

        assertNull(acessoGer.atualizarAcesso(acesso));
    }

}