package patterns.facade;

public class WorkFlow {
    private Job job=new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();
    public void soldProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
