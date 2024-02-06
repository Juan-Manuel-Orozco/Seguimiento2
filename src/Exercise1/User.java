package Exercise1;

public class User {
    public String usuarioBase;
    public String usuarioIngresado;
    public String claveBase;
    public String claveIngresada;
    public String estadoSistema;

    public User(String usuarioBase, String claveIngresada){
        super();
        this.usuarioBase="User";
        this.usuarioIngresado=usuarioIngresado;
        this.claveBase= "password";
        this.claveIngresada= claveIngresada;
        this.estadoSistema= "registrado";

    }


    }

