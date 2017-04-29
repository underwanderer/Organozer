/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organozer;

import java.util.Calendar;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Logger;

/**
 * An interface to a storage of records. It could be a database, an xml or something else
 * Provides basic operations, typical for data storage
 * 
 * @author evgene
 */
public interface Storage {
    
    public void store ( Record record );
    
    public Set <Record> retrive ( Condition condition );
    
    public Record remove ( Record record );
}

/**
 * Provide a simple record which can be put in a storage, and so on
 * In the other hand instances can take events from GUI
 * 
 * @author suomi
 */
interface Record {
    boolean setCreationTime ( Calendar time );
    boolean setTitle ( String title );
    boolean setContent ( Content content );
    
    Calendar getCreationTime (  );
    String getTitle (  );
    Content getContent (  );
    
    boolean addTag ( Tag tag );
    boolean removeTag ( Tag tag );
    Set <Tag> getTagSet (  );
}


