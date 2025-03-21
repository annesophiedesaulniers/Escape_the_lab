/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escape_the_lab.model;

/**
 *
 * @author ALAllaire
 */
public class SpringModel {
    private double mass;
    private double springConstant;

    public SpringModel(double mass, double springConstant) {
        this.mass = mass;
        this.springConstant = springConstant;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpringConstant() {
        return springConstant;
    }

    public void setSpringConstant(double springConstant) {
        this.springConstant = springConstant;
    }

    /**
     * Checks if the selected mass and spring constant are correct.
     * @param correctMass expected mass
     * @param correctSpringConstant expected spring constant
     * @return true if the selected values match the correct ones
     */
    public boolean isCorrectCombination(double correctMass, double correctSpringConstant) {
        return this.mass == correctMass && this.springConstant == correctSpringConstant;
    }
}

