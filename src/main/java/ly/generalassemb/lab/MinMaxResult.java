package ly.generalassemb.lab;

public class MinMaxResult<T> {
    private final T min;
    private final T max;

    public MinMaxResult(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() { return min; }
    public T getMax() { return max; }
}