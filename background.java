package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class background {
	public static Group generate() {

		// bounds of the road
		Line leftBound = new Line(200, 0, 200, 800);
		Line rightBound = new Line(400, 0, 400, 800);
		Rectangle leftField = new Rectangle(0, 0, 200, 800);
		Rectangle rightField = new Rectangle(400, 0, 200, 800);
		Rectangle road = new Rectangle(200, 0, 200, 800);
		road.setFill(Color.LIGHTGRAY);
		leftField.setFill(Color.LIGHTGREEN);
		rightField.setFill(Color.LIGHTGREEN);

		// dashed lines in the middle
		Line dash1 = new Line(300, 40, 300, 80);
		dash1.setStroke(Color.WHITE);
		dash1.setStrokeWidth(5);
		Line dash2 = new Line(300, 130, 300, 170);
		dash2.setStroke(Color.WHITE);
		dash2.setStrokeWidth(5);
		Line dash3 = new Line(300, 210, 300, 250);
		dash3.setStroke(Color.WHITE);
		dash3.setStrokeWidth(5);
		Line dash4 = new Line(300, 300, 300, 340);
		dash4.setStroke(Color.WHITE);
		dash4.setStrokeWidth(5);
		Line dash5 = new Line(300, 390, 300, 430);
		dash5.setStroke(Color.WHITE);
		dash5.setStrokeWidth(5);
		Line dash6 = new Line(300, 480, 300, 520);
		dash6.setStroke(Color.WHITE);
		dash6.setStrokeWidth(5);
		Line dash7 = new Line(300, 570, 300, 610);
		dash7.setStroke(Color.WHITE);
		dash7.setStrokeWidth(5);
		Line dash8 = new Line(300, 660, 300, 700);
		dash8.setStroke(Color.WHITE);
		dash8.setStrokeWidth(5);
		Line dash9 = new Line(300, 750, 300, 790);
		dash9.setStroke(Color.WHITE);
		dash9.setStrokeWidth(5);

		// shows your score
		Text score = new Text(20, 760, "Score : ");
		score.setFont(Font.font("verdana", FontWeight.BLACK, FontPosture.REGULAR, 15));

		Group root = new Group(leftBound, rightBound, leftField, rightField, road);
		Group dashes = new Group(dash1, dash2, dash3, dash4, dash5, dash6, dash7, dash8, dash9);
		root.getChildren().add(dashes);
		root.getChildren().add(score);

		return root;

	}
}
