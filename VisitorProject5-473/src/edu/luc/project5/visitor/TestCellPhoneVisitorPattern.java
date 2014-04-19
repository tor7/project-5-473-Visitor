package edu.luc.project5.visitor;

import java.util.*;

import junit.framework.TestCase;


public class TestCellPhoneVisitorPattern extends TestCase
{
    private BlackberryOSconfig blackberryConf;
    private AndroidOSConfig androidConf;
    private SprintCellPhone sprintPhone;
    private ATTCellPhone attPhone;
    private VerizonCellPhone verizonPhone;

    public void setUp()
    {
        blackberryConf = new BlackberryOSconfig();
        androidConf = new AndroidOSConfig();

        sprintPhone = new SprintCellPhone();
        attPhone = new ATTCellPhone();
        verizonPhone = new VerizonCellPhone();
    }

    public void testsprintPhone()
    {
        sprintPhone.accept(blackberryConf);
        sprintPhone.accept(androidConf);
    }

    public void testattPhone()
    {
        attPhone.accept(blackberryConf);
        attPhone.accept(androidConf);
    }

    public void testverizonPhone()
    {
        verizonPhone.accept(blackberryConf);
        verizonPhone.accept(androidConf);
    }
}

