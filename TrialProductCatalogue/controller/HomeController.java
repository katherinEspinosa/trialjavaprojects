package controller;

import model.*;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class HomeController {

    @FXML
    Label name1, name2, name3, name4, price1, price2, price3, price4;

    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    Button button1, button2, button3, button4, cartbutton, backButton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static ActorLSH lsh = new ActorLSH();
    static ActorLJS ljs = new ActorLJS();
    static ActorLJW ljw = new ActorLJW();
    static ActorLDH ldh = new ActorLDH();

    public void initialize() throws IOException {

        // ============== LEE JONG SUL ==================//

        ljs.setHusbandName("Lee Jong Suk");
        name1.setText(ljs.getHusbandName());

        ljs.setHusbandPrice(20000.00);
        price1.setText(Double.toString(ljs.getHusbandPrice()));

        ljs.setHusbandImage("images/image1.jpg");
        Image leejongsuk = new Image(ljs.getHusbandImage());
        img1.setImage(leejongsuk);

        // ============== LEE SANG HEON ==================//

        lsh.setHusbandName("Lee Sang Heon ");
        name2.setText(lsh.getHusbandName());

        lsh.setHusbandPrice(1500.00);
        price2.setText(Double.toString(lsh.getHusbandPrice()));

        lsh.setHusbandImage("images/image2.jpg");
        Image leesangheon = new Image(lsh.getHusbandImage());
        img2.setImage(leesangheon);

        // ============== LEE JAE WOOK ==================//
        ljw.setHusbandName("Lee Jae Wook");
        name3.setText(ljw.getHusbandName());

        ljw.setHusbandPrice(15000.00);
        price3.setText(Double.toString(ljw.getHusbandPrice()));

        ljw.setHusbandImage("images/image3.jpg");
        Image leejaewook = new Image(ljw.getHusbandImage());
        img3.setImage(leejaewook);

        // ============== LEE DO HYUN  ==================//
  
        ldh.setHusbandName("Lee Do Hyun");
        name4.setText(ldh.getHusbandName());

        ldh.setHusbandPrice(1000.00);
        price4.setText(Double.toString(ldh.getHusbandPrice()));

        ldh.setHusbandImage("images/image4.jpg");
        Image leedohyun = new Image(ldh.getHusbandImage());
        img4.setImage(leedohyun);

        loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
        root = loader.load();

        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();
        AlertMaker.showSimpleAlert("Information Alert", "Husband Added to Heart <3");

        if (sourceButton.equals(button1)) {
            ljs.setHusbandStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            lsh.setHusbandStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            ljw.setHusbandStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == button4) {
            ldh.setHusbandStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }
    }

    public void gotocart(ActionEvent event) throws IOException {

        //checkoutController.initialize(ljs, lsh, ljw, ldh);
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goback (ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/start.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
}
}