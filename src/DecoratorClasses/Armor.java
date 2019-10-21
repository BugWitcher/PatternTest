package DecoratorClasses;


public class Armor extends EquipmentItemDecorator {

    private String armourName;

    public Armor(EquipmentItem nextItem){
        super(nextItem);
        armourName =" base armor";
    }

    public Armor(EquipmentItem nextItem, String name){
        super(nextItem);

        if (ArmourEnum.contains(name)) {
            nextItem.setArmor(ArmourEnum.valueOf(name).getArmour());
            armourName=ArmourEnum.valueOf(name).getDescription();
        }
        else {
            nextItem.setArmor(Constants.BASIC_ARMOR);
            armourName = " base armour" ;
        }

    }

    /*
        @Override
        public void showEqItem() {
            super.showEqItem();
            System.out.println(" Armor...");
        }
    */
    public String getDescription() {
        return super.getDescription() + armourName;
    }

    @Override
    public int getArmor() {
        return super.getArmor()+ Constants.ARMOR_ARMOR;
    }
}
