package Errors;

import Util.Position;

public class internalError extends Error {
    public internalError(String msg) {
        super("Internal error: " + msg);
    }
}