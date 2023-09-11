package Errors;

import Util.Position;

public class error extends RuntimeException {
    private String msg;
    private Position p;
    public error(String msg, Position p) {
        this.msg = msg;
        this.p = p;
    }

    public String toString() {
        return msg + ": " + p.toString();
    }
}