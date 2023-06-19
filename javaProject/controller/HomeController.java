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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController implements Initializable {

    @FXML
    private Button addtoFave1, addtoFave2, addtoFave3, addtoFave4, addtoFave5, addtoFave6, 
    addtoFave7, addtoFave8, addtoFave9, addtoFave10, addtoFave11, addtoFave12, addtocart1, 
    addtocart2, addtocart3, addtocart4, addtocart5, addtocart6, addtocart7, addtocart8, 
    addtocart9, addtocart10, addtocart11, addtocart12, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView img1, img10, img11, img12,  img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    private Label price1, price10, price11, price12, price2, price3, price4, price5, price6, price7, price8, price9, 
    name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;
    static FaveController favecontroller = null;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
         // ============== CHEESECAKE ==================//
        name1.setText(LoginController.cheese.getProductName());
        price1.setText(Double.toString(LoginController.cheese.getProductPrice()));
        Image cheesecakeImage = new Image(LoginController.cheese.getProductImage());
        img1.setImage(cheesecakeImage);

         // ============== CHOCOCHIP ==================//
        name2.setText(LoginController.chocoChip.getProductName());
        price2.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
        Image chocochipcookie = new Image(LoginController.chocoChip.getProductImage());
        img2.setImage(chocochipcookie);

         // ============== CHURROS ==================//
        name3.setText(LoginController.churros.getProductName());
        price3.setText(Double.toString(LoginController.churros.getProductPrice()));
        Image churro = new Image(LoginController.churros.getProductImage());
        img3.setImage(churro);

         // ============== CINNAMONROLLS ==================//
        name4.setText(LoginController.cRoll.getProductName());
        price4.setText(Double.toString(LoginController.cRoll.getProductPrice()));
        Image cinnamonrolls = new Image(LoginController.cRoll.getProductImage());
        img4.setImage(cinnamonrolls);

         // ============== S'MORES ==================//
        name5.setText(LoginController.smores.getProductName());
        price5.setText(Double.toString(LoginController.smores.getProductPrice()));
        Image smorescookie = new Image(LoginController.smores.getProductImage());
        img5.setImage(smorescookie);

         // ============== BAVARIAN ==================//
        name6.setText(LoginController.bavarian.getProductName());
        price6.setText(Double.toString(LoginController.bavarian.getProductPrice()));
        Image bavariancream = new Image(LoginController.bavarian.getProductImage());
        img6.setImage(bavariancream);

         // ============== BAKING PAN ==================//
        name7.setText(LoginController.bPans.getProductName());
        price7.setText(Double.toString(LoginController.bPans.getProductPrice()));
        Image bakingPan = new Image(LoginController.bPans.getProductImage());
        img7.setImage(bakingPan);

         // ============== MIXING BOWLS ==================//
        name8.setText(LoginController.mBowl.getProductName());
        price8.setText(Double.toString(LoginController.mBowl.getProductPrice()));
        Image mixingBowl = new Image(LoginController.mBowl.getProductImage());
        img8.setImage(mixingBowl);

         // ============== PIPING BAGS AND TIPS ==================//
        name9.setText(LoginController.pBag.getProductName());
        price9.setText(Double.toString(LoginController.pBag.getProductPrice()));
        Image pipingBag = new Image(LoginController.pBag.getProductImage());
        img9.setImage(pipingBag);
        
         // ============== CAKE STAND ==================//
        name10.setText(LoginController.cStand.getProductName());
        price10.setText(Double.toString(LoginController.cStand.getProductPrice()));
        Image cakeStand = new Image(LoginController.cStand.getProductImage());
        img10.setImage(cakeStand);

         // ============== MICROWAVE OVEN ==================//
        name11.setText(LoginController.mOven.getProductName());
        price11.setText(Double.toString(LoginController.mOven.getProductPrice()));
        Image microwaveOven = new Image(LoginController.mOven.getProductImage());
        img11.setImage(microwaveOven);

         // ============== STAND MIXER ==================//
        name12.setText(LoginController.sMixer.getProductName());
        price12.setText(Double.toString(LoginController.sMixer.getProductPrice()));
        Image standMixer = new Image(LoginController.sMixer.getProductImage());
        img12.setImage(standMixer);
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
    public void gotoequips (ActionEvent event) throws IOException {

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

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(addtoFave1)) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == addtoFave2) {
            LoginController.chocoChip.setProductStatus(true);
            LoginController.chocoChip.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == addtoFave3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }
        else if (sourceButton == addtocart4) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }
        else if (sourceButton == addtocart5) {
            LoginController.smores.setProductStatus(true);
            LoginController.smores.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }
        else if (sourceButton == addtocart6) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }
        else if (sourceButton == addtocart7) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane7);
        }
        else if (sourceButton == addtocart8) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane8);
        }
        else if (sourceButton == addtocart9) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane9);
        }
        else if (sourceButton == addtocart10) {
            LoginController.cStand.setProductStatus(true);
            LoginController.cStand.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane10);
        }
        else if (sourceButton == addtocart11) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane11);
        }
        else if (sourceButton == addtocart12) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane12);
        }


        LoginController.cart.showItems();
    }

    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(addtoFave1)) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane1);
        }

        else if (sourceButton == addtoFave2) {
            LoginController.chocoChip.setProductStatus(true);
            LoginController.chocoChip.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane2);
        }

        else if (sourceButton == addtoFave3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane3);
        }
        else if (sourceButton == addtoFave4) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane4);
        }
        else if (sourceButton == addtoFave5) {
            LoginController.smores.setProductStatus(true);
            LoginController.smores.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane5);
        }
        else if (sourceButton == addtoFave6) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane6);
        }
        else if (sourceButton == addtoFave7) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane7);
        }
        else if (sourceButton == addtocart8) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane8);
        }
        else if (sourceButton == addtocart9) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane9);
        }
        else if (sourceButton == addtocart10) {
            LoginController.cStand.setProductStatus(true);
            LoginController.cStand.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane10);
        }
        else if (sourceButton == addtocart11) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane11);
        }
        else if (sourceButton == addtocart12) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane12);
        }


        LoginController.fave.showItems();
    }

    

}
