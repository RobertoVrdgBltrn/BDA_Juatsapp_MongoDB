/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Clase encargada de establecer la conexión con la base de datos MongoDB.
 * @author Roberto Verdugo y Angel Servin
 */
public class ConexionMongo {

    private static MongoDatabase database;

    /**
     * Contructor
     */
    private ConexionMongo() {
    }

    /**
     * Establece y devuelve la conexión a MongoDB.
     *
     * @return Objeto MongoDatabase conectado a "Juatsapp".
     */
    public static MongoDatabase conectar() {
        if (database == null) {
            ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connectionString)
                    .codecRegistry(CodecRegistries.fromRegistries(
                            MongoClientSettings.getDefaultCodecRegistry(),
                            CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
                    ))
                    .build();

            MongoClient cliente = MongoClients.create(settings);
            database = cliente.getDatabase("Juatsapp");
        }
        return database;
    }
}
