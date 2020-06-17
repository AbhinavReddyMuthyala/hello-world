package com.azure.demo;
import com.azure.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldService extends Application<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    public static void main( String[] args ) throws Exception {
        new HelloWorldService().run("server","config.yaml");
    }


    @Override
    public void run(Configuration configuration, Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }
}
