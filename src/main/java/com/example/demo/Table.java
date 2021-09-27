package com.example.demo;

public class Table {
    private TableState tableState;

    public void freeTable(){
        tableState = TableState.free;
    }

    public void waitingTable(){
        tableState = TableState.waiting_to_make_order;
    }

    public void makeOrderTable(){
        tableState = TableState.make_order;
    }

    public void waitingOrderTable(){
        tableState = TableState.waiting_order;
    }
}
