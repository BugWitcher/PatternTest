package DecoratorClasses;

public class Helmet extends EquipmentItemDecorator {


    public Helmet(EquipmentItem nextItem){
        super(nextItem);
    }

    public String getDescription() {
        return super.getDescription() + " Helmet ";
    }

    @Override
    public int getArmor() {
        return super.getArmor()+Constants.HELMET_ARMOR;
    }
/*
    @Override
    public void showEqItem() {
        super.showEqItem();
        System.out.println(" Helmet...");
    }
    */

}
