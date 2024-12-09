package com.example;

public class InterfaceDecorator implements GraphicInterface{

    protected GraphicInterface defaultInterface;

    public InterfaceDecorator (GraphicInterface defaultInterface){
        this.defaultInterface = defaultInterface;
    }

    @Override
    public void display() {
        defaultInterface.display();
    }
}
