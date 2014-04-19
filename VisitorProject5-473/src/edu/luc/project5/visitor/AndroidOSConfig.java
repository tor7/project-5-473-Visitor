package edu.luc.project5.visitor;

public class AndroidOSConfig implements CellPhoneVisitor{
	 
    @Override
    public void visit(SprintCellPhone cellPhone) {
        System.out.println("SprintCellPhone Configuration for Android complete !!\n");
    }
 
    @Override
    public void visit(ATTCellPhone cellPhone) {
        System.out.println("ATTCellPhone Configuration for Android complete !!\n");
    }
 
    @Override
    public void visit(VerizonCellPhone cellPhone) {
        System.out.println("VerizonCellPhone Configuration for Android complete !!\n");
    }
}

