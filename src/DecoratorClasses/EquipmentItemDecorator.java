package DecoratorClasses;



public class EquipmentItemDecorator implements EquipmentItem{
        private EquipmentItem Item;
        public EquipmentItemDecorator(EquipmentItem nextItem) {
            this.Item = nextItem;
        }


        @Override
        public int getArmor(){
            return Item.getArmor();
        }

        @Override
        public void setArmor(int armor) {
            Item.setArmor(armor);
        }


        public String getDescription() {
            return Item.getDescription();
        }
    }
