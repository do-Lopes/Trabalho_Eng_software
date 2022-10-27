import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Gerenciar_CadAcessosTest {

    @Test
    void EntradaCertaRetornoCerto(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor("insumos");

        assertNotNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CodigoNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();

        acesso.setCodigo(null);

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor("insumos");

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CargoNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();

        acesso.setCodigo("123");

        acesso.setCargo(null);

        acesso.setResponsavel("Marcos");

        acesso.setSetor("insumos");

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void ResponsavelNuloRetornaNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("Gerente");

        acesso.setResponsavel(null);

        acesso.setSetor("insumos");

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void SetorNuloRetornaNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor(null);

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CargoResponsavelSetorNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo(null);

        acesso.setResponsavel(null);

        acesso.setSetor(null);

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CodigoResponsavelSetorNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo(null);

        acesso.setCargo("gerente");

        acesso.setResponsavel(null);

        acesso.setSetor(null);

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CodigoCargoSetorNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo(null);

        acesso.setCargo(null);

        acesso.setResponsavel("marcos");

        acesso.setSetor(null);

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void CodigoCargoResponsavelNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo(null);

        acesso.setCargo(null);

        acesso.setResponsavel(null);

        acesso.setSetor("insumos");

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void TudoNuloRetornoNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo(null);

        acesso.setCargo(null);

        acesso.setResponsavel(null);

        acesso.setSetor(null);

        assertNull(acessoGer.cadAcesso(acesso));
    }

    @Test
    void SetorInvalidoRetornaNulo(){
        var acesso = new Acesso();
        var acessoGer = new Gerenciar_Acessos();
        acesso.setCodigo("123");

        acesso.setCargo("Gerente");

        acesso.setResponsavel("Marcos");

        acesso.setSetor("teste");

        assertNull(acessoGer.cadAcesso(acesso));
    }
}