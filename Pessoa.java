abstract class Pessoa {
    private String nome;
    private String endereco;
    private int identificador;

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
}
