/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organozer;

import java.util.Calendar;

/**
 *
 * @author evgene
 */
public interface Storage {
    
    /**
     * Has to store all types of record, so must take corresponding param
     * 
     * @param record
     */
    public void store ( Record record );
    
    public List <Record> retrive ( Condition condition );
}

/**
 * We have several types of records, so an hierarchy is possible
 * But how to perform requirements of <method>store</method>?
 * @author suomi
 */
interface Record {
    boolean setCreationTime ( Calendar time );
    //boolean setStartTime ( Calendar time );
    //boolean setEndTime ( Calendar time );
    boolean setTitle ( String title );
    boolean setContent ( Content content );
    
    boolean addTag ( Tag tag );
}

interface Condition {
    
}