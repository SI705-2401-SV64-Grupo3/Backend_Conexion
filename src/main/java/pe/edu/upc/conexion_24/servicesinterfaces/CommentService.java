package pe.edu.upc.conexion_24.servicesinterfaces;

import pe.edu.upc.conexion_24.entities.Comment;

import java.util.List;

public interface CommentService {
    public void insert(Comment comment);

    public List<Comment> list();
}
