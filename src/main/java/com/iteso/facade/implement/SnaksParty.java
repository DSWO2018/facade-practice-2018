package com.iteso.facade.implement;

import com.iteso.facade.interfaces.Snaks;
import com.iteso.facade.interfaces.Waiters;

/**
 * Created by Palaf on 17/11/2018.
 */
public class SnaksParty implements Snaks {
    public String getSnaks() {
        return "Papitas";
    }

    public void serveSnaks(Waiters waiters) {
        waiters.serve(getSnaks());
    }
}
