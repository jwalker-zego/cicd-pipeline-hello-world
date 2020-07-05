package cicd.qe.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	@Autowired
	Environment environment;
	
	@RequestMapping("/")
	public String hello() throws UnknownHostException
	{
		String datePattern = "MM/dd/yyyy HH:mm:ss";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(datePattern);
		LocalDateTime now = LocalDateTime.now();
		
		String hostName = InetAddress.getLocalHost().getHostName();
		String port = environment.getProperty("local.server.port");
		
		return "Web Server @ " + df.format(now) + ". <br/><br/><br/><b>Host: </b>" + hostName + ": <span styles=\"color:red;\"> " + port + "</span>";
	}
}
