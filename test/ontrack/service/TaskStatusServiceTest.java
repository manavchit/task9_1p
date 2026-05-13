package ontrack.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedTaskStatus() {
        TaskStatusService service = new TaskStatusService();
        assertEquals("Submitted", service.checkStatus("S123", "9.1P"));
    }

    @Test
    public void testReviewedTaskStatus() {
        TaskStatusService service = new TaskStatusService();
        assertEquals("Reviewed", service.checkStatus("S123", "8.1P"));
    }

    @Test
    public void testNeedsResubmissionStatus() {
        TaskStatusService service = new TaskStatusService();
        assertEquals("Needs Resubmission", service.checkStatus("S123", "7.1P"));
    }

    @Test
    public void testInvalidInput() {
        TaskStatusService service = new TaskStatusService();
        assertEquals("Invalid Input", service.checkStatus("", "9.1P"));
    }

    @Test
    public void testTaskNotFound() {
        TaskStatusService service = new TaskStatusService();
        assertEquals("Not Found", service.checkStatus("S123", "10.1P"));
    }
}