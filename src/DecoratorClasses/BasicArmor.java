package DecoratorClasses;

public class BasicArmor implements EquipmentItem{

    private int armour;

    public BasicArmor() {
        this.armour=Constants.BASIC_ARMOR;
    }

    public BasicArmor(int armor) {
       super();
       setArmor(armor);
    }

    @Override
    public void setArmor(int armor) {
        this.armour=armor;
    }

    @Override
    public int getArmor() {
        return armour;
    }

    @Override
    public String getDescription(){
        return " Basic Armor ";
    }

}
