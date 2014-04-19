package edu.luc.project5.visitor;

public class ATTCellPhone implements CellPhone{
	 
    @Override
    public void sendData(char[] data) {
    }
 
    @Override
    public void acceptData(char[] data) {
    }
     
    @Override
    public void accept(CellPhoneVisitor v) {
        v.visit(this);
    }
}