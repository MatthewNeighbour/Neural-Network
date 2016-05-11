/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnettest;

import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class NeuralNetTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Neuron n1 = new Neuron();
        Neuron n2 = new Neuron();
        Neuron n3 = new Neuron();
        Neuron n4 = new Neuron();
        Neuron n5 = new Neuron();
        Neuron n6 = new Neuron();
        Neuron n7 = new Neuron();
       
        n1.add(n2);
        n1.add(n3);
        //n1.add(n4);
        n3.setValue(0.2);
        
        n2.add(n4);
        n2.add(n5);
        n2.add(n6);
        n6.setValue(0);
        n5.setValue(1);
        n4.setValue(1);
        n2.setValue(1);
        
        
        System.out.println(n1.getOutValue() / 2);
    }
    
}
