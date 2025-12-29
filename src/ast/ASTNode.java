package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.ASTVisitor;

public abstract class ASTNode {

    protected String nodeName; // اسم العقدة (HtmlTag, JinjaIf, ...)
    protected int lineNumber; // رقم السطر من الكود الأصلي
    protected List<ASTNode> children; // أبناء العقدة (الشجرة)

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    // إضافة ابن
    public void addChild(ASTNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    // Getters
    public String getNodeName() {
        return nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    // Visitor pattern (polymorphism)
    public abstract <T> T accept(ASTVisitor<T> visitor);
}
