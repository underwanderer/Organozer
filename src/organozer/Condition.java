/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organozer;

import java.util.Calendar;
import java.util.Set;

/**
 *
 * @author evgene
 */
public interface Condition {
    Calendar maxCreationTime ( Calendar max );
    Calendar minCreationTime ( Calendar min );
    String titleTemplate ( String template );   // Or Regexp
    String contentTemplate ( String template );   // Or Regexp
    Set <Tag> tagSet ( Set <Tag> tagSet );
}
