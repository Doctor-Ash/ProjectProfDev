import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.Configuration.ClassList;
import org.eclipse.jetty.webapp.WebAppContext;


public class Controller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		Server server = new Server(8005); //sets the sever port it will run on
		WebAppContext ctx = new WebAppContext();
		ctx.setResourceBase("webapp"); //sets the directory for the web files
		ctx.setContextPath("/profdev");


		//config
		ctx.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/[^/]*jst1.*\\.jar$");
		ClassList classlist = ClassList.setServerDefault(server);
		classlist.addBefore("org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
				"org.eclipse.jetty.annotations.AnnotationConfiguration");

		//mappings to servlets
		
		ctx.addServlet("Servlets.LoginServlet", "/login");
		ctx.addServlet("Servlets.LogoutServlet", "/logout");
		ctx.addServlet("Servlets.AddSkillServlet", "/addSkill");
		ctx.addServlet("Servlets.CreateAccountServlet", "/create");
		ctx.addServlet("Servlets.ShowSkillsServlet", "/showskills");
		ctx.addServlet("Servlets.GraphTest", "/graph");
		ctx.addServlet("Servlets.ShowUnitsServlet", "/showunits");
		ctx.addServlet("Servlets.AddUnitServlet", "/addUnit");
		ctx.addServlet("Servlets.AddGoalServlet", "/addGoal");
		ctx.addServlet("Servlets.ShowGoalServlet", "/showGoals");
		ctx.addServlet("Servlets.DeleteUnitServlet", "/deleteUnit");
		//ctx.addServlet("Servlets.loggedIn", "/loggedIn");
		
		ctx.addServlet("Servlets.ServletHome","/home");

		//setting the handler and starting the sever
		server.setHandler(ctx);
		server.start();
		server.join();


	}

}
