import javafx.application.Application; 
import javafx.scene.Group; // perhaps roup s not used in this case, maybe a Pane of sorts instead
import javafx.scene.Scene; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.scene.layout.Pane; 
import javafx.scene.layout.StackPane;

import javafx.scene.paint.Color; 
import javafx.scene.text.Text; 
import javafx.scene.input.MouseEvent;
// shapes
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType; 
import javafx.scene.shape.Rectangle; 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import javafx.util.Duration; 
import javafx.animation.TranslateTransition; 
import javafx.animation.RotateTransition; 
import javafx.scene.control.Button; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
 

// orgnize these ^^^

// translate transition 
public class ColorWheel extends Application
{   

 
    public void start(Stage primaryStage) {
    // Arc(x, y, rx, ry, angle, arc length)
    // arc length sum = circumference
    // C = 2pi*r
    // C / 6 = arc length
    // angle = 360, 360/6 = 60 degree angles each
    Arc wheel1 = new Arc(250,250,150,150, 60,90);   
    wheel1.setType(ArcType.ROUND);
    wheel1.setStroke(Color.GREEN);
    wheel1.setFill(Color.GREEN); 
    Arc wheel2 = new Arc(250,250,150, 150, 120, 90); 
    wheel2.setType(ArcType.ROUND);
    wheel2.setStroke(Color.BLUE);
    wheel2.setFill(Color.BLUE);
    Arc wheel3 = new Arc(250,250,150, 150,180, 60 ); 
    wheel3.setType(ArcType.ROUND);
    wheel3.setStroke(Color.RED);
    wheel3.setFill(Color.RED);
    Arc wheel4 = new Arc(250,250,150, 150,240, 60); 
    wheel4.setType(ArcType.ROUND);
    wheel4.setStroke(Color.PURPLE);
    wheel4.setFill(Color.PURPLE);
    Arc wheel5 = new Arc(250,250,150, 150, 300,60); 
    wheel5.setType(ArcType.ROUND);
    wheel5.setStroke(Color.YELLOW);
    wheel5.setFill(Color.YELLOW);
    Arc wheel6 = new Arc(250,250,150, 150, 360, 60); 
    wheel6.setType(ArcType.ROUND);
    wheel6.setStroke(Color.ORANGE);
    wheel6.setFill(Color.ORANGE);
    Line arrow = new Line(250, 250,250, 150); 
    arrow.setStrokeWidth(2); 
    Line arrow2 = new Line(250, 250, 350, 250);
    arrow2.setStrokeWidth(2); 
    Line arrow3 = new Line(250, 250, 250, 350); 
    arrow3.setStrokeWidth(2); 
    Line arrow4 = new Line(250, 250, 150, 250); 
    arrow4.setStrokeWidth(2);
    
    Button pressme = new Button("Spin"); 
    
    
    Group grp = new Group(wheel1, wheel2, wheel3, wheel4, wheel5, wheel6);
    // cool looking kaleidoscope effect w/out group
    
    RotateTransition rt = new RotateTransition(Duration.millis(3000), grp);
    rt.setByAngle(720);
    rt.setCycleCount(2);
    rt.setAutoReverse(false);
   
    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
    
    public void handle(MouseEvent event){
    rt.play(); 
    event.consume();
    }
    
    };
    pressme.setOnMouseClicked(handler); 
    
    Pane root = new Pane(grp,arrow, arrow2, arrow3, arrow4, pressme); 
  
    Scene sceneObj = new Scene(root, 300, 300, Color.WHITE);
   
    primaryStage.setTitle("Color wheel"); 
    primaryStage.setScene(sceneObj); 
    primaryStage.show(); }}

  