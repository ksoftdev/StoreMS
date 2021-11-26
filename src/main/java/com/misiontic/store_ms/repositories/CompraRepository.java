package com.misiontic.store_ms.repositories;

import com.misiontic.store_ms.models.Compra;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompraRepository extends MongoRepository <Compra, String> { }

