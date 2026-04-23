/**
 * Class that defines the traits of a chair
 * @author Leon Chiang
 * @version 1.0.0
 */

class Chair {
    private int legs;
    private String material;


    /**
     * Create a chair of wood material and 4 legs
     */

    public Chair() {
        this.legs=4;
        this.material="wood";
    }

    /**
     * Create a chair of wood material and 4 legs
     * @param legs # of legs the chair has
     */

    public Chair(int legs) {
        this.legs=legs;
        this.material="wood";
    }

     /**
     * Create a chair of wood material and 4 legs
     * @param legs # of legs the chair has
     * @param material Material of the chair
     */

    public Chair(int legs, String material) {
        this.legs=legs;
        this.material=material;
    }

    /**
     * Get # of legs of the chair
     * @param legs Legs of the chair
     */

    public int getLegs(){
        return this.legs;
    }

    /**
     * Get material of the chair
     * @param material Material of the chair
     */

    public String getMaterial(){
        return this.material;
    }
}
