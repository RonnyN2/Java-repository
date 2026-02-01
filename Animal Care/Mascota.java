public class Mascota{
    //definicion de variables
    public String nombreMascota;
    public int codigo;
    public int edad;
    public String nombrePropietario;

    //constructor por defecto
    public Mascota(String nombreMascota, int codigo, int edad, String nombrePropietario){
        this.nombreMascota = nombreMascota;
        this.codigo = codigo;
        this.edad = edad;
        this.nombrePropietario = nombrePropietario;
    }

    //getters para obtener los datos
    public String getNombre(){
        return nombreMascota;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getedad(){
        return edad;
    }

    public String getnombrePropietario(){
        return nombrePropietario;
    }

    //setters
    public void  setNombre(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    public void setnombrePropietario(String nombrePropietario){
        this.nombrePropietario = nombrePropietario;
    }

    public void MostrarInfo(){
        System.out.println("El nombre del propietario es:"+ nombrePropietario+
            "El nombre de la mascota es: "+ nombreMascota+
            "la edad de la mascota es: "+edad+
            "La el codigo de la mascota es: "+codigo
        );
    }
}


