/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Piilo<T> {
    private T t;
        
    public void laitaPiiloon(T piilotettava) {
        this.t = piilotettava;
    }
    
    public T otaPiilosta() {
        T a = t;
        t = null;
        return a;
    }
    
    public boolean onkoPiilossa() {
        return this.t != null;
    }
    
}
