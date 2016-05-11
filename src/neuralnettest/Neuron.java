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
public class Neuron
{

    private double outValue;
    private double weight = 1;
   

    ArrayList<Neuron> nList = new ArrayList();

    // cell body process
    private void fire()
    {
        double y = 1;
        for (int i = 0; nList.size() > i; i++) {
            
            outValue = outValue + (nList.get(i).getOutValue() * nList.get(i).getOutWeight());
            
            //System.out.println(outValue);
            
            y = y + 1;
        }
        outValue = outValue / y;
//        System.out.println(outValue + " out");
//        System.out.println(y + " y");
        
    }

    public double getOutValue()
    {
        fire();
        return outValue;
    }

    public double getOutWeight()
    {
        return weight;
    }

    

    public double getWeight(double weightNum)
    {
        return weight;
    }

    public void add(Neuron n)
    {
        nList.add(n);
    }

    public void setValue(double val, double weightNum)
    {
        outValue = val;
        weight = weightNum;
    }
    public void setValue(double val)
    {
        outValue = val;
        
    }
}
