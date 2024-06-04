import java.util.Optional;

public class Resistor {
    private Optional<Integer> resistance;

    public Resistor(Integer resistance) {
        this.resistance = Optional.ofNullable(resistance);
    }

    public Optional<Integer> getResistance() {
        return resistance;
    }
}



