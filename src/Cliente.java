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


