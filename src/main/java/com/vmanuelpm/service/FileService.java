package com.vmanuelpm.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface FileService {

    public void init();

    /*
    Metodo para guardar
     */
    public void save(MultipartFile file);

    /*
    Metodo para cargar un archivo
     */
    public Resource load(String filename);

    /*
    Metodo para borrar todos los archivos
     */
    public void deleteAll();

    /*
    Metodo para Cargar todos los archivos
     */
    public Stream<Path> loadAll();

    /*
    Metodo para Borrar un archivo
     */
    public String deleteFile(String filename) throws IOException;
}
