package edu.luc.project5.visitor;

public interface CellPhoneVisitor {
    public void visit(SprintCellPhone cellPhone);
    public void visit(ATTCellPhone cellPhone);
    public void visit(VerizonCellPhone cellPhone);
}

