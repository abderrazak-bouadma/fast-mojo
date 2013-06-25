package com.cdcfast.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.lifecycle.Phase;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Created with IntelliJ IDEA.
 * User: Utilistateur
 * Date: 25/06/13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
@Mojo(name = "fastMojo", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
@Execute(goal = "fastGoal", phase = LifecyclePhase.GENERATE_SOURCES)
public class FastMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("******************************\r\nI'm the Fast Mojo \r\n******************************)");
    }
}
