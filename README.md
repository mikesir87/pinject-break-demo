# Demo Project

This simple project builds a WAR file that contains an `index.html` and two JAX-RS endpoints.  It's used to test the pinject CDI extension.

The project has a `Dockerfile` located in the `docker/` directory, which will build an image using Wildfly 10.1.0.Final.

## Building from Maven

```
mvn clean package docker:build
```

## Running Docker Image

```
docker run --rm -tip 8080:8080 -p 9990:9990 pinject-break-demo
```

Then, open your browser to http://localhost:8080/


## Development

The image creates a Wildfly management user with credentials `admin:admin`.  You can deploy to the server using a JBoss Remote configuration.



### Deploying to Remote Server in IntelliJ

1. Click on the *Run* menu and open *Edit Configurations...*
2. Click on the "+" and select a *JBoss Server* -> *Remote*.
3. Under *JBoss Server Settings*, enter the following:
   - _Management Port:_ 9990
   - _Username:_ admin
   - _Password:_ admin
   - _Operating mode:_ standalone
4. Under *Remote Staging*:
   - _Type:_ Same file system
   - _Host:_ Same file system
5. Under *Remote Connection Settings":
   - _Host:_ localhost
   - _Port:_ 80
6. In the *Deployment* tab:
   - Add a deployment for the war file
   - *Deployment method:* (off to the right): Native

