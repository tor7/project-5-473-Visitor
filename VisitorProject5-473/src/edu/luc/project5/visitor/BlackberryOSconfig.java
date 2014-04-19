package edu.luc.project5.visitor;

public class BlackberryOSconfig implements CellPhoneVisitor{
	 
    @Override
    public void visit(SprintCellPhone cellPhone) {
        System.out.println("SprintPhone Configuration for Blaclberry has been completed !!\n");
    }
 
    @Override
    public void visit(ATTCellPhone cellPhone) {
        System.out.println("ATTCellPhone Configuration for Blackberry has been completed !!\n");
    }
 
    @Override
    public void visit(VerizonCellPhone cellPhone) {
        System.out.println("VerizonCellPhone Configuration for Blackberry has been completed !!\n");
    }
}