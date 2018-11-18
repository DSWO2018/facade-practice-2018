package com.iteso.facade.implement;

import com.iteso.facade.interfaces.Waiters;

/**
 * Created by Palaf on 17/11/2018.
 */
public class WaitersParty implements Waiters {
    public String serve(String s) {
        return "Serving " + s+"...";
    }
}
