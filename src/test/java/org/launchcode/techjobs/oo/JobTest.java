package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //
@Test
public void testSettingJobId () {
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1.getId(), job2.getId());
}

@Test
public void testJobConstructorSetsAllFields (){
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertTrue(testJob.getName() instanceof String);
    assertEquals("Product tester", testJob.getName());

    assertTrue(testJob.getEmployer() instanceof Employer);
    assertEquals("ACME", testJob.getEmployer().getValue());

    assertTrue(testJob.getLocation() instanceof Location);
    assertEquals("Desert", testJob.getLocation().getValue());

    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertEquals("Quality control", testJob.getPositionType().getValue());

    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", testJob.getCoreCompetency().getValue());
}

@Test
public void testJobsForEquality () {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job1.equals(job2));
}

@Test
public void testToStringStartsAndEndsWithNewLine () {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertTrue(job1.toString().startsWith(System.lineSeparator()) && job1.toString().endsWith(System.lineSeparator()));

}

@Test
public void testToStringContainsCorrectLabelsAndData () {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String testDataAndLabels = System.lineSeparator() +
            "ID: " + job1.getId() + System.lineSeparator() +
            "Name: Product tester" + System.lineSeparator() +
            "Employer: ACME" + System.lineSeparator() +
            "Location: Desert" + System.lineSeparator() +
            "Position Type: Quality control" + System.lineSeparator() +
            "Core Competency: Persistence" +
            System.lineSeparator();

    assertEquals(testDataAndLabels, job1.toString());

}

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

        String emptyFieldJobTester = System.lineSeparator() +
                "ID: " + job1.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(emptyFieldJobTester, job1.toString());
    }


}
