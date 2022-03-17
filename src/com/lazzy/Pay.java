package com.lazzy;

import java.util.Objects;

public class Pay implements Ipay {
    @Override
    public String pay(String task) {
        if (Objects.equals(task, "pentester")) {
            return "$65000.00";
        } else if (Objects.equals(task, "frontend developper")) {
            return "$35000.00";
        } else if (Objects.equals(task, "backend developper")) {
            return "$50000.00";
        } else {
            return "[!] task non répertorié ! ";
        }
    }
}
