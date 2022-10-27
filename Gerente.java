public class Gerente extends Pessoa{
    private String usuario_Gerente;
    private int senha_Gerente;

    public String getUsuario_Gerente(){
        return usuario_Gerente;
    }

    public int getSenha_Gerente(){
        return senha_Gerente;
    }

    public void setUsuario_Gerente(String usuario_Gerente){
        this.usuario_Gerente = usuario_Gerente;
    }

    public void setSenha_Gerente(int senha_Gerente){
        this.senha_Gerente = senha_Gerente;
    }

}
