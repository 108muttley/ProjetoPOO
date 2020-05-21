public class LinhaEncomenda {
    private String codProduto;
    private String descricao;
    private double quantidade;
    private double valorUnitario;

    public LinhaEncomenda (){
        this.codProduto = "Invalid";
        this.descricao = "Invalid";
        this.quantidade = 0;
        this.valorUnitario = 0 ;
    }

    public LinhaEncomenda(String codProduto, String descricao, double quantidade, double valorUnitario) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public LinhaEncomenda( LinhaEncomenda outro){
        this.codProduto = outro.codProduto;
        this.descricao = outro.descricao;
        this.quantidade = outro.quantidade;
        this.valorUnitario = outro.valorUnitario;
    }

    public String getCodProduto() {
        return this.codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        LinhaEncomenda a = (LinhaEncomenda) obj;
        return this.codProduto.equals(a.getCodProduto())
                && this.descricao.equals(a.getDescricao())
                && this.quantidade == a.getQuantidade()
                && this.valorUnitario == a.getValorUnitario();
    }

    @Override
    protected LinhaEncomenda clone() {
        return new LinhaEncomenda(this);
    }

    @Override
    public String toString() {
        return "Código do produto: " + this.codProduto
                + " Descrição: " + this.descricao
                + " Quantidade: " + this.quantidade
                + " Valor unitário "  + this.valorUnitario;
    }
}
