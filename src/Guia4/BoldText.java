package Guia4;

public class BoldText extends FormatedText{
    private static final String FORMAT = "b";

    public BoldText(HTMLText source){
        super(source,FORMAT);
    }
}
