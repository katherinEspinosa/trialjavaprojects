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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

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

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9,
    choicebox10, choicebox11, choicebox12, choicebox13, choicebox14, choicebox15, choicebox16, choicebox17, choicebox18, choicebox19, choicebox20,
    choicebox21, choicebox22, choicebox23, choicebox24, choicebox25, choicebox26, choicebox27, choicebox28, choicebox29, choicebox30, choicebox31, choicebox32;

    @FXML
    Button homeButton, checkoutbutton;

    @FXML
    Stage stage;

    private String[] quantity = { "1", "2", "3", "4" };

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


        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");           choicebox16.setValue("1");          choicebox31.setValue("1");      
        choicebox2.setValue("1");           choicebox17.setValue("1");          choicebox32.setValue("1");      
        choicebox3.setValue("1");           choicebox18.setValue("1");                
        choicebox4.setValue("1");           choicebox19.setValue("1");          
        choicebox5.setValue("1");           choicebox20.setValue("1");          
        choicebox6.setValue("1");           choicebox21.setValue("1");          
        choicebox7.setValue("1");           choicebox22.setValue("1");          
        choicebox8.setValue("1");           choicebox23.setValue("1");          
        choicebox9.setValue("1");           choicebox24.setValue("1");          
        choicebox10.setValue("1");          choicebox25.setValue("1");          
        choicebox11.setValue("1");          choicebox26.setValue("1");          
        choicebox12.setValue("1");          choicebox27.setValue("1");         
        choicebox13.setValue("1");          choicebox28.setValue("1");          
        choicebox14.setValue("1");          choicebox29.setValue("1");          
        choicebox15.setValue("1");          choicebox30.setValue("1");          

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);     choicebox25.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);     choicebox26.getItems().addAll(quantity);        
        choicebox3.getItems().addAll(quantity);     choicebox27.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);     choicebox28.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);     choicebox29.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);     choicebox30.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);     choicebox31.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);     choicebox32.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);     
        choicebox10.getItems().addAll(quantity);    
        choicebox11.getItems().addAll(quantity);    
        choicebox12.getItems().addAll(quantity);    
        choicebox13.getItems().addAll(quantity);    
        choicebox14.getItems().addAll(quantity);    
        choicebox15.getItems().addAll(quantity);    
        choicebox16.getItems().addAll(quantity);    
        choicebox17.getItems().addAll(quantity);   
        choicebox18.getItems().addAll(quantity);    
        choicebox19.getItems().addAll(quantity);    
        choicebox20.getItems().addAll(quantity);    
        choicebox21.getItems().addAll(quantity);    
        choicebox22.getItems().addAll(quantity);   
        choicebox23.getItems().addAll(quantity);    
        choicebox24.getItems().addAll(quantity);    


        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);     choicebox25.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);     choicebox26.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);     choicebox27.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);     choicebox28.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);     choicebox29.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);     choicebox30.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);     choicebox31.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);     choicebox32.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);    
        choicebox10.setOnAction(this::computeTotal);    
        choicebox11.setOnAction(this::computeTotal);    
        choicebox12.setOnAction(this::computeTotal);    
        choicebox13.setOnAction(this::computeTotal);    
        choicebox14.setOnAction(this::computeTotal);    
        choicebox15.setOnAction(this::computeTotal);   
        choicebox16.setOnAction(this::computeTotal);   
        choicebox17.setOnAction(this::computeTotal);    
        choicebox18.setOnAction(this::computeTotal);   
        choicebox19.setOnAction(this::computeTotal);    
        choicebox20.setOnAction(this::computeTotal);    
        choicebox21.setOnAction(this::computeTotal);    
        choicebox22.setOnAction(this::computeTotal);   
        choicebox23.setOnAction(this::computeTotal);       
        choicebox24.setOnAction(this::computeTotal);    
    }

    public void computeTotal(ActionEvent event) {

 
        double totalAmount = 0;         double item13Amount = 0;    double item26Amount = 0;    
        double item1Amount = 0;         double item14Amount = 0;    double item27Amount = 0;    
        double item2Amount = 0;         double item15Amount = 0;    double item28Amount = 0;   
        double item3Amount = 0;         double item16Amount = 0;    double item29Amount = 0;    
        double item4Amount = 0;         double item17Amount = 0;    double item30Amount = 0;    
        double item5Amount = 0;         double item18Amount = 0;    double item31Amount = 0;    
        double item6Amount = 0;         double item19Amount = 0;    double item32Amount = 0;   
        double item7Amount = 0;         double item20Amount = 0;        
        double item8Amount = 0;         double item21Amount = 0;       
        double item9Amount = 0;         double item22Amount = 0;       
        double item10Amount = 0;        double item23Amount = 0;       
        double item11Amount = 0;        double item24Amount = 0;      
        double item12Amount = 0;        double item25Amount = 0;    

        ChoiceBox source = (ChoiceBox) event.getSource();

        // CAKE
    // bForest // cheese // chocoCC // redCC // cCake //tiramisu

         if (LoginController.bForest.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            LoginController.bForest.setProductQuantity(qty);
            item1Amount = LoginController.bForest.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.bForest.getProductPrice() * qty;
            }
        }
         if (LoginController.cheese.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            LoginController.cheese.setProductQuantity(qty);
            item2Amount = LoginController.cheese.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.cheese.getProductPrice() * qty;
            }
        }
         if (LoginController.chocoCC.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            LoginController.chocoCC.setProductQuantity(qty);
            item3Amount = LoginController.chocoCC.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.chocoCC.getProductPrice() * qty;
            }
        }
         if (LoginController.cCake.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            LoginController.cCake.setProductQuantity(qty);
            item4Amount = LoginController.cCake.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.cCake.getProductPrice() * qty;
            }
        }
         if (LoginController.redCC.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            LoginController.redCC.setProductQuantity(qty);
            item5Amount = LoginController.redCC.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.redCC.getProductPrice() * qty;
            }
        }
         if (LoginController.tiramisu.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            LoginController.tiramisu.setProductQuantity(qty);
            item6Amount = LoginController.tiramisu.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = LoginController.tiramisu.getProductPrice() * qty;
            }
        }

        // COOKIE
        // chocoChip cBrulee fCookie oatmeal pbCookie smores
        // choicebox7 - choicebox24
        if (LoginController.chocoChip.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            LoginController.chocoChip.setProductQuantity(qty);
            item7Amount = LoginController.chocoChip.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = LoginController.chocoChip.getProductPrice() * qty;
            }
        }
         if (LoginController.cBrulee.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            LoginController.cBrulee.setProductQuantity(qty);
            item8Amount = LoginController.cBrulee.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = LoginController.cBrulee.getProductPrice() * qty;
            }
        }
         if (LoginController.fCookie.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            LoginController.fCookie.setProductQuantity(qty);
            item9Amount = LoginController.fCookie.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = LoginController.fCookie.getProductPrice() * qty;
            }
        }
         if (LoginController.oatmeal.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            LoginController.oatmeal.setProductQuantity(qty);
            item10Amount = LoginController.oatmeal.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = LoginController.oatmeal.getProductPrice() * qty;
            }
        }
         if (LoginController.pbCookie.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            LoginController.pbCookie.setProductQuantity(qty);
            item11Amount = LoginController.pbCookie.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = LoginController.pbCookie.getProductPrice() * qty;
            }
        }
         if (LoginController.smores.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            LoginController.smores.setProductQuantity(qty);
            item12Amount = LoginController.smores.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = LoginController.smores.getProductPrice() * qty;
            }
        }

        //DONUTS
        // bavarian cFrost churros cTwist gDonuts pbDonut
        // choicebox13 - choicebox30
        if (LoginController.bavarian.getProductStatus()) {

            double qty = Double.parseDouble(choicebox13.getValue());
            LoginController.bavarian.setProductQuantity(qty);
            item13Amount = LoginController.bavarian.getProductPrice() * qty;

            if (source == choicebox13) {
                item13Amount = LoginController.bavarian.getProductPrice() * qty;
            }
        }
         if (LoginController.cFrost.getProductStatus()) {

            double qty = Double.parseDouble(choicebox14.getValue());
            LoginController.cFrost.setProductQuantity(qty);
            item14Amount = LoginController.cFrost.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = LoginController.cFrost.getProductPrice() * qty;
            }
        }
         if (LoginController.churros.getProductStatus()) {

            double qty = Double.parseDouble(choicebox15.getValue());
            LoginController.churros.setProductQuantity(qty);
            item15Amount = LoginController.churros.getProductPrice() * qty;

            if (source == choicebox15) {
                item15Amount = LoginController.churros.getProductPrice() * qty;
            }
        }
         if (LoginController.cTwist.getProductStatus()) {

            double qty = Double.parseDouble(choicebox16.getValue());
            LoginController.cTwist.setProductQuantity(qty);
            item16Amount = LoginController.cTwist.getProductPrice() * qty;

            if (source == choicebox16) {
                item16Amount = LoginController.cTwist.getProductPrice() * qty;
            }
        }
         if (LoginController.gDonuts.getProductStatus()) {

            double qty = Double.parseDouble(choicebox17.getValue());
            LoginController.gDonuts.setProductQuantity(qty);
            item17Amount = LoginController.gDonuts.getProductPrice() * qty;

            if (source == choicebox17) {
                item17Amount = LoginController.gDonuts.getProductPrice() * qty;
            }
        }
         if (LoginController.churros.getProductStatus()) {

            double qty = Double.parseDouble(choicebox18.getValue());
            LoginController.pbDonut.setProductQuantity(qty);
            item18Amount = LoginController.pbDonut.getProductPrice() * qty;

            if (source == choicebox18) {
                item18Amount = LoginController.pbDonut.getProductPrice() * qty;
            }
        }
        
        // PASTRIES
        // bibingka cRoll croissant eggTart empanada pandesal
        // choicebox19 - choicebox36
        if (LoginController.bibingka.getProductStatus()) {

            double qty = Double.parseDouble(choicebox19.getValue());
            LoginController.bibingka.setProductQuantity(qty);
            item19Amount = LoginController.bibingka.getProductPrice() * qty;

            if (source == choicebox19) {
                item19Amount = LoginController.bibingka.getProductPrice() * qty;
            }
        }
         if (LoginController.cRoll.getProductStatus()) {

            double qty = Double.parseDouble(choicebox20.getValue());
            LoginController.cRoll.setProductQuantity(qty);
            item20Amount = LoginController.cRoll.getProductPrice() * qty;

            if (source == choicebox20) {
                item20Amount = LoginController.cRoll.getProductPrice() * qty;
            }
        }
         if (LoginController.croissant.getProductStatus()) {

            double qty = Double.parseDouble(choicebox21.getValue());
            LoginController.croissant.setProductQuantity(qty);
            item21Amount = LoginController.croissant.getProductPrice() * qty;

            if (source == choicebox21) {
                item21Amount = LoginController.croissant.getProductPrice() * qty;
            }
        }
         if (LoginController.eggTart.getProductStatus()) {

            double qty = Double.parseDouble(choicebox22.getValue());
            LoginController.eggTart.setProductQuantity(qty);
            item22Amount = LoginController.eggTart.getProductPrice() * qty;

            if (source == choicebox22) {
                item22Amount = LoginController.eggTart.getProductPrice() * qty;
            }
        }
         if (LoginController.empanada.getProductStatus()) {

            double qty = Double.parseDouble(choicebox23.getValue());
            LoginController.empanada.setProductQuantity(qty);
            item23Amount = LoginController.empanada.getProductPrice() * qty;

            if (source == choicebox23) {
                item23Amount = LoginController.empanada.getProductPrice() * qty;
            }
        }
         if (LoginController.pandesal.getProductStatus()) {

            double qty = Double.parseDouble(choicebox24.getValue());
            LoginController.pandesal.setProductQuantity(qty);
            item24Amount = LoginController.pandesal.getProductPrice() * qty;

            if (source == choicebox24) {
                item24Amount = LoginController.pandesal.getProductPrice() * qty;
            }
        }

        // TOOLS
        // bPans mCup  mBowl pBag 
        if (LoginController.bPans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox25.getValue());
            LoginController.bPans.setProductQuantity(qty);
            item25Amount = LoginController.bPans.getProductPrice() * qty;

            if (source == choicebox25) {
                item25Amount = LoginController.bPans.getProductPrice() * qty;
            }
        }
         if (LoginController.mCup.getProductStatus()) {

            double qty = Double.parseDouble(choicebox26.getValue());
            LoginController.mCup.setProductQuantity(qty);
            item26Amount = LoginController.mCup.getProductPrice() * qty;

            if (source == choicebox26) {
                item26Amount = LoginController.mCup.getProductPrice() * qty;
            }
        }

         if (LoginController.mBowl.getProductStatus()) {

            double qty = Double.parseDouble(choicebox27.getValue());
            LoginController.mBowl.setProductQuantity(qty);
            item27Amount = LoginController.mBowl.getProductPrice() * qty;

            if (source == choicebox27) {
                item27Amount = LoginController.mBowl.getProductPrice() * qty;
            }
        }
         if (LoginController.pBag.getProductStatus()) {

            double qty = Double.parseDouble(choicebox28.getValue());
            LoginController.pBag.setProductQuantity(qty);
            item28Amount = LoginController.pBag.getProductPrice() * qty;

            if (source == choicebox28) {
                item28Amount = LoginController.pBag.getProductPrice() * qty;
            }
        }

        //EQUIPMENT
        // fProcessor hMixer mOven sMixer 
       
         if (LoginController.fProcessor.getProductStatus()) {

            double qty = Double.parseDouble(choicebox29.getValue());
            LoginController.fProcessor.setProductQuantity(qty);
            item29Amount = LoginController.fProcessor.getProductPrice() * qty;

            if (source == choicebox29) {
                item29Amount = LoginController.fProcessor.getProductPrice() * qty;
            }
        }
         if (LoginController.hMixer.getProductStatus()) {

            double qty = Double.parseDouble(choicebox30.getValue());
            LoginController.hMixer.setProductQuantity(qty);
            item30Amount = LoginController.hMixer.getProductPrice() * qty;

            if (source == choicebox30) {
                item30Amount = LoginController.hMixer.getProductPrice() * qty;
            }
        }
         if (LoginController.mOven.getProductStatus()) {

            double qty = Double.parseDouble(choicebox31.getValue());
            LoginController.mOven.setProductQuantity(qty);
            item31Amount = LoginController.mOven.getProductPrice() * qty;

            if (source == choicebox31) {
                item31Amount = LoginController.mOven.getProductPrice() * qty;
            }
        }
         if (LoginController.sMixer.getProductStatus()) {

            double qty = Double.parseDouble(choicebox32.getValue());
            LoginController.sMixer.setProductQuantity(qty);
            item32Amount = LoginController.sMixer.getProductPrice() * qty;

            if (source == choicebox32) {
                item32Amount = LoginController.sMixer.getProductPrice() * qty;
            }
        }
        

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount +item7Amount +item8Amount +item9Amount +item10Amount +item11Amount +item12Amount + item13Amount +
        item14Amount +item15Amount +item16Amount +item17Amount + item18Amount + item19Amount +item20Amount +item21Amount +item22Amount +item23Amount +item24Amount +item25Amount +item26Amount +item27Amount +
        item28Amount + item29Amount + item30Amount + item31Amount + item32Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;

        //cake
        if (LoginController.cheese.getProductStatus()) {
            totalAmount += LoginController.cheese.getProductPrice();
        }

        if (LoginController.bForest.getProductStatus()) {
            totalAmount += LoginController.bForest.getProductPrice();
        }

        if (LoginController.chocoCC.getProductStatus()) {
            totalAmount += LoginController.chocoCC.getProductPrice();
        }

        if (LoginController.redCC.getProductStatus()) {
            totalAmount += LoginController.redCC.getProductPrice();
        }

        if (LoginController.cCake.getProductStatus()) {
            totalAmount += LoginController.cCake.getProductPrice();
        }

        if (LoginController.tiramisu.getProductStatus()) {
            totalAmount += LoginController.tiramisu.getProductPrice();
        }

        //cookie
          if (LoginController.chocoChip.getProductStatus()) {
            totalAmount += LoginController.chocoChip.getProductPrice();
        }

        if (LoginController.cBrulee.getProductStatus()) {
            totalAmount += LoginController.cBrulee.getProductPrice();
        }

        if (LoginController.fCookie.getProductStatus()) {
            totalAmount += LoginController.fCookie.getProductPrice();
        }

        if (LoginController.oatmeal.getProductStatus()) {
            totalAmount += LoginController.oatmeal.getProductPrice();
        }

        if (LoginController.pbCookie.getProductStatus()) {
            totalAmount += LoginController.pbCookie.getProductPrice();
        }

        if (LoginController.smores.getProductStatus()) {
            totalAmount += LoginController.smores.getProductPrice();
        }

         //donut
        if (LoginController.bavarian.getProductStatus()) {
            totalAmount += LoginController.bavarian.getProductPrice();
        }

        if (LoginController.cFrost.getProductStatus()) {
            totalAmount += LoginController.cFrost.getProductPrice();
        }

        if (LoginController.churros.getProductStatus()) {
            totalAmount += LoginController.churros.getProductPrice();
        }

        if (LoginController.cTwist.getProductStatus()) {
            totalAmount += LoginController.cTwist.getProductPrice();
        }

        if (LoginController.gDonuts.getProductStatus()) {
            totalAmount += LoginController.gDonuts.getProductPrice();
        }

        if (LoginController.pbDonut.getProductStatus()) {
            totalAmount += LoginController.pbDonut.getProductPrice();
        }

        //pastry
        if (LoginController.bibingka.getProductStatus()) {
            totalAmount += LoginController.bibingka.getProductPrice();
        }

        if (LoginController.cRoll.getProductStatus()) {
            totalAmount += LoginController.cRoll.getProductPrice();
        }

        if (LoginController.croissant.getProductStatus()) {
            totalAmount += LoginController.croissant.getProductPrice();
        }

        if (LoginController.eggTart.getProductStatus()) {
            totalAmount += LoginController.eggTart.getProductPrice();
        }

        if (LoginController.empanada.getProductStatus()) {
            totalAmount += LoginController.empanada.getProductPrice();
        }

        if (LoginController.pandesal.getProductStatus()) {
            totalAmount += LoginController.pandesal.getProductPrice();
        }

        //tools
        if (LoginController.bPans.getProductStatus()) {
            totalAmount += LoginController.bPans.getProductPrice();
        }

        if (LoginController.mCup.getProductStatus()) {
            totalAmount += LoginController.mCup.getProductPrice();
        }


        if (LoginController.mBowl.getProductStatus()) {
            totalAmount += LoginController.mBowl.getProductPrice();
        }

        if (LoginController.pBag.getProductStatus()) {
            totalAmount += LoginController.pBag.getProductPrice();
        }


        //equipment

        if (LoginController.fProcessor.getProductStatus()) {
            totalAmount += LoginController.fProcessor.getProductPrice();
        }

        if (LoginController.hMixer.getProductStatus()) {
            totalAmount += LoginController.hMixer.getProductPrice();
        }

        if (LoginController.mOven.getProductStatus()) {
            totalAmount += LoginController.mOven.getProductPrice();
        }

        if (LoginController.sMixer.getProductStatus()) {
            totalAmount += LoginController.sMixer.getProductPrice();
        }
        

        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
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

    // Goes to Home.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
