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
 * Clase donde se realizara la conexion con MongoDB para el funcionamiento del
 * codigo en general.
 *
 * @author rober
 */
public class ConexionMongo {

    private static MongoDatabase database;

    /**
     * Constructor Vacio.
     */
    private ConexionMongo() {
    }

    /**
     * Metodo donde se realizara la conexion con MongoDB.
     *
     * @return La conexion con la BD establecida en el metodo.
     */
    public static MongoDatabase conectar() {
        if (database == null) {
            ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connectionString)
                    .codecRegistry(CodecRegistries.fromRegistries(
                            MongoClientSettings.getDefaultCodecRegistry(),
                            CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
                    )).build();

            MongoClient cliente = MongoClients.create(settings);
            database = cliente.getDatabase("Juatsapp");
        } else {
            System.out.println("No se conecto");
        }

        return database;
    }
}
