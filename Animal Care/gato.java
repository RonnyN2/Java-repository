public class gato extends Mascota{

   //Los gatos deben registrar si son de interior o exterior.
    private boolean ambiente;
    public String gato = "gato";

    public gato(String nombre, int codigo, int edad, String nombrePropietario, boolean ambiente){
        super(nombre, codigo, edad, nombrePropietario);
        this.ambiente = ambiente;
    }
     public void mostrarInfo(){
         System.out.println("El nombre del propietario es:"+ nombrePropietario+
            "El nombre de la mascota es: "+ nombreMascota+
            "El codigo de la mascota es: "+codigo+
            "la edad de la mascota es: "+edad+
            "La especie de la mascota es: "+ gato
        );

    }
    public String ambiente(boolean ambiente){
        return ambiente ? "Si" : "No";
    }
} 