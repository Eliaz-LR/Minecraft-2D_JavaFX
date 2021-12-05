package model;

import java.awt.*;

import com.sun.webkit.dom.DocumentImpl;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;

public class Joueur {
    public Image img;
    public Image imgD;
    public Image imgG;
    public Joueur(){
        //image de base
        this.img = new Image("/images/steve.png", 160/2, 360/2, true, true);
        //image pour aller de chaque coté
        this.imgD = new Image("/images/steve-right.png", 160/2, 360/2, true, true);
        this.imgG = new Image("/images/steve.png", 160/2, 360/2, true, true);
    }
    public Joueur(double width, double height){
        //image de base
        this.img = new Image("/images/steve.png", width, height, true, true);
        //image pour aller de chaque coté
        this.imgD = new Image("/images/steve-right.png", width, height, true, true);
        this.imgG = new Image("/images/steve.png", width, height, true, true);
    }


    //les coordonnées du joueur sont ici données en "unités" de canvas
    public double x;
    public float y;

    public DoubleProperty xP = new SimpleDoubleProperty(x);
    public DoubleProperty yP = new SimpleDoubleProperty(y);




}