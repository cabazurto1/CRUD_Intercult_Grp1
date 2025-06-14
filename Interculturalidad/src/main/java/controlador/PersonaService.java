package controlador;

import modelo.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/personas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class PersonaService {

    @PersistenceContext(unitName = "miUnidadPersistencia")
    private EntityManager em;

    @GET
    public List<Persona> listar() {
        return em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
    }

    @GET
    @Path("/{id}")
    public Persona obtener(@PathParam("id") int id) {
        return em.find(Persona.class, id);
    }

    @POST
    public void crear(Persona persona) {
        em.persist(persona);
    }

    @PUT
    @Path("/{id}")
    public void actualizar(@PathParam("id") int id, Persona persona) {
        persona.setId(id);
        em.merge(persona);
    }

    @DELETE
    @Path("/{id}")
    public void eliminar(@PathParam("id") int id) {
        Persona persona = em.find(Persona.class, id);
        if (persona != null) {
            em.remove(persona);
        }
    }
}
