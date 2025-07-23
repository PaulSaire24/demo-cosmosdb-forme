package com.example.democosmosdb.pattern.proxy;

public class App {

    private final static MediaPlayProxy mediaPlayProxy = new MediaPlayProxy();

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        mediaPlayProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        mediaPlayProxy.playMedia();
    }

}