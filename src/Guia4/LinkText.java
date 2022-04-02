package Guia4;

public class LinkText implements HTMLText{
    private HTMLText element;
    private String link;

    public LinkText(HTMLText element,String format){
        this.element = element;
        this.link =format;
    }

    @Override
    public String source(){
        return String.format("<a href: %s>%s</a>",link,element.source());
    }
    @Override
    public String toString(){
        return source();
    }
}
