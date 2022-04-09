package Guia4;

abstract class FormatedText implements HTMLText{

    private HTMLText element;
    private String format;

    public FormatedText(HTMLText element,String format){
        this.element = element;
        this.format = format;
    }

    @Override
    public String source(){
        return String.format("<%s>%s</%s>",format,element,format);
    }

    @Override
    public String toString(){
        return source();
    }
}
