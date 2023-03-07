public class Sala {
    
    private String descricao;
    private String localizacao;
    private int qtdCadeiras;
    private int tipoDeTela;

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

    public int getTipoDeTela(){
        return this.tipoDeTela;
    }

    public void setTipoDeTela( int tipoDeTela){
        this.tipoDeTela = tipoDeTela;
    }
}
