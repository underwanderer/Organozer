/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organozer;

/**
 *
 * @author evgene
 */
public interface Storage {
    
    public void store ( Record record );
    
    public List <Record> retrive ( Condition condition );
}
