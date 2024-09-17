package com.repuestos.proyecto.repuestos.producto;

import com.repuestos.proyecto.repuestos.Producto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/p" +
        "roducto")
public class ProductoController {
    @GetMapping

    public List<Producto> getProducto(){
        return List.of(
                new Producto(
                        5050,
                        "Llanta",
                        500000,
                        5

                ));
    }
}
