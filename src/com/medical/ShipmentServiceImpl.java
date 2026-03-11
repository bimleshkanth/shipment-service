import java.util.HashMap;
import java.util.Map;

package com.medical;

public class ShipmentServiceImpl implements ShipmentService {
	
	private Map<String, Shipment> shipmentDB = new HashMap<>();
	
	@Override
	public void addShipment(Shipment shipment) {
        System.out.println("Shipment added");
    }
	
	@Override
    public void deleteShipment(String resourceId) {
        System.out.println("Shipment deleted");
    }
	
	@Override
    public Shipment getShipment(String resourceId) {
        return null;
    }
}
