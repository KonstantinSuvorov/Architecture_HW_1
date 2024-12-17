package ModelElements;

/**
 * модель полигона
 */

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    /**
     * конструктор
     *
     * @param imputPoligon
     */
    public PoligonalModel(Poligon inputPoligon) {
        poligons = inputPoligon;
        textures = new Texture();
    }

}
