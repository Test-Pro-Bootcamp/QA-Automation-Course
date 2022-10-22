package java.lesson9;

public class Homework9Answer {
    public static void main(String[] args) {

        LinkElement link = new LinkElement();
        System.out.println(link.locator);
        link.click();

        TextElement text = new TextElement();
        System.out.println(text.locator);
        text.click();
    }
}

class BaseElement{
    String locator = "//*[id='some-id']";
    void click(){
        System.out.println("clicked on an element");
    }
}

class LinkElement extends BaseElement{
    void click() {
        System.out.println("clicked and redirected");
    }
}

class TextElement extends BaseElement{
}