package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CullFace;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;


public class SphereCullFace extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing Sphere1
        Sphere sphere1 = new Sphere();
        //Cone3D cone = new Cone3D();

        //Setting the radius of the Sphere
        sphere1.setRadius(50.0);

        //Setting the position of the sphere
        sphere1.setTranslateX(100);
        sphere1.setTranslateY(150);

        //setting the cull face of the sphere to front
        sphere1.setCullFace(CullFace.FRONT);

        //Drawing Sphere2
        Sphere sphere2 = new Sphere();

        //Setting the radius of the Sphere
        sphere2.setRadius(50.0);

        //Setting the position of the sphere
        sphere2.setTranslateX(300);
        sphere2.setTranslateY(150);

        //Setting the cull face of the sphere to back
        sphere2.setCullFace(CullFace.BACK);

        //Drawing Sphere3
        Sphere sphere3 = new Sphere();

        //Setting the radius of the Sphere
        sphere3.setRadius(50.0);

        //Setting the position of the sphere
        sphere3.setTranslateX(500);
        sphere3.setTranslateY(150);

        //Setting the cull face of the sphere to none
        sphere2.setCullFace(CullFace.NONE);


        //Creating Translate Transition
        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransition1 = new TranslateTransition();
        TranslateTransition translateTransition3 = new TranslateTransition();

        //Setting the duration of the transition
        translateTransition.setDuration(Duration.millis(1000));
        translateTransition1.setDuration(Duration.millis(500));
        translateTransition3.setDuration(Duration.millis(5000));

        //Setting the node for the transition
        translateTransition.setNode(sphere2);
        translateTransition1.setNode(sphere1);
        translateTransition3.setNode(sphere3);

        //Setting the value of the transition along the x axis.
        translateTransition.setByY(-300);
        translateTransition1.setByX(750);
        translateTransition3.setByX(-250);
        translateTransition3.setByY(-100);

        //Setting the cycle count for the transition
        translateTransition.setCycleCount(50);
        translateTransition1.setCycleCount(50);
        translateTransition3.setCycleCount(50);

        //Setting auto reverse value to false
        translateTransition.setAutoReverse(true);
        translateTransition1.setAutoReverse(true);
        translateTransition3.setAutoReverse(true);

        //Playing the animation
        translateTransition.play();
        translateTransition1.play();
        translateTransition3.play();

        //Creating a Group object
        Group root = new Group(sphere1, sphere2, sphere3);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Drawing a Sphere");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
