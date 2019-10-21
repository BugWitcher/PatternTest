package DecoratorClasses;

public class Trousers extends EquipmentItemDecorator{

   /*
    @Override
    public void showEqItem() {
        super.showEqItem();
        System.out.println(" Trousers...");
    }
    */
   public Trousers(EquipmentItem nextItem){
       super(nextItem);
   }
    @Override
    public String getDescription() {
        return super.getDescription() + " Trousers ";
    }

    @Override
    public int getArmor() {
        return super.getArmor()+Constants.TROUSERS_ARMOR;
    }
}
