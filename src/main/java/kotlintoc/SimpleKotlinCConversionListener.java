package kotlintoc;
// Generated from C:/Moje/Notatki/5 semestr/Kompilatory/Translator/src/main/resources/simpleKotlin.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

import static kotlintoc.simpleKotlinParser.*;

/**
 * This class provides an empty implementation of {@link simpleKotlinListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class SimpleKotlinCConversionListener implements simpleKotlinListener {
    private String s = "";

    public String getCCode() {
        return s;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProg(simpleKotlinParser.ProgContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProg(simpleKotlinParser.ProgContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterS(simpleKotlinParser.SContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitS(simpleKotlinParser.SContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInfile(simpleKotlinParser.InfileContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInfile(simpleKotlinParser.InfileContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFun(simpleKotlinParser.FunContext ctx) {
        if (ctx.getTokens(COLON).isEmpty())
            s += "void ";
        else {
            String tmp = ctx.TYPE().getText().toLowerCase();
            s += tmp;
            s += " ";
        }
        s += ctx.NAME().getText();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFun(simpleKotlinParser.FunContext ctx) {
        s += "}\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFuncall(simpleKotlinParser.FuncallContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFuncall(simpleKotlinParser.FuncallContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBody(simpleKotlinParser.BodyContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBody(simpleKotlinParser.BodyContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterVar(simpleKotlinParser.VarContext ctx) {
        s += ctx.TYPE().getText().toLowerCase();
        s += " ";
        s += ctx.NAME().getText();
        if (ctx.ASSIGN() != null) {
            s += " = ";
            s += ctx.getChild(simpleKotlinParser.ExprContext.class, 0).getText();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitVar(simpleKotlinParser.VarContext ctx) {
        s += ";\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArgs(simpleKotlinParser.ArgsContext ctx) {
        s += "(";
        List<TerminalNode> names = ctx.NAME();
        List<TerminalNode> types = ctx.TYPE();
        if (!names.isEmpty()) {
            s += types.get(0).getText().toLowerCase();
            s += " ";
            s += names.get(0).getText();
            for (int i = 1; i < names.size(); i++) {
                s += ", ";
                s += types.get(i).getText().toLowerCase();
                s += " ";
                s += names.get(i).getText();
            }
        }
        s += ") {\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArgs(simpleKotlinParser.ArgsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLaunchargs(simpleKotlinParser.LaunchargsContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLaunchargs(simpleKotlinParser.LaunchargsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLauncharg(simpleKotlinParser.LaunchargContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLauncharg(simpleKotlinParser.LaunchargContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterImppath(simpleKotlinParser.ImppathContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitImppath(simpleKotlinParser.ImppathContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpr(simpleKotlinParser.ExprContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpr(simpleKotlinParser.ExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLoop(simpleKotlinParser.LoopContext ctx) {
        if (ctx.getTokens(FOR).isEmpty()) {
            s += "while (";
            s += ctx.getChild(2).getText();
            s += ") ";
        } else {
            s += "for (int ";
            s += ctx.NAME().getText();
            s += "; i < ";
            s += ctx.getChild(4).getText();
            s += "; i++) ";
        }
        if (ctx.getTokens(OBRACE).isEmpty()) {
            s += "\n    ";
        } else {
            s += "{\n";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLoop(simpleKotlinParser.LoopContext ctx) {
        if (!ctx.getTokens(CBRACE).isEmpty()) {
            s += "}";
        }
        s += "\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCond(simpleKotlinParser.CondContext ctx) {
        s += "if (";
        s += ctx.getChild(2).getText();
        s += ") ";
        if (ctx.getTokens(OBRACE).isEmpty()) {
            s += "\n    ";
        } else {
            s += "{\n";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCond(simpleKotlinParser.CondContext ctx) {
        if (!ctx.getTokens(CBRACE).isEmpty())
            s += "}\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterElse(simpleKotlinParser.ElseContext ctx) {
        s += "else ";
        if (!ctx.getTokens(OBRACE).isEmpty())
            s += "{\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitElse(simpleKotlinParser.ElseContext ctx) {
        if (!ctx.getTokens(CBRACE).isEmpty())
            s += "}\n";
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOperation(simpleKotlinParser.OperationContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOperation(simpleKotlinParser.OperationContext ctx) {
        if (!ctx.getTokens(INCRDECR).isEmpty() || !ctx.getTokens(NAME).isEmpty() ||
                ctx.getChild(0).getClass() == simpleKotlinParser.FuncallContext.class) {
            s += ctx.getText();
            s += ";\n";
        }
        else if (!ctx.getTokens(RETURN).isEmpty()){
            s += ctx.getChild(0).getText();
            s += " ";
            s += ctx.getChild(1).getText();
            s += ";\n";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBoolexpr(simpleKotlinParser.BoolexprContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBoolexpr(simpleKotlinParser.BoolexprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}