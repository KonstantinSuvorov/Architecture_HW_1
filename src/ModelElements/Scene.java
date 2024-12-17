package ModelElements;

import java.util.ArrayList;

/**
 * класс модель сцены
 */
public class Scene<Type1, Type2> {
    public int Id;
    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<Camera>();

    /**
     * конструктор
     *
     * @param inputModels
     * @param inputCameras
     */
    public Scene(PoligonalModel inputModels, Camera inputCameras) {
        models.add(inputModels);
        cameras.add(inputCameras);
    }

    /**
     * заглушка
     */
    public Type1 methode1(Type1 t) {
        return t;
    }

    /**
     * заглушка
     */
    public Type1 methode1(Type1 t1, Type2 t2) {
        return t1;
    }
