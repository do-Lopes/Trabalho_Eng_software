public class Acesso {
    private String codigo;
    private String cargo;
    private String responsavel;
    private String setor;
    private Boolean cadastro;
    private Boolean atualizacao;
    private Boolean remocao;

    public String getCodigo(){
        return codigo;
    }
    public String getCargo(){
        return cargo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getSetor(){
        return setor;
    }

    public Boolean getCadastro(){
        return cadastro;
    }

    public Boolean getAtualizacao(){
        return atualizacao;
    }

    public Boolean getRemocao(){
        return remocao;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setResponsavel(String responsavel){
        this.responsavel = responsavel;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setCadastro(Boolean cadastro){
        this.cadastro = cadastro;
    }

    public void setAtualizacao(Boolean atualizacao) {
        this.atualizacao = atualizacao;
    }

    public void setRemocao(Boolean remocao){
        this.remocao = remocao;
    }
}