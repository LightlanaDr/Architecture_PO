package sem5;

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();

    void renderAll();
    void renderModel(int i);
    void deleteModel(int i);
    void deleteTexture(int i);

}
