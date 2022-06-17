package Segundo_Parcial;

@FunctionalInterface
public interface KeyCreator<In,Out> {
    Out create(In value);
}
