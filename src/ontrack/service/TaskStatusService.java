package ontrack.service;

public class TaskStatusService {

    public String checkStatus(String studentId, String taskId) {

        if (studentId == null || taskId == null || studentId.isEmpty() || taskId.isEmpty()) {
            return "Invalid Input";
        }

        if (studentId.equals("S123") && taskId.equals("9.1P")) {
            return "Submitted";
        }

        if (studentId.equals("S123") && taskId.equals("8.1P")) {
            return "Reviewed";
        }

        if (studentId.equals("S123") && taskId.equals("7.1P")) {
            return "Needs Resubmission";
        }

        return "Not Found";
    }
}