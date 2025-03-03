package programacionOrientadaaObjetos.ClaseString;

import java.util.Objects;

public class Estudiante /**extends Object*/
{
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
