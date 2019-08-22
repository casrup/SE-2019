/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author sheeplove
 */
public class Unicorn {
    String name = "Perdu";
    Unicorn(String realName) {
        System.out.println("I was wrongly named " + this.name + "!");
        this.name = realName;
    }
    void talk() {
        System.out.println("Now I'm correctly named " + this.name + " :)");
    }
}
