package Segundo_Parcial;

@FunctionalInterface
public interface Mapper<ValueIn, ValueOut> {
    ValueOut map(ValueIn valueIn);
}
