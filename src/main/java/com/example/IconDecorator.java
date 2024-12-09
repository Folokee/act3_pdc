package com.example;

public class IconDecorator extends InterfaceDecorator{

    protected Icon icon;

    public IconDecorator(GraphicInterface defaultInterface, Icon icon){
        super (defaultInterface);
        this.icon = icon;
    }

    public void display() {
        super.display();
        System.out.println("Icon " + icon + " is activated ! ");
    }
}
