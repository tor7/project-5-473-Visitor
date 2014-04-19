package edu.luc.project5.visitor;

import java.util.*;

import junit.framework.TestCase;


public class TestClient extends TestCase
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

    public void testSprintPhone()
    {
        sprintPhone.accept(blackberryConf);
        sprintPhone.accept(androidConf);
    }

    public void testAttPhone()
    {
        attPhone.accept(blackberryConf);
        attPhone.accept(androidConf);
    }

    public void testVerizonPhone()
    {
        verizonPhone.accept(blackberryConf);
        verizonPhone.accept(androidConf);
    }
}

