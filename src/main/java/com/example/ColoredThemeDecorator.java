package com.example;

public class ColoredThemeDecorator extends InterfaceDecorator{

    protected ColoredTheme theme ;

    public ColoredThemeDecorator(GraphicInterface defaultInterface, ColoredTheme theme){
        super (defaultInterface);
        this.theme = theme;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Theme " + theme.getThemeName() + " with color " + theme.getThemeColor() + " is activated !");
    }
}
