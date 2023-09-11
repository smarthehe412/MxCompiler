package Errors;

import Util.Position;

public class semanticError extends error {
    public semanticError(String msg, Position p) {
        super("Semantic error: " + msg, p);
    }
}