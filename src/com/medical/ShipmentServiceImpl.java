package com.medical;

public class ShipmentServiceImpl implements ShipmentService {
	public void addShipment(Shipment shipment) {
        System.out.println("Shipment added");
    }

    public void deleteShipment(String resourceId) {
        System.out.println("Shipment deleted");
    }

    public Shipment getShipment(String resourceId) {
        return null;
    }
}
