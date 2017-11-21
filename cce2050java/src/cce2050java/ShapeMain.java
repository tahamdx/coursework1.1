/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050java;
import java.io.Serializable;


/**
 *
 * @author M00607592
 */
public abstract class ShapeMain implements Serializable {
    private String name;

    public ShapeMain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
