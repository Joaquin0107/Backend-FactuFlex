package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
