import java.util.*;

public class animalCare{
    public static  void main(String[] args){
       ArrayList<Mascota> listaAnimales = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       sc.nextLine();

     int codigoBuscar;
     Mascota encontrada = null;


       int opcion = 0;
    while(opcion != 5){
        System.out.println("-----Menu De Acciones-----"+
            "\n1.Quiero registra una mascota"+
            "\n2.Quiero Ver el perfil de alguna mascota"+
            "\n3.Quiero eliminar una mascota"+
            "\n4.Quiero editar el perfil de una mascota"+
            "\n5.Quiero salir del programa"
        ); 
        System.out.println("Seleccione una opcion");
        opcion  = sc.nextInt();
        switch(opcion){
        case 1:
            
            System.out.println("-----Registro de una nueva mascota------");
            System.out.println("Digite el nombre de la mascota");
            String nombreMascota = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite el codigo de la mascota");
            int codigo = sc.nextInt();
            System.out.println("Digite la edad de la mascota");
            int edad = sc.nextInt();
            System.out.println("Digite el nombre del propietario");
            String nombrePropietario = sc.nextLine();
    
            Mascota nuevaMascota = new Mascota( nombreMascota, codigo, edad, nombrePropietario);
            listaAnimales.add(nuevaMascota);
            sc.nextLine();

            System.out.println("La mascota se registro correctamente");
            break;
        case 2:
            System.out.println("Digite el codigo de la mascota");
            codigoBuscar = sc.nextInt();
            sc.nextLine();

            if(!listaAnimales.isEmpty()){
                for (Mascota m : listaAnimales) {
                if (m.getCodigo() == codigoBuscar){
                    encontrada = m;
                    break;
                }
            }   
            }
            encontrada.MostrarInfo();
            break;
            
        case 3:
            System.out.println("Digite el codigo de la mascota");
            codigoBuscar = sc.nextInt();
            sc.nextLine();
            if(!listaAnimales.isEmpty()){
                for (Mascota m : listaAnimales) {
                if(m.getCodigo() == codigoBuscar){
                    encontrada = m;
                }
                if(encontrada != null){
                    listaAnimales.remove(encontrada);
                }
            }
            }else{
                System.out.println("No hay mascotas registradas");
            }
            break;

        case 4:
            System.out.println("Digite el codigo de la mascota:");
            codigoBuscar = sc.nextInt();
            sc.nextLine();

            if(!listaAnimales.isEmpty() ){
                 for(Mascota m : listaAnimales){
                    if(m.getCodigo() == codigoBuscar){
                        System.out.println(m);
                        break;
                    }
                }

            }else{
                System.out.println("No hay mascotas registradas");
            }
            break;

        case 5:
            break;
    }
    }
    }
}