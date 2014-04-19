package edu.luc.project5.visitor;

public interface CellPhone 
{
    public void sendData(char[] data);
    public void acceptData(char[] data);
     
    public void accept(CellPhoneVisitor v);
}
