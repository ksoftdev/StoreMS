package com.misiontic.store_ms.controllers;

import com.misiontic.store_ms.exceptions.CompraNotFoundException;
import com.misiontic.store_ms.models.Compra;
import com.misiontic.store_ms.repositories.CompraRepository;

import  org.springframework.web.bind.annotation.*;

@RestController
public class CompraController {

    private final CompraRepository compraRepository;

    public CompraController(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @GetMapping("/compras/{id}")
    Compra getCompra(@PathVariable String id){
        return compraRepository.findById(id)
                .orElseThrow(() -> new CompraNotFoundException("No se encontro una compra con el username: " + id));
    }

    @PostMapping("/compras")
    Compra newCompra(@RequestBody Compra compra){
        return compraRepository.save(compra);
    }
}