package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GraphicInterface defaultInterafce = new DefaultInterface();
        ColoredTheme theme = new ColoredTheme("Sorbet au citron",Color.PEECH_GRADIENT);
        GraphicInterface coloredThemeInterface = new ColoredThemeDecorator(defaultInterafce, theme);
        GraphicInterface iconInterface = new IconDecorator(coloredThemeInterface,Icon.PASTEL);
        GraphicInterface animatedAvatarInterface = new AnimatedAvatarDecorator(iconInterface);

        System.out.println("Final Interface:");
        animatedAvatarInterface.display();
    }
}