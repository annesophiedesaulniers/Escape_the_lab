package com.example.escape_the_lab.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Item {
    private String name;
    private Image image;
    private ImageView imageView;


    public Item(String name, String imagePath) {
        this.name = name;
        this.image = new Image(getClass().getResourceAsStream(imagePath));
        this.imageView = new ImageView(image);
    }

    public String getName() {
        return name;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public Image getImage() {
        return image;
    }

    public void use() {
        System.out.println("Item " + name + " used");
    }
//    public void solveEquation() {
//
//    }
//
//    public void useItem() {
//
//    }
}
