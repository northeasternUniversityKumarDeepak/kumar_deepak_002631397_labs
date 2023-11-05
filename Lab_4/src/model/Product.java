/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author deepakkumar
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addNewFeature() {
        Feature f = new Feature(this);
        features.add(f);
        return f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
