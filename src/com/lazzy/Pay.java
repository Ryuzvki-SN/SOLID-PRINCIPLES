package com.lazzy;

import java.util.Objects;

public class Pay implements Ipay{
    @Override
    public String payEmployee(String task) {
        if (Objects.equals(task, "pentester")) {
            return "$80000.00";
        } else if (Objects.equals(task, "frontend developper")) {
            return "$65000.00";
        } else if (Objects.equals(task, "backend developper")) {
            return "$70000.00";
        } else {
            return "[!] task non répertorié ! ";
        }
    }
}
