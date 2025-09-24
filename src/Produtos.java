/* Integrantes (04G)
    André Doerner Duarte - 10427938
    Naoto Ushizaki - 10437445
*/

class Produtos{
    private  String Produto_Name;
    private  String Descricao;
    private  String tipo;
    private  int quantidade;
    private  float preco;
    private  int id_prod;

    public void setProdutoNome(String Produto_Name){
        this.Produto_Name = Produto_Name;
    }

    public String getProdutoNome(){
        return Produto_Name;
    }

    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }

    public String getDescricao(){
        return Descricao;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getquantidade(){
        return quantidade;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

}
