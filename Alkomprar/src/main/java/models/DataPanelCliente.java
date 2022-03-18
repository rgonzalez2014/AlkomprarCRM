package models;

public class DataPanelCliente {


    String usuario;
    String password;
    String documento;

    public DataPanelCliente(String usuario, String password, String documento) {
        this.usuario = usuario;
        this.password = password;
        this.documento = documento;

    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getDocumento() {
        return documento;
    }
}

