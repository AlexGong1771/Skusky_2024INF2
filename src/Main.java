public class Main {
    public static void main(String[] args) {
        Resistor resistorWithResistance = new Resistor(440);
        Resistor resistorWithoutResistance = new Resistor(null);

        System.out.println("Resistor with resistance: " +
                resistorWithResistance.getResistance().orElse(-1)); // Vytlačí 440

        System.out.println("Resistor without resistance: " +
                resistorWithoutResistance.getResistance().orElse(-1)); // Vytlačí -1
    }
}