package model;

import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;

public class SpaceRunnerSubScene extends SubScene {
	
	private final static String FONT_PATH="src/model/resources/kenvector_future.tff";
	private final static String BACKGROUND_IMAGE="model/resources/yellow_panel.png";
	
	private boolean isHidden;
	
	public SpaceRunnerSubScene() {
		super(new AnchorPane(), 600, 400);
		// TODO Auto-generated constructor stub
		prefWidth(600);
		prefHeight(400);
		
		BackgroundImage image= new BackgroundImage(new Image(BACKGROUND_IMAGE,600,400,false,true),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,null);
		AnchorPane root2= (AnchorPane) this.getRoot();
		root2.setBackground(new Background(image));
		
		isHidden=true;
		
		setLayoutX(1024);
		setLayoutY(180);
		
		
	}
	public void moveSubScene() {
		TranslateTransition transition= new TranslateTransition();
		transition.setDuration(Duration.seconds(0.5));
		transition.setNode(this);
		
		if(isHidden) {transition.setToX(-676);
		isHidden=false;
		}
		else {
			transition.setToX(0);
			isHidden=true;
		}
		transition.play();
	}
	
	public AnchorPane getPane() {
		return(AnchorPane) this.getRoot();
	}
}
