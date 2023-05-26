package ru.netologu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void addMovieTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void withoutAddingTest() {
        MovieManager manager = new MovieManager();



        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingOneMovieTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingFiveMovieTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingSixMovieTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");
        manager.movieAdd("Film 6");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingTenMovieTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");
        manager.movieAdd("Film 6");
        manager.movieAdd("Film 7");
        manager.movieAdd("Film 8");
        manager.movieAdd("Film 9");
        manager.movieAdd("Film 10");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLatestMoviesFromOneTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLatestMoviesWithoutAddingTest() {
        MovieManager manager = new MovieManager();



        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLastFourFilmsTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLatestFilmsOutOfFiveTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLastSixFilmsTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");
        manager.movieAdd("Film 6");


        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputOfTheLatestFilmsOutOfTenTest() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");
        manager.movieAdd("Film 6");
        manager.movieAdd("Film 7");
        manager.movieAdd("Film 8");
        manager.movieAdd("Film 9");
        manager.movieAdd("Film 10");

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
