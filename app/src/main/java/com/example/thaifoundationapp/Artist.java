package com.example.thaifoundationapp;

public class Artist {
    private String artistId;
    private String artistName;
    private String artistGenre;

    public Artist(){

    }

    Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}
