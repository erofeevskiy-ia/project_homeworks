package com.epam.javacore.homework.hw4.task4;

import java.io.*;
import java.util.Arrays;

public class ActionWithCollection {
    public static void main(String[] args) {
        CollectionsOfFilms mainCollection = new CreatorCollection(true).createCollection();
        String pathOfFileForMainCollection = "homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task4\\collection.out";
        serializationOfCollection(mainCollection,pathOfFileForMainCollection);
        CollectionsOfFilms collectionsOfFilmsFromFile = deserialisation(pathOfFileForMainCollection);
        collectionsOfFilmsFromFile.addFilm(new Film("Spider Man", Arrays.asList(CreatorActors.jamesEdwardFranco)));
        String pathOfFileForChangedCollection = "homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task4\\collectionChanged.out";
        serializationOfCollection(collectionsOfFilmsFromFile,pathOfFileForChangedCollection);
    }

    private static CollectionsOfFilms deserialisation(String pathOfFileOject) {
        CollectionsOfFilms collectionsOfFilms=null;
        try (FileInputStream fis = new FileInputStream(pathOfFileOject);
             ObjectInputStream oin = new ObjectInputStream(fis);) {
            collectionsOfFilms = (CollectionsOfFilms) oin.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return collectionsOfFilms;
    }

    private static void serializationOfCollection(CollectionsOfFilms mainCollection, String pathForSerialisation) {
        try (FileOutputStream fos = new FileOutputStream(pathForSerialisation);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(mainCollection);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
