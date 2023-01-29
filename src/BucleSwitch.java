public class BucleSwitch {
    public static void main(String[] args) {
        var estacion = "InViErNo";
        estacion = estacion.toUpperCase();
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("la estacion es PRIMAVERA.");
                break;
            case "VERANO":
                System.out.println("la estacion es VERANO.");
                break;
            case "OTOÑO":
                System.out.println("la estacion es OTOÑO.");
                break;
            case "INVIERNO" :
                System.out.println("la estacion es INVIERNO.");
                break;
            default:
                System.out.println("la cadena ingresada no es una estacion");
        }
    }
}
