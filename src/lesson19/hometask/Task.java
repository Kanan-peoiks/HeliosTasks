package lesson19.hometask;

public class Task {
    Integer taskId;
    Double estimatedHours;
    TaskStatus status;
    UrgencyLevel urgency;
    Boolean isCritical;

    public Task(Integer taskId, Double estimatedHours, TaskStatus status, UrgencyLevel urgency, Boolean isCritical) {
        this.taskId = taskId;
        this.estimatedHours = estimatedHours;
        this.status = status;
        this.urgency = urgency;
        this.isCritical = isCritical;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Double getEstimatedHours() {
        return estimatedHours;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public UrgencyLevel getUrgency() {
        return urgency;
    }

    public Boolean getCritical() {
        return isCritical;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", estimatedHours=" + estimatedHours +
                ", status=" + status +
                ", urgency=" + urgency +
                ", isCritical=" + isCritical +
                '}';
    }

    public void updateStatus(TaskStatus newStatus) {
        this.status = newStatus;
    }

}
