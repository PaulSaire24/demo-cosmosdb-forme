package com.example.democosmosdb.pattern.state.example;

public interface AuctionState {

    void startAuction(Auction auction);
    void closeAuction(Auction auction);
    void placeBid();

}
