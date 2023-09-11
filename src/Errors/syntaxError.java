package Errors;

import Util.Position;

public class syntaxError extends error {
    public syntaxError(String msg, Position p) {
        super("Syntax error:" + msg, p);
    }
}