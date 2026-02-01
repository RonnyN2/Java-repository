public class perro extends Mascota{

    // Los perros deben registrar si tienen o no entrenamiento. 
    private boolean entrenamiento;
    public String perro = "Perro";

    public perro(String nombre, int codigo , int edad, String nombrePropietario, boolean entrenamiento){
        super(nombre, codigo, edad, nombrePropietario);
        this.entrenamiento = entrenamiento;
    }

    public void mostrarInfo(){
         System.out.println("El nombre del propietario es:"+ nombrePropietario+
            "El nombre de la mascota es: "+ nombreMascota+
            "El codigo de la mascota es: "+codigo+
            "la edad de la mascota es: "+edad+
            "La especie de la mascota es: "+ perro+
            "Esta entrenado:" + entrenamiento
        );
    }
    public String entrenamientoSINO(boolean entrenamiento) {
    return entrenamiento ? "SI" : "NO";
}

}