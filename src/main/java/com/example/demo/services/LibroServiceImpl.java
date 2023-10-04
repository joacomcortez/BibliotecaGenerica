package com.example.demo.services;

import com.example.demo.entities.Libro;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LibroRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
