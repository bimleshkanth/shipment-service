package com.medical.shipment;

public interface ShipmentService {
	void addShipment(Shipment shipment);

    void deleteShipment(String resourceId);

    Shipment getShipment(String resourceId);
}
