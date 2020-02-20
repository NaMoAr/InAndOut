package edu.miracosta.cs134.inandout.model;

public class Order {

    private int mCheeseburger;
    private int mDOubleDouble;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mShakes;
    private int mSmallDrinks;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_DOUBLE_DOUBLE = 3.60;
    public static final double PRICE_FRENSH_FRIES = 1.65;
    public static final double PRICE_LARGE_DRINK = 1.75;
    public static final double PRICE_MEDIUM_DRINK = 1.55;
    public static final double PRICE_SHAKE = 2.20;
    public static final double PRICE_SMALL_DRINK = 1.45;
    public static final double PRICE_TAX_RATE = 0.08;

    public int getCheeseburger() {
        return mCheeseburger;
    }

    public void setCheeseburger(int Cheeseburger) {
        mCheeseburger = Cheeseburger;
    }

    public int getDOubleDouble() {
        return mDOubleDouble;
    }

    public void setDOubleDouble(int DOubleDouble) {
        mDOubleDouble = DOubleDouble;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getNumberItemsOrdered(){
        return mCheeseburger+mDOubleDouble+mShakes+mSmallDrinks+mMediumDrinks+mLargeDrinks+mFrenchFries;
    }
    public double calculateSubtotal(){
        return mCheeseburger*PRICE_CHEESEBURGER + mDOubleDouble*PRICE_DOUBLE_DOUBLE +
                mFrenchFries*PRICE_FRENSH_FRIES + mLargeDrinks*PRICE_LARGE_DRINK +
                mMediumDrinks*PRICE_MEDIUM_DRINK + mSmallDrinks*PRICE_SMALL_DRINK+
                mShakes*PRICE_SHAKE;
    }

    public  double calculateTax(){
        return calculateSubtotal()*PRICE_TAX_RATE;
    }

    public double calculateTotal(){
        return calculateSubtotal()+calculateTax();
    }



}
