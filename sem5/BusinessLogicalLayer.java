package sem5;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);
    void renderAllModels();

    void deleteModel(int modelNo);
    void deleteTexture(int textureNo);

}
