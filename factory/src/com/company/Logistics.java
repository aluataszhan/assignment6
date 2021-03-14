package com.company;

public abstract class Logistics {
    public void planDelivery() {
        Transport tr = createTransport();
        tr.deliver();
    }

    public abstract Transport createTransport();
}
