package com.example;

public class AnimatedAvatarDecorator extends InterfaceDecorator{

    public AnimatedAvatarDecorator(GraphicInterface defaultInterface){
        super (defaultInterface);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Your animated avatar is created successfully !");
    }
}
