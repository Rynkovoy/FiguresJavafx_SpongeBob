package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Controller {

    @FXML
    ColorPicker colorPicker = new ColorPicker();

    //wisp
    @FXML
    Rectangle wisp = new Rectangle();
    @FXML
    CheckBox cbWisp = new CheckBox();

    //holes
    @FXML
    Ellipse hole1 = new Ellipse();
    @FXML
    Ellipse hole2 = new Ellipse();
    @FXML
    Ellipse hole3 = new Ellipse();
    @FXML
    Ellipse hole4 = new Ellipse();
    @FXML
    Ellipse hole5 = new Ellipse();
    @FXML
    Ellipse hole6 = new Ellipse();
    @FXML
    CheckBox cbHoles = new CheckBox();
    ArrayList<Ellipse> holesList = new ArrayList<Ellipse>();

    //pants
    @FXML
    Rectangle pants1 = new Rectangle();
    @FXML
    Rectangle pants2 = new Rectangle();
    @FXML
    Rectangle pants3 = new Rectangle();
    @FXML
    CheckBox cbPants = new CheckBox();
    ArrayList<Rectangle> pantsList = new ArrayList<Rectangle>();

    //eyes
    @FXML
    Circle eye1 = new Circle();
    @FXML
    Circle eye2 = new Circle();
    @FXML
    CheckBox cbEyes = new CheckBox();

    //nose
    @FXML
    Ellipse nose = new Ellipse();
    @FXML
    CheckBox cbNose = new CheckBox();

    //mouth
    @FXML
    QuadCurve mouth = new QuadCurve();
    @FXML
    CheckBox cbMouth = new CheckBox();

    //tongue
    @FXML
    Ellipse tongue = new Ellipse();
    @FXML
    CheckBox сbTongue = new CheckBox();

    //teeth
    @FXML
    Rectangle teeth1 = new Rectangle();
    @FXML
    Rectangle teeth2 = new Rectangle();
    @FXML
    CheckBox cbTeeth = new CheckBox();

    public void setColor(ActionEvent actionEvent) {
        // wisp
        if(cbWisp.isSelected()) {
            wisp.setFill(colorPicker.getValue());
        }
        // holes
        holesList.add(hole1);
        holesList.add(hole2);
        holesList.add(hole3);
        holesList.add(hole4);
        holesList.add(hole5);
        holesList.add(hole6);
        if (cbHoles.isSelected()) {
           for (int i = 0; i < holesList.size(); i++) {
               holesList.get(i).setFill(colorPicker.getValue());
           }
        }
        //pants
        pantsList.add(pants1);
        pantsList.add(pants2);
        pantsList.add(pants3);
        if (cbPants.isSelected()) {
            for (int i = 0; i < pantsList.size(); i++) {
                pantsList.get(i).setFill(colorPicker.getValue());
            }
        }
        // eyes
        if(cbEyes.isSelected()) {
            eye1.setFill(colorPicker.getValue());
            eye2.setFill(colorPicker.getValue());
        }
        //nose
        if (cbNose.isSelected()) {
            nose.setFill(colorPicker.getValue());
        }
        //mouth
        if (cbMouth.isSelected()) {
            mouth.setFill(colorPicker.getValue());
        }
        //tongue
        if(сbTongue.isSelected()) {
            tongue.setFill(colorPicker.getValue());
        }
        //teeth
        if(cbTeeth.isSelected()) {
            teeth1.setFill(colorPicker.getValue());
            teeth2.setFill(colorPicker.getValue());
        }
    }

    public void setDef(ActionEvent actionEvent) {
        wisp.setStyle("-fx-fill: #fff600");
        for (Ellipse h : holesList) {
            h.setStyle("-fx-fill: #e3ff1f");
        }
        for (Rectangle p : pantsList) {
            p.setStyle("-fx-fill: #944200");
        }
        eye1.setStyle("-fx-fill: #000000");
        eye2.setStyle("-fx-fill: #000000");
        nose.setStyle("-fx-fill: #fff600");
        mouth.setStyle("-fx-fill: #ff1f1f");
        tongue.setStyle("-fx-fill: #d73ab5");
        teeth1.setStyle("-fx-fill: #ffffff");
        teeth2.setStyle("-fx-fill: #ffffff");
    }
}
