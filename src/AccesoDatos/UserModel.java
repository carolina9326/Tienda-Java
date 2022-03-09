package AccesoDatos;

import java.util.ArrayList;

public class UserModel extends AData {

    private int role;
    private String name;
    private String user;
    private String password;

    public UserModel() {
    }

    public UserModel(int role, String name, String user, String password) {
        super();
        this.role = role;
        this.name = name;
        this.user = user;
        this.password = password;
    }

    public UserModel(String id, int role, String name, String user, String password) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.user = user;
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return this.id + ";" + String.valueOf(this.role) + ";" + this.name + ";" + this.user + ";" + this.password;
    }

    @Override
    public <E> ArrayList<E> fromDatabse() {
        ArrayList<String> lines = this.getLines();
        ArrayList<E> data = (ArrayList<E>) new ArrayList<UserModel>();

        for (String line : lines) {
            String[] split = line.split(";");
            String id = split[0];
            int role = Integer.parseInt(split[1]);
            String name = split[2];
            String user = split[3];
            String password = split[4];

            UserModel u = new UserModel(id, role, name, user, password);
            data.add((E) u);
        }

        return data;
    }

    @Override
    public boolean fromId(String id) {
        ArrayList<UserModel> users = this.fromDatabse();

        for (UserModel u : users) {
            if (u.getId().equals(id)) {
                this.id = u.getId();
                this.role = u.getRole();
                this.name = u.getName();
                this.user = u.getUser();
                this.password = u.getPassword();
                return true;
            }

        }

        return false;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
