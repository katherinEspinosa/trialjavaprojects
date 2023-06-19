package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ToolController implements Initializable {

    @FXML
    private Button toolFave1, toolFave2, toolFave3, toolFave4, toolFave5, toolFave6, toolCart1, 
    toolCart2, toolCart3, toolCart4, toolCart5, toolCart6, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView tool1, tool2, tool3, tool4, tool5, tool6;

    @FXML
    private Label toolprice1, toolprice2, toolprice3, toolprice4, toolprice5, toolprice6, 
    toolname1, toolname2, toolname3, toolname4, toolname5, toolname6;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== BAKING PANS/MOLDS ==================//
        toolname1.setText(LoginController.bPans.getProductName());
        toolprice1.setText(Double.toString(LoginController.bPans.getProductPrice()));
        Image bakingPan = new Image(LoginController.bPans.getProductImage());
        tool1.setImage(bakingPan);

        // ============== MEASURING CUPS ==================//
        toolname2.setText(LoginController.mCup.getProductName());
        toolprice2.setText(Double.toString(LoginController.mCup.getProductPrice()));
        Image measuringCup = new Image(LoginController.mCup.getProductImage());
        tool2.setImage(measuringCup);

        // ============== MEASURING SPOONS ==================//
        toolname3.setText(LoginController.mSpoon.getProductName());
        toolprice3.setText(Double.toString(LoginController.mSpoon.getProductPrice()));
        Image measuringSpoon = new Image(LoginController.mSpoon.getProductImage());
        tool3.setImage(measuringSpoon);

        // ============== MIXING BOWLS ==================//
        toolname4.setText(LoginController.mBowl.getProductName());
        toolprice4.setText(Double.toString(LoginController.mBowl.getProductPrice()));
        Image mixingBowl = new Image(LoginController.mBowl.getProductImage());
        tool4.setImage(mixingBowl);

        // ============== PIPING BAG AND TIPS ==================//
        toolname5.setText(LoginController.pBag.getProductName());
        toolprice5.setText(Double.toString(LoginController.pBag.getProductPrice()));
        Image pipingBag = new Image(LoginController.pBag.getProductImage());
        tool5.setImage(pipingBag);

        // ============== SILICONE SPATULAS ==================//
        toolname6.setText(LoginController.sSpatula.getProductName());
        toolprice6.setText(Double.toString(LoginController.sSpatula.getProductPrice()));
        Image siliconeSpatula = new Image(LoginController.sSpatula.getProductImage());
        tool6.setImage(siliconeSpatula);
    }


    // Goes to newedited.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/newedited.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to cakes.fxml
    public void gotocakes (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to cookies.fxml
    public void gotocookies (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to donuts.fxml
    public void gotodonuts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to pastries.fxml
    public void gotopastries (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/pastries.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to favorite.fxml
    public void gotofaves (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/favorites.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to bakingtools.fxml
    public void gototools (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/bakingtools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to bakingEquipment.fxml
    public void gotoequip (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/bakingEquipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to checkout.fxml
    public void gotocart (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If toolCart button is pressed, set product status to true
        if (sourceButton.equals(toolCart1)) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane37);
        }

        else if (sourceButton == toolCart2) {
            LoginController.mCup.setProductStatus(true);
            LoginController.mCup.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane38);
        }

        else if (sourceButton == toolCart3) {
            LoginController.mSpoon.setProductStatus(true);
            LoginController.mSpoon.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane39);
        }
        else if (sourceButton == toolCart4) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane40);
        }
        else if (sourceButton == toolCart5) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane41);
        }
        else if (sourceButton == toolCart6) {
            LoginController.sSpatula.setProductStatus(true);
            LoginController.sSpatula.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane42);
        }

        LoginController.cart.showItems();
    }


public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(toolFave1)) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane37);
        }

        else if (sourceButton == toolFave2) {
            LoginController.mCup.setProductStatus(true);
            LoginController.mCup.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane38);
        }

        else if (sourceButton == toolFave3) {
            LoginController.mSpoon.setProductStatus(true);
            LoginController.mSpoon.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane39);
        }
        else if (sourceButton == toolFave4) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane40);
        }
        else if (sourceButton == toolFave5) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane41);
        }
        else if (sourceButton == toolFave6) {
            LoginController.sSpatula.setProductStatus(true);
            LoginController.sSpatula.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane42);
        }

        LoginController.fave.showItems();
    }

    

}
