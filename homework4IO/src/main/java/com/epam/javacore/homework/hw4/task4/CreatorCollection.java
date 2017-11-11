package com.epam.javacore.homework.hw4.task4;

import java.util.Arrays;

public class CreatorCollection {

    private CollectionsOfFilms collectionsOfFilms = new CollectionsOfFilms();
    CreatorCollection(boolean isMainCollection) {
        if (isMainCollection) {
            Film forrestGump = new Film("Forrest Gump", Arrays.asList(CreatorActors.tomHanks));
            Film theShawshankRedemption = new Film("The Shawshank Redemption",
                    Arrays.asList(CreatorActors.morganFreeman, CreatorActors.timothyRobbins));
            Film film112263 = new Film("11.22.63", Arrays.asList(CreatorActors.sarahGadon));
            collectionsOfFilms.addFilm(film112263);
            collectionsOfFilms.addFilm(forrestGump);
            collectionsOfFilms.addFilm(theShawshankRedemption);
        }
    }

    CollectionsOfFilms createCollection() {
        return collectionsOfFilms;
    }
}
