package com.example;

public class ColoredTheme {

    public String themeName;
    public Color themeColor;

    public ColoredTheme (String name, Color color){
        this.themeName = name;
        this.themeColor = color;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public Color getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(Color themeColor) {
        this.themeColor = themeColor;
    }
}
