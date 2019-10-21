package DecoratorClasses;

public enum ArmourEnum {

   TEMERIAN (" Temerian " , Constants.MEDIUM_ARMOUR),
   NILFGARD (" Nilfgard " , Constants.HEAVY_ARMOUR),
   KAEDWANIAN (" Temerian " , Constants.LIGHT_ARMOUR);

    private String Name;
    private int Armour ;

   ArmourEnum(final String name,final int armour ) {
      this.Name=name;
      this.Armour=armour;
   }

   public int getArmour() {
     return Armour;
   }

    public String getDescription() {
        return Name;
    }

    public static boolean contains(String name) {
        for (ArmourEnum c : ArmourEnum.values()) {
            if (c.name().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
