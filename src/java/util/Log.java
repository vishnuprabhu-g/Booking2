/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vishnu-pt517
 */
public class Log {

    public static void logInfo(String message) {
        Logger log = Logger.getLogger("Booking");
        log.setLevel(Level.INFO);
        log.info(message);
    }
}
