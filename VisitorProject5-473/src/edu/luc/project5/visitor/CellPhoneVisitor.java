package edu.luc.project5.visitor;

public interface CellPhoneVisitor {
    public void visit(SprintCellPhone router);
    public void visit(ATTCellPhone router);
    public void visit(VerizonCellPhone router);
}
