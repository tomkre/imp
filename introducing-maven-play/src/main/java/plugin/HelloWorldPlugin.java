package plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Hello world plugin.
 * 
 * [@]goal hello
 * 
 * @author tomek
 *
 */
public class HelloWorldPlugin extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello from custom maven plugin!");
	}

}
