public class modelo {


    private  modelo(){};
    private static modelo inicializar = new modelo();
    public static modelo getInicializar() {
        return inicializar;
    }
    private String nomeCliente;
    private String statusPedido;



    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }





}
