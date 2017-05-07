package net.rkasigi.iak.animalium;



public class AnimalModel {

    private String nameId;
    private String nameEn;
    private int imageId;

    public AnimalModel(String nameId, String nameEn, int imageId) {
        this.nameId = nameId;
        this.nameEn = nameEn;
        this.imageId = imageId;
    }

    public String getNameId() {
        return nameId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getImageId() {
        return imageId;
    }
}
