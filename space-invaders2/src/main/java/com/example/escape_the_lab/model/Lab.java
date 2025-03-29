/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escape_the_lab.model;

/**
 *
 * @author ALAllaire
 */
import javafx.scene.Scene;

public abstract class Lab {
    private String name;

    public abstract void startLab();
    public abstract boolean checkSolution();
    public abstract void failLab();
    public abstract void setupLab();
    public abstract Scene createScene();
}