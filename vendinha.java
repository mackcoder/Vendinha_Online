/* Integrantes (04G)
    André Doerner Duarte - 10427938
    Naoto Ushizaki - 10437445
*/

class Cliente{
    private String name;
    private String password;
    private int id_cliente;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIdCliente(int id) {
        this.id_cliente = id;
    }

    public int getIdCliente(){
        return id_cliente;
    }

    private void setPassword(String P) {
        this.password = P;
    }

    private String getPassword(){
        return password;
    }

}

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

