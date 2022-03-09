package AccesoDatos;

import java.util.ArrayList;
import java.util.UUID;

public abstract class AData {

    protected String PATH;

    protected String id;

    public AData() {

        this.generatePath();
        this.id = UUID.randomUUID().toString();
    }

    protected void generatePath() {
        this.PATH = System.getProperty("user.dir");

        String os = System.getProperty("os.name");

        if (os.equals("Linux") || os.equals("Mac OS X")) {
            this.PATH += "/";
        } else {
            this.PATH += "\\";
        }

        this.PATH += this.getClass().getSimpleName() + ".db";
    }

    public boolean save() {
        try {
            String save = this.toString();
            return UtilidadesArchivos.actualizar(this.PATH, this.id, save);
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean delete() {
        try {

            if (this.id == null || this.id.length() == 0) {
                return false;
            }

            boolean result = UtilidadesArchivos.eliminar(this.PATH, this.id);
            if (result) {
                this.id = "";
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public abstract <E> ArrayList<E> fromDatabse();

    public abstract boolean fromId(String id);

    protected ArrayList<String> getLines() {
        try {
            ArrayList<String> data = null;
            data = UtilidadesArchivos.arregloArchivo(PATH);

            return data;

        } catch (Exception ex) {
            return new ArrayList<String>();
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
