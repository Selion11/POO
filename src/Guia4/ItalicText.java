package Guia4;

public class ItalicText extends FormatedText{
    private static final String FORMAT = "i";

    public ItalicText(HTMLText source){
        super(source,FORMAT);
    }
}
