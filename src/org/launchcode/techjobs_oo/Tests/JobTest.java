package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class JobTest {


    @Before
    public void createJobObject() {

    }


    @Test
    public void testEmptyContructor() {
        Job test_job = new Job();
        Job another_Job = new Job();
        assertEquals(7, test_job.getId(), 0);
        assertTrue(another_Job.getId() != test_job.getId());
        assertFalse(another_Job.getId() == test_job.getId());
        assertEquals(8, another_Job.getId(), 0);

    }

    @Test
    public void testFullConstructor() {
        Job test_job1;
        Job another_Job1;
        Employer BAC = new Employer("BAC");
        Employer KForce = new Employer("KForce");
        Location SaintLouis = new Location("St Louis");
        PositionType Developer = new PositionType("Developer");
        PositionType Apprentice = new PositionType("Apprentice");
        CoreCompetency Testing = new CoreCompetency("Testing");

        test_job1 = new Job("SSS", BAC, SaintLouis, Developer, Testing);
        another_Job1 = new Job("BBB", KForce, SaintLouis, Apprentice, Testing);
        assertTrue(test_job1.getEmployer() instanceof  Employer);
        assertTrue(test_job1.getLocation() instanceof  Location);
        assertTrue(test_job1.getCoreCompetency() instanceof  CoreCompetency);
        assertTrue(test_job1.getPositionType() instanceof  PositionType);
    }

    @Test
    public void testJobsForEquality(){
        Employer BAC = new Employer("BAC");
        Employer KForce = new Employer("KForce");
        Location SaintLouis = new Location("St Louis");
        PositionType Developer = new PositionType("Developer");
        PositionType Apprentice = new PositionType("Apprentice");
        CoreCompetency Testing = new CoreCompetency("Testing");

        Job test_job = new Job("SSS", KForce, SaintLouis, Apprentice, Testing);
        Job another_Job = new Job("SSS", KForce, SaintLouis, Apprentice, Testing);
        assertFalse((test_job.equals(another_Job)));
    }

    @Test
    public void testJobToString(){
        Job test_job1;
        Job another_Job1;
        Employer BAC = new Employer("BAC");
        Location SaintLouis = new Location("St Louis");
        PositionType Developer = new PositionType("Developer");
        CoreCompetency Testing = new CoreCompetency("Testing");

        test_job1 = new Job("SSS", BAC, SaintLouis, Developer, Testing);


        String retString =  "Id: " + test_job1.getId() + '\n' +
                "Name=: " + test_job1.getName() + '\n' +
                "Employer: " + test_job1.getEmployer() + '\n' +
                "Location: " + test_job1.getLocation() + '\n' +
                "Position Type: " + test_job1.getPositionType() + '\n' +
                "Core Competency: " + test_job1.getCoreCompetency();
               System.out.println(retString);
        System.out.println(test_job1);
                assertTrue(retString.trim().equals(test_job1.toString().trim()));

        Employer KForce = new Employer("");
        PositionType Apprentice = new PositionType("Apprentice");
        another_Job1 = new Job("BBB", KForce, SaintLouis, Apprentice, Testing);
        retString =  "Id: " + another_Job1.getId() + '\n' +
                "Name=: " + another_Job1.getName() + '\n' +
                "Employer: " + another_Job1.getEmployer() + '\n' +
                "Location: " + another_Job1.getLocation() + '\n' +
                "Position Type: " + another_Job1.getPositionType() + '\n' +
                "Core Competency: " + another_Job1.getCoreCompetency();

        System.out.println(retString);
        System.out.println(another_Job1);
        assertFalse(retString.trim().equals(another_Job1.toString().trim()));

    }
    /*@Test
    public void testConsecutiveJobId() {
        Employer BAC = new Employer("BAC");
        Employer KForce = new Employer("KForce");
        Location SaintLouis = new Location("St Louis");
        PositionType Developer = new PositionType("Developer");
        PositionType Apprentice = new PositionType("Apprentice");
        CoreCompetency Testing = new CoreCompetency("Testing");

        Job test_job = new Job("SSS", BAC, SaintLouis, Developer, Testing);
        Job another_Job = new Job("BBB", KForce, SaintLouis, Apprentice, Testing);
        assertTrue(another_Job.getId() - test_job.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
//        Job yetAnotherJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String name = "Product tester";
    Employer ACME = new Employer("ACME");
    Location Desert = new Location("Desert");
    PositionType Quality_control = new PositionType("Quality control");
    CoreCompetency Persistence = new CoreCompetency("Persistence");
    Job YetAnotherJob = new Job("Product Tester", ACME, Desert, Quality_control, Persistence);
    assertTrue(YetAnotherJob instanceof Job);

//            assertEquals(10, test_car.getGasTankLevel(), .001);





    }*/


}
