package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.exceptions.ObjectNotFoundException;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repo;

    public Pedido buscar(Integer id){

        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                String.format("Objeto não encontrado para o id %s do tipo %s", id, Pedido.class.getName())));

    }
}
