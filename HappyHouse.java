import javafx.application.Application; 
import javafx.scene.Group; 
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
import javafx.scene.shape.Polygon; 
import javafx.util.Duration; 
import javafx.animation.TranslateTransition; 
import javafx.animation.RotateTransition; 
import javafx.scene.control.Button; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 


public class HappyHouse extends Application{
    
   public void start(Stage primaryStage){
       
       Rectangle base = new Rectangle(125, 175, 175, 125); 
       base.setFill(Color.MAGENTA); 
        
       Rectangle door = new Rectangle(185,250,25, 50); 
       door.setFill(Color.GREEN); 
       Rectangle windowL = new Rectangle(145, 260, 25, 25); 
       windowL.setFill(Color.CYAN);
       Rectangle windowR = new Rectangle(260 ,260,25, 25); 
       windowR.setFill(Color.CYAN); 
       Circle knob = new Circle(205, 280, 3); 
       knob.setFill(Color.YELLOW);
       Line sil1L = new Line(145, 273, 170, 273);
       Line sil2L = new Line(158, 260,158,285);
       Line sil1R = new Line(260, 273, 285, 273); 
       Line sil2R = new Line(273, 260, 273, 285); 
       Polygon tri = new Polygon(); 
       
       tri.getPoints().addAll(new Double[]{
    125.0, 175.0, 
    212.5, 115.0,          
   300.0, 175.0,
       });
       
  Group root = new Group(base, door, windowR, windowL, tri, knob, sil1L, sil2L, sil1R, sil2R);
    Scene sceneObj = new Scene(root);
   
    primaryStage.setTitle("Happy House"); 
    primaryStage.setScene(sceneObj); 
    primaryStage.show(); }

   public static void main(String[] args){
launch(args); 
}}
