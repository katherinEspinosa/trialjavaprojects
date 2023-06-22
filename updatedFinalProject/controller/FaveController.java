package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FaveController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13, pane14, pane15, pane16,
    pane17, pane18, pane19, pane20, pane21, pane22, pane23, pane24, pane25, pane26, pane27, pane28, pane29, pane30, pane31, pane32;

    @FXML
    VBox myvbox;

    @FXML
    Label  cakename1, cakename2, cakename3, cakename4, cakename5, cakename6, cakeprice1, cakeprice2, cakeprice3, cakeprice4, cakeprice5, cakeprice6, 
    cookiename1, cookiename2, cookiename3, cookiename4, cookiename5, cookiename6, cookieprice1, cookieprice2, cookieprice3, cookieprice4, cookieprice5, cookieprice6, 
    donutname1, donutname2, donutname3, donutname4, donutname5, donutname6, donutprice1, donutprice2, donutprice3, donutprice4, donutprice5, donutprice6, 
    pastryname1, pastryname2, pastryname3, pastryname4, pastryname5, pastryname6, pastryprice1, pastryprice2, pastryprice3, pastryprice4, pastryprice5, pastryprice6, 
    toolname1, toolname2, toolname3, toolname4, toolname5, toolname6, toolprice1, toolprice2, toolprice3, toolprice4, toolprice5, toolprice6, 
    equipname1, equipname2, equipname3, equipname4, equipname5, equipname6, equipprice1, equipprice2, equipprice3, equipprice4, equipprice5, equipprice6, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, 
    cake1, cake2, cake3, cake4, cake5, cake6, cookie1, cookie2, cookie3, cookie4, cookie5, cookie6, 
    donut1, donut2, donut3, donut4, donut5, donut6, pastry1, pastry2, pastry3, pastry4, pastry5, pastry6, 
    tool1, tool2, tool3, tool4, tool5, tool6, equip1, equip2, equip3, equip4, equip5, equip6;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //CAKE
        cakename1.setText(LoginController.bForest.getProductName());
        cakeprice1.setText(Double.toString(LoginController.bForest.getProductPrice()));
        Image blackForest = new Image(LoginController.bForest.getProductImage());
        cake1.setImage(blackForest);

        cakename2.setText(LoginController.cheese.getProductName());
        cakeprice2.setText(Double.toString(LoginController.cheese.getProductPrice()));
        Image cheeseCake = new Image(LoginController.cheese.getProductImage());
        cake2.setImage(cheeseCake);

        cakename3.setText(LoginController.chocoCC.getProductName());
        cakeprice3.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
        Image chocoMud = new Image(LoginController.chocoCC.getProductImage());
        cake3.setImage(chocoMud);
        
        cakename4.setText(LoginController.cCake.getProductName());
        cakeprice4.setText(Double.toString(LoginController.cCake.getProductPrice()));
        Image coffeeCake = new Image(LoginController.cCake.getProductImage());
        cake4.setImage(coffeeCake);
        
        cakename5.setText(LoginController.redCC.getProductName());
        cakeprice5.setText(Double.toString(LoginController.redCC.getProductPrice()));
        Image redVelvet = new Image(LoginController.redCC.getProductImage());
        cake5.setImage(redVelvet);
           
        cakename6.setText(LoginController.tiramisu.getProductName());
        cakeprice6.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
        Image Tiramisu = new Image(LoginController.tiramisu.getProductImage());
        cake6.setImage(Tiramisu);

        //COOKIE
        cookiename1.setText(LoginController.chocoChip.getProductName());
        cookieprice1.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
        Image chocochip = new Image(LoginController.chocoChip.getProductImage());
        cookie1.setImage(chocochip);

        cookiename2.setText(LoginController.cBrulee.getProductName());
        cookieprice2.setText(Double.toString(LoginController.cBrulee.getProductPrice()));
        Image cremeBrulee = new Image(LoginController.cBrulee.getProductImage());
        cookie2.setImage(cremeBrulee);

        cookiename3.setText(LoginController.fCookie.getProductName());
        cookieprice3.setText(Double.toString(LoginController.fCookie.getProductPrice()));
        Image fortunecookie = new Image(LoginController.fCookie.getProductImage());
        cookie3.setImage(fortunecookie);

        cookiename4.setText(LoginController.oatmeal.getProductName());
        cookieprice4.setText(Double.toString(LoginController.oatmeal.getProductPrice()));
        Image oatmealcookie = new Image(LoginController.oatmeal.getProductImage());
        cookie4.setImage(oatmealcookie);

        cookiename5.setText(LoginController.pbCookie.getProductName());
        cookieprice5.setText(Double.toString(LoginController.pbCookie.getProductPrice()));
        Image pbBlossom = new Image(LoginController.pbCookie.getProductImage());
        cookie5.setImage(pbBlossom);

        cookiename6.setText(LoginController.smores.getProductName());
        cookieprice6.setText(Double.toString(LoginController.smores.getProductPrice()));
        Image smoresCookie = new Image(LoginController.smores.getProductImage());
        cookie6.setImage(smoresCookie);

        //DONUTS
        donutname1.setText(LoginController.bavarian.getProductName());
        donutprice1.setText(Double.toString(LoginController.bavarian.getProductPrice()));
        Image bavarian = new Image(LoginController.bavarian.getProductImage());
        donut1.setImage(bavarian);

        donutname2.setText(LoginController.cFrost.getProductName());
        donutprice2.setText(Double.toString(LoginController.cFrost.getProductPrice()));
        Image chocoFrost = new Image(LoginController.cFrost.getProductImage());
        donut2.setImage(chocoFrost);

        donutname3.setText(LoginController.churros.getProductName());
        donutprice3.setText(Double.toString(LoginController.churros.getProductPrice()));
        Image churros = new Image(LoginController.churros.getProductImage());
        donut3.setImage(churros);

        donutname4.setText(LoginController.cTwist.getProductName());
        donutprice4.setText(Double.toString(LoginController.cTwist.getProductPrice()));
        Image cinnamonTwist = new Image(LoginController.cTwist.getProductImage());
        donut4.setImage(cinnamonTwist);

        donutname5.setText(LoginController.gDonuts.getProductName());
        donutprice5.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
        Image glazedDonut = new Image(LoginController.gDonuts.getProductImage());
        donut5.setImage(glazedDonut);

        donutname6.setText(LoginController.pbDonut.getProductName());
        donutprice6.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
        Image pbDonut = new Image(LoginController.pbDonut.getProductImage());
        donut6.setImage(pbDonut);

        //PASTRIES
        pastryname1.setText(LoginController.bibingka.getProductName());
        pastryprice1.setText(Double.toString(LoginController.bibingka.getProductPrice()));
        Image Bibingka = new Image(LoginController.bibingka.getProductImage());
        pastry1.setImage(Bibingka);

        pastryname2.setText(LoginController.cRoll.getProductName());
        pastryprice2.setText(Double.toString(LoginController.cRoll.getProductPrice()));
        Image cinnamonRolls = new Image(LoginController.cRoll.getProductImage());
        pastry2.setImage(cinnamonRolls);

        pastryname3.setText(LoginController.croissant.getProductName());
        pastryprice3.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image Croissant = new Image(LoginController.croissant.getProductImage());
        pastry3.setImage(Croissant);

        pastryname4.setText(LoginController.eggTart.getProductName());
        pastryprice4.setText(Double.toString(LoginController.eggTart.getProductPrice()));
        Image EggTart = new Image(LoginController.eggTart.getProductImage());
        pastry4.setImage(EggTart);

        pastryname5.setText(LoginController.empanada.getProductName());
        pastryprice5.setText(Double.toString(LoginController.empanada.getProductPrice()));
        Image Empanada = new Image(LoginController.empanada.getProductImage());
        pastry5.setImage(Empanada);

        pastryname6.setText(LoginController.pandesal.getProductName());
        pastryprice6.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image PanDeSal = new Image(LoginController.pandesal.getProductImage());
        pastry6.setImage(PanDeSal);

        //TOOLS 
        toolname1.setText(LoginController.bPans.getProductName());
        toolprice1.setText(Double.toString(LoginController.bPans.getProductPrice()));
        Image bakingPanAndMold = new Image(LoginController.bPans.getProductImage());
        tool1.setImage(bakingPanAndMold);

        toolname2.setText(LoginController.mCup.getProductName());
        toolprice2.setText(Double.toString(LoginController.mCup.getProductPrice()));
        Image measuringCups = new Image(LoginController.mCup.getProductImage());
        tool2.setImage(measuringCups);

        toolname3.setText(LoginController.mBowl.getProductName());
        toolprice3.setText(Double.toString(LoginController.mBowl.getProductPrice()));
        Image MixingBowl = new Image(LoginController.mBowl.getProductImage());
        tool3.setImage(MixingBowl);

        toolname4.setText(LoginController.pBag.getProductName());
        toolprice4.setText(Double.toString(LoginController.pBag.getProductPrice()));
        Image PipingBag = new Image(LoginController.pBag.getProductImage());
        tool4.setImage(PipingBag);


        //EQUIPMENT

        equipname1.setText(LoginController.fProcessor.getProductName());
        equipprice1.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
        Image FoodProcessor = new Image(LoginController.fProcessor.getProductImage());
        equip1.setImage(FoodProcessor);

        equipname2.setText(LoginController.hMixer.getProductName());
        equipprice2.setText(Double.toString(LoginController.hMixer.getProductPrice()));
        Image handMixer = new Image(LoginController.hMixer.getProductImage());
        equip2.setImage(handMixer);

        equipname3.setText(LoginController.mOven.getProductName());
        equipprice3.setText(Double.toString(LoginController.mOven.getProductPrice()));
        Image MicrowaveOven = new Image(LoginController.mOven.getProductImage());
        equip3.setImage(MicrowaveOven);

        equipname4.setText(LoginController.sMixer.getProductName());
        equipprice4.setText(Double.toString(LoginController.sMixer.getProductPrice()));
        Image StandMixer = new Image(LoginController.sMixer.getProductImage());
        equip4.setImage(StandMixer);

    }


    // Go to Receipt Page
    public void gotohome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}
