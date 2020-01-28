package org.emoflon.flight.model.generator;

import Flights.FlightModel;
import Flights.FlightsFactory;

public class SimpleModelGenerator extends ModelGenerator{
	
	/**
	 * instance of FlightsFactory
	 */
	private FlightsFactory factory = FlightsFactory.eINSTANCE;
	
	/**
	 * @return a simple flight model containing, airports, routes, planes, flights, persons, and bookings,
	 *  parsed from the 'simple.*' files found in '/Flights/src/org/emoflon/flight/model/definitions'
	 */
	public FlightModel generateSimpleModel() {
		FlightModel model = factory.createFlightModel();
		model.setAirports(parseAirportsWithGates("simple.airports"));
		model.setRoutes(parseRoutes("simple.routes", model.getAirports()));
		model.setPlanes(parsePlanes("simple.planes"));
		model.setFlights(parseFlightContainer("simple.flights", model.getAirports(), model.getRoutes(), model.getPlanes()));
		model.setPersons(parsePersons("simple.persons"));
		model.setBookings(parseBookings("simple.bookings", model.getPersons(), model.getFlights()));
		
		return model;
	}
}
