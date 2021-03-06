package com.example.bcs.visualstore.PojoDatas;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AdvanceInput implements Serializable {



    @SerializedName("pantoAngle")
    private static String pantoAngle;
    @SerializedName("bowAngle")
    private static String bowAngle;
    @SerializedName("rightPdz")
    private static String rightPdz;
    @SerializedName("leftPdz")
    private static String leftPdz;
    @SerializedName("rightYfh")
    private static String rightYfh;
    @SerializedName("leftYfh")
    private static String leftYfh;
    @SerializedName("rightBvd")
    private static String rightBvd;
    @SerializedName("leftBvd")
    private static String leftBvd;
    @SerializedName("rightFrmHigt")
    private static String rightFrmHigt;
    @SerializedName("leftFrmHigt")
    private static String leftFrmHigt;
    @SerializedName("rightFrmLegt")
    private static String rightFrmLegt;
    @SerializedName("leftFrmLegt")
    private static String leftFrmLegt;
    @SerializedName("rightDbl")
    private static String rightDbl;
    @SerializedName("leftDbl")
    private static String leftDbl;
    @SerializedName("rightCheck")
    private static String rightCheck;
    @SerializedName("leftCheck")
    private static String leftCheck;

    @SerializedName("frame")
    String frame;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }



    public String getPantoAngle() {
        return pantoAngle;
    }

    public  String getRightCheck() {
        return rightCheck;
    }

    public  void setRightCheck(String rightCheck) {
        AdvanceInput.rightCheck = rightCheck;
    }

    public  String getLeftCheck() {
        return leftCheck;
    }

    public  void setLeftCheck(String leftCheck) {
        AdvanceInput.leftCheck = leftCheck;
    }

    public void setPantoAngle(String pantoAngle) {
        AdvanceInput.pantoAngle = pantoAngle;
    }

    public String getBowAngle() {
        return bowAngle;
    }

    public void setBowAngle(String bowAngle) {
        AdvanceInput.bowAngle = bowAngle;
    }

    public String getRightPdz() {
        return rightPdz;
    }

    public void setRightPdz(String rightPdz) {
        AdvanceInput.rightPdz = rightPdz;
    }

    public String getLeftPdz() {
        return leftPdz;
    }

    public void setLeftPdz(String leftPdz) {
        AdvanceInput.leftPdz = leftPdz;
    }

    public String getRightYfh() {
        return rightYfh;
    }

    public void setRightYfh(String rightYfh) {
        AdvanceInput.rightYfh = rightYfh;
    }

    public String getLeftYfh() {
        return leftYfh;
    }

    public void setLeftYfh(String leftYfh) {
        AdvanceInput.leftYfh = leftYfh;
    }

    public String getRightBvd() {
        return rightBvd;
    }

    public void setRightBvd(String rightBvd) {
        AdvanceInput.rightBvd = rightBvd;
    }

    public String getLeftBvd() {
        return leftBvd;
    }

    public void setLeftBvd(String leftBvd) {
        AdvanceInput.leftBvd = leftBvd;
    }

    public String getRightFrmHigt() {
        return rightFrmHigt;
    }

    public void setRightFrmHigt(String rightFrmHigt) {
        AdvanceInput.rightFrmHigt = rightFrmHigt;
    }

    public String getLeftFrmHigt() {
        return leftFrmHigt;
    }

    public void setLeftFrmHigt(String leftFrmHigt) {
        AdvanceInput.leftFrmHigt = leftFrmHigt;
    }

    public String getRightFrmLegt() {
        return rightFrmLegt;
    }

    public void setRightFrmLegt(String rightFrmLegt) {
        AdvanceInput.rightFrmLegt = rightFrmLegt;
    }

    public String getLeftFrmLegt() {
        return leftFrmLegt;
    }

    public void setLeftFrmLegt(String leftFrmLegt) {
        AdvanceInput.leftFrmLegt = leftFrmLegt;
    }

    public String getRightDbl() {
        return rightDbl;
    }

    public void setRightDbl(String rightDbl) {
        AdvanceInput.rightDbl = rightDbl;
    }

    public String getLeftDbl() {
        return leftDbl;
    }



    public void setLeftDbl(String leftDbl) {
        AdvanceInput.leftDbl = leftDbl;
    }

    public String serialize(){
        Gson gson=new Gson();
        return gson.toJson(this);
    }


    static public AdvanceInput create(String serializedData){
        Gson gson=new Gson();
        return gson.fromJson(serializedData,AdvanceInput.class);
    }

}
