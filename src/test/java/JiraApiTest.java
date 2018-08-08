import api.RestSender;
import api.TransitionFunc;
import api.model.*;
import com.google.gson.Gson;
import org.junit.Test;

public class JiraApiTest {

    @Test
    public void testJiraApiCreateIssue() {
        String link = "http://localhost:8080/rest/api/2/issue/";
        String login ="vaspup";
        String password = "Marina1988M";

        RestSender rest = new RestSender(login,password);


        String answer = rest.getRequest(link + "createmeta");
        CreateMeta createMeta = new Gson().fromJson(answer, CreateMeta.class);

        Issue createIssueData = new Issue();
        createIssueData.fields.project.key = createMeta.projects[0].key;
        createIssueData.fields.issuetype.id = createMeta.projects[0].issuetypes[0].id;
        createIssueData.fields.summary = "autotest issue";
        createIssueData.fields.description = "issue description";
        answer = rest.postRequest(link, new Gson().toJson(createIssueData), 201);
        CreateIssue newIssueData = new Gson().fromJson(answer, CreateIssue.class);

        answer = rest.getRequest(link + newIssueData.key + "/transitions");
        TransitionAnswer transitionAnswer = new Gson().fromJson(answer, TransitionAnswer.class);
        Transition workTrans = TransitionFunc.findTransitionByName(transitionAnswer.transitions, "Work");

        TransitionCreate transitionCreate = new TransitionCreate(workTrans.id);
         answer = rest.postRequest(link + newIssueData.key + "/transitions",
                new Gson().toJson(transitionCreate), 204);
    }
}
