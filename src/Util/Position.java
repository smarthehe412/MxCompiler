package Util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Position {
    private int row, CP;

    public Position(int row, int CP) {
        this.row = row;
        this.CP = CP;
    }

    public Position(Token token) {
        this.row = token.getLine();
        this.CP = token.getCharPositionInLine();
    }

    public Position(TerminalNode terminal) {
        this(terminal.getSymbol());
    }

    public Position(ParserRuleContext ctx) {
        this(ctx.getStart());
    }

    public int row() { return row; }

    public int CP() {return CP;}

    public String toString() { return row + "," + CP; }
}