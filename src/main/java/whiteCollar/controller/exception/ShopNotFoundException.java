package whiteCollar.controller.exception;

/**
 * Clase de la capa Controller, dentro del paquete Exception
 *
 * Extiende RuntimeException, de tipo unchecked.
 *
 * La exception es lanzada en la ejecucion de ciertos metodos, en los casos en los que
 * la peticion de recuperar un objeto de tipo Shop pueda no devolver ningun resultado
 */
public class ShopNotFoundException extends RuntimeException {

    public ShopNotFoundException(Long id) {
        super("Could not find a Shop whit ID " + id);
    }
}
