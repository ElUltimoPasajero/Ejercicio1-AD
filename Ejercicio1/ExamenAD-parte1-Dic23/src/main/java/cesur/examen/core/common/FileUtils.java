package cesur.examen.core.common;

import cesur.examen.core.worker.Worker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno:
 * Fecha:
 *
 * No se permite escribir en consola desde las clases DAO, Service y Utils usando System.out.
 * En su lugar, usa log.info(), log.warning() y log.severe() para mostrar información interna
 * o para seguir la traza de ejecución.
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    public static void toCSV(String fileName, List<Worker> workers) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (Worker worker : workers) {
                writer.append(String.valueOf(worker.getId()));
                writer.append(',');
                writer.append(worker.getName());
                writer.append(',');
                writer.append(worker.getDni());
                writer.append(',');
                writer.append(worker.getFrom().toString());  // Asegúrate de que el formato sea adecuado
                writer.append('\n');
            }

            System.out.println("CSV creado exitosamente en: " + fileName);

        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo CSV", e);
        }
    }
}


