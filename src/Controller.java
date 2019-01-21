import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.Configuration.ClassList;
import org.eclipse.jetty.webapp.WebAppContext;


public class Controller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Server server = new Server(8005); //sets the sever port it will run on
		WebAppContext ctx = new WebAppContext();
		ctx.setResourceBase("webapp"); //sets the directory for the web files
		ctx.setContextPath("/vehicle");
		
		
		//config
		ctx.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/[^/]*jst1.*\\.jar$");
		ClassList classlist = ClassList.setServerDefault(server);
		classlist.addBefore("org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
				"org.eclipse.jetty.annotations.AnnotationConfiguration");
		
		//mappings
		
		ctx.addServlet("servlets.LoginServlet", "/login");
		ctx.addServlet("servlets.LogoutServlet", "/logout");

		ctx.addServlet("servlets.ServerletHome","/home");

//alex is great
		// alex is not great 
		//setting the handler and starting the sever
		server.setHandler(ctx);
		server.start();
		server.join();
		
		
	}

}
