package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

	private boolean erasing = false;

	@FXML
	private Pane drawingAreaPane;
	@FXML
	private RadioButton penBox;
	@FXML
	private RadioButton eraserBox;

	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
	}

	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle = new Circle(event.getX(), event.getY(), 4, erasing ? Color.WHITE : Color.BLACK);
		drawingAreaPane.getChildren().add(newCircle);
	}

	@FXML
	void pickEraser(ActionEvent event) {
		erasing = true;
		penBox.setSelected(false);
	}

	@FXML
	void pickPen(ActionEvent event) {
		erasing = false;
		eraserBox.setSelected(false);
	}

}
