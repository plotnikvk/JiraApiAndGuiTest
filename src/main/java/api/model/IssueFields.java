package api.model;

public class IssueFields {
    public Project project;
    public String summary;
    public String description;
    public IssueType issuetype;

    public IssueFields() {

        this.project = new Project();
        this.issuetype = new IssueType();
    }
}
