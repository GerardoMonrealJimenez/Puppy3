package mx.com.rteck.puppy.pojo;

/**
 * Created by Gerardo Monreal J on 22/08/2016.
 * Modelo de los perros
 */

public class Perro {
    private String nombre;
    private int likes;
    private int foto;

    public Perro(String nombre, int likes, int foto) {
        this.nombre = nombre;
        this.likes = likes;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public String likes()
    {
        ;
        return Integer.toString(this.likes);
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
