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

public class DonutController implements Initializable {

    @FXML
    private Button donutFave1, donutFave2, donutFave3, donutFave4, donutFave5, donutFave6, donutCart1, 
    donutCart2, donutCart3, donutCart4, donutCart5, donutCart6,cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView donut1, donut2, donut3, donut4, donut5, donut6;

    @FXML
    private Label donutprice1, donutprice2, donutprice3, donutprice4, donutprice5, donutprice6, 
    donutname1, donutname2, donutname3, donutname4, donutname5, donutname6;

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
       
         // ============== BAVARIAN CREAM FILLED ==================//
        donutname1.setText(LoginController.bavarian.getProductName());
        donutprice1.setText(Double.toString(LoginController.bavarian.getProductPrice()));
        Image Bavarian = new Image(LoginController.bavarian.getProductImage());
        donut1.setImage(Bavarian);

         // ============== CHOCO FROSTED DONUT ==================//
        donutname2.setText(LoginController.cFrost.getProductName());
        donutprice2.setText(Double.toString(LoginController.cFrost.getProductPrice()));
        Image chocoFrost = new Image(LoginController.cFrost.getProductImage());
        donut2.setImage(chocoFrost);

         // ============== CHURROS ==================//
        donutname3.setText(LoginController.churros.getProductName());
        donutprice3.setText(Double.toString(LoginController.churros.getProductPrice()));
        Image Churros = new Image(LoginController.churros.getProductImage());
        donut3.setImage(Churros);

         // ============== CINNAMON TWIST ==================//
        donutname4.setText(LoginController.cTwist.getProductName());
        donutprice4.setText(Double.toString(LoginController.cTwist.getProductPrice()));
        Image cinnamonTwist = new Image(LoginController.cTwist.getProductImage());
        donut4.setImage(cinnamonTwist);

         // ============== GLAZED DONUTS ==================//
        donutname5.setText(LoginController.gDonuts.getProductName());
        donutprice5.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
        Image glazedDonut = new Image(LoginController.gDonuts.getProductImage());
        donut5.setImage(glazedDonut);

         // ============== PEANUT BUTTER DONUTS ==================//
        donutname6.setText(LoginController.pbDonut.getProductName());
        donutprice6.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
        Image pbDonuts = new Image(LoginController.pbDonut.getProductImage());
        donut6.setImage(pbDonuts);
    }


    // Goes to Home.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cakes.fxml
    public void gotocakes (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cookies.fxml
    public void gotocookies (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Donuts.fxml
    public void gotodonuts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Pastry.fxml
    public void gotopastry (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Pastry.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Favorite.fxml
    public void gotofaves (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Favorites.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Tools.fxml
    public void gototools (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Tools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Equipment.fxml
    public void gotoequip (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Equipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Checkout.fxml
    public void gotocart (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

     // Goes to Credits.fxml
    public void gotocredits (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/About.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }



    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");

        Button sourceButton = (Button) event.getSource();

        // If donutCart button is pressed, set product status to true
        if (sourceButton.equals(donutCart1)) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        }

        else if (sourceButton == donutCart2) {
            LoginController.cFrost.setProductStatus(true);
            LoginController.cFrost.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        }

        else if (sourceButton == donutCart3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane15);
        }
        else if (sourceButton == donutCart4) {
            LoginController.cTwist.setProductStatus(true);
            LoginController.cTwist.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane16);
        }
        else if (sourceButton == donutCart5) {
            LoginController.gDonuts.setProductStatus(true);
            LoginController.gDonuts.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane17);
        }
        else if (sourceButton == donutCart6) {
            LoginController.pbDonut.setProductStatus(true);
            LoginController.pbDonut.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane18);
        }

        LoginController.cart.showItems();
    }

public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(donutFave1)) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane13);
        }

        else if (sourceButton == donutFave2) {
            LoginController.cFrost.setProductStatus(true);
            LoginController.cFrost.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane14);
        }

        else if (sourceButton == donutFave3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane15);
        }
        else if (sourceButton == donutFave4) {
            LoginController.cTwist.setProductStatus(true);
            LoginController.cTwist.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane16);
        }
        else if (sourceButton == donutFave5) {
            LoginController.gDonuts.setProductStatus(true);
            LoginController.gDonuts.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane17);
        }
        else if (sourceButton == donutFave6) {
            LoginController.pbDonut.setProductStatus(true);
            LoginController.pbDonut.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane18);
        }

        LoginController.fave.showItems();
    }


    

}
