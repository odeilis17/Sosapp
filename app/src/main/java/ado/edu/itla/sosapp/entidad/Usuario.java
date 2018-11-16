package ado.edu.itla.sosapp.entidad;

public class Usuario {
    public int id;
    private int edad;
    private String nombre;
    private String username;
    private String password;
    private String email;

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setEdad(int edad) throws Exception{
        if (edad < 0 || edad > 130)
            throw new RuntimeException("Error: Edad no permitida");
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

}
