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

public class PastryController implements Initializable {

    @FXML
    private Button pastryFave1, pastryFave2, pastryFave3, pastryFave4, pastryFave5, pastryFave6, pastryCart1, 
    pastryCart2, pastryCart3, pastryCart4, pastryCart5, pastryCart6,cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView pastry1, pastry2, pastry3, pastry4, pastry5, pastry6;

    @FXML
    private Label pastryprice1, pastryprice2, pastryprice3, pastryprice4, pastryprice5, pastryprice6, 
    pastryname1, pastryname2, pastryname3, pastryname4, pastryname5, pastryname6;

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
       
        // ============== BIBINGKA ==================//
        pastryname1.setText(LoginController.bibingka.getProductName());
        pastryprice1.setText(Double.toString(LoginController.bibingka.getProductPrice()));
        Image bibingkaa = new Image(LoginController.bibingka.getProductImage());
        pastry1.setImage(bibingkaa);

        // ============== CINNAMON ROLL ==================/
        pastryname2.setText(LoginController.cRoll.getProductName());
        pastryprice2.setText(Double.toString(LoginController.cRoll.getProductPrice()));
        Image cremebrulee = new Image(LoginController.cRoll.getProductImage());
        pastry2.setImage(cremebrulee);

        // ============== CINNAMON TWIST ==================/
        pastryname3.setText(LoginController.croissant.getProductName());
        pastryprice3.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image croissantt = new Image(LoginController.croissant.getProductImage());
        pastry3.setImage(croissantt);

        // ============== EGG TART ==================//
        pastryname4.setText(LoginController.eggTart.getProductName());
        pastryprice4.setText(Double.toString(LoginController.eggTart.getProductPrice()));
        Image eggTartt = new Image(LoginController.eggTart.getProductImage());
        pastry4.setImage(eggTartt);

        // ============== EMPANADA ==================/
        pastryname5.setText(LoginController.empanada.getProductName());
        pastryprice5.setText(Double.toString(LoginController.empanada.getProductPrice()));
        Image peanutbutter = new Image(LoginController.empanada.getProductImage());
        pastry5.setImage(peanutbutter);

        // ============== PANDESAL ==================/
        pastryname6.setText(LoginController.pandesal.getProductName());
        pastryprice6.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image pandesall = new Image(LoginController.pandesal.getProductImage());
        pastry6.setImage(pandesall);
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

        AlertMaker.showSimpleAlert("hello ", "item added");

        Button sourceButton = (Button) event.getSource();

        // If pastryCart button is pressed, set product status to true
        if (sourceButton.equals(pastryCart1)) {
            LoginController.bibingka.setProductStatus(true);
            LoginController.bibingka.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane31);
        }

        else if (sourceButton == pastryCart2) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane32);
        }

        else if (sourceButton == pastryCart3) {
            LoginController.croissant.setProductStatus(true);
            LoginController.croissant.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane33);
        }
        else if (sourceButton == pastryCart4) {
            LoginController.eggTart.setProductStatus(true);
            LoginController.eggTart.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane34);
        }
        else if (sourceButton == pastryCart5) {
            LoginController.empanada.setProductStatus(true);
            LoginController.empanada.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane35);
        }
        else if (sourceButton == pastryCart6) {
            LoginController.pandesal.setProductStatus(true);
            LoginController.pandesal.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane36);
        }

        LoginController.cart.showItems();
    }

    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(pastryFave1)) {
            LoginController.bibingka.setProductStatus(true);
            LoginController.bibingka.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane31);
        }

        else if (sourceButton == pastryFave2) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane32);
        }

        else if (sourceButton == pastryFave3) {
            LoginController.croissant.setProductStatus(true);
            LoginController.croissant.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane33);
        }
        else if (sourceButton == pastryFave4) {
            LoginController.eggTart.setProductStatus(true);
            LoginController.eggTart.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane34);
        }
        else if (sourceButton == pastryFave5) {
            LoginController.empanada.setProductStatus(true);
            LoginController.empanada.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane35);
        }
        else if (sourceButton == pastryFave6) {
            LoginController.pandesal.setProductStatus(true);
            LoginController.pandesal.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane36);
        }

        LoginController.fave.showItems();
    }


    

}
