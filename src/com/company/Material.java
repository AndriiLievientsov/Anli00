package com.company;

public enum Material {
    PLASTIC("Plastic"),
    METAL("Metal"),
    WOOD("Wood"),
    GLASS("Glass"),
    FOG ("Fog");

    private String  material;

    Material(String materials) {
        this.material = materials;
    }

    public  String getMaterials () {
        return  material;
    }

    public static Material getNameMaterial (int i) {
        switch (i) {
            case 1: return Material.PLASTIC;
            case 2: return Material.METAL;
            case 3: return Material.WOOD;
            case 4: return Material.GLASS;
        }
            return Material.FOG;
    }

}
