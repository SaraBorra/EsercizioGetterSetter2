public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(1600, "AB123CD", "Fiat", "Punto");
        System.out.println("Auto: " + auto.getMarca() + " " + auto.getModello() + ", Cilindrata: " + auto.getCilindrata() + ", Targa: " + auto.getTarga());
    }
}