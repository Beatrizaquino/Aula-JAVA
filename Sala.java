public class Sala {
    
    private String descricao;
    private String localizacao;
    private int qtdCadeiras;
    private String tipoDeTela;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setlocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public int getQtdCadeiras() {
        return this.qtdCadeiras;
    }

    public void setqtdcadeira(int qtdCadeiras){
        this.qtdCadeiras = qtdCadeiras;
    }

    public String getTipoDeTela(){
        return this.tipoDeTela;
    }

    public void setTipoDeTela( String tipoDeTela){
        this.tipoDeTela = tipoDeTela;
    }
}
