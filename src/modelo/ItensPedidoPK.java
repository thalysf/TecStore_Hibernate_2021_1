package modelo;

import java.io.Serializable;
import javax.persistence.*;

public class ItensPedidoPK implements Serializable {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_produto")
    private Produto produto;
}
