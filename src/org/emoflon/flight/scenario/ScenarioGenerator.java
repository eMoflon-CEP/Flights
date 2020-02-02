package org.emoflon.flight.scenario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.emoflon.flight.model.util.LongDateHelper;

import Flights.Flight;
import Flights.FlightContainer;

public class ScenarioGenerator {
	/**
	 * seed for random events
	 */
	private long eventSeed = 42;
	private double eventFactor = 1.0;
	private long flightSeed = 42;
	private long chaosSeed = 42;
	private double chaosFactor = 0.01;
	private long timeFrame = LongDateHelper.DAYINMS*2;
	private Random ranChaos;
	private Random ranEvent;
	private Random ranFlight;
	private enum Events {
		BackWind05HEarly,
		MisssingClearens05H,
		MisssingClearens1H,
		BadWeather1H,
		MechanicalIssues1H,
		WaitingForCrew1H,
		BadWeather2H,
		MechanicalIssues2H,
		BirdStrike2H,
		WaitingForCrew2H,
		MechanicalIssues4H,
		BadWeather4H,
//		MechanicalIssuesCanceled,
//		LackOfCrewCanceled
	}
	
	public ScenarioGenerator() {
		ranChaos= new Random(chaosSeed);
		ranEvent= new Random(eventSeed);
		ranFlight= new Random(flightSeed);
	}
	
	public ScenarioGenerator(long eventSeed, long flightSeed, long chaosSeed, double chaosFactor) {
		this.eventSeed = eventSeed;
		this.flightSeed = flightSeed;
		this.chaosSeed = chaosSeed;
		this.chaosFactor = chaosFactor;
		ranEvent = new Random(eventSeed);
		ranFlight= new Random(flightSeed);
		ranChaos= new Random(chaosSeed);
	}
	
	public void runScenario(List<Flight> flights) {
		int chaos = ranChaos.nextInt((int)(flights.size()*chaosFactor));
		
		for(int i = 0; i < chaos; i++) {
			// TODO handle canceled Flights
			Events event = Events.values()[ranEvent.nextInt((int)(Events.values().length*eventFactor))];
			int flightNum = ranFlight.nextInt(flights.size());
			Flight flight = flights.get(flightNum);
			
			runEvent(event, flight);
		}	
	}
	
	public void runScenario(FlightContainer flights, long currentTime) {
		List<Flight> filteredFlights = filterFlights(flights, currentTime);
		runScenario(filteredFlights);
	}
	
	private List<Flight> filterFlights(FlightContainer flights, long currentTime) {
		List<Flight> filteredFlights = new ArrayList<Flight>();
		for(Flight flight: flights.getFlights()) {
			if(currentTime <= flight.getArrival() && flight.getArrival() <= (currentTime + timeFrame))
				filteredFlights.add(flight);
		}
		return filteredFlights;
	}
	
	private void runEvent(Events event, Flight flight) {
		long arrival = flight.getArrival();
		
		switch (event) {
		case BackWind05HEarly:
			flight.setArrival(arrival-LongDateHelper.HOURINMS/2);
			break;
		case MisssingClearens05H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS/2);
			break;
		case MisssingClearens1H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS);
			break;
		case BadWeather1H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS);
			break;
		case MechanicalIssues1H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS);
			break;
		case WaitingForCrew1H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS);
			break;
		case BadWeather2H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*2);
			break;
		case MechanicalIssues2H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*2);
			break;
		case BirdStrike2H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*2);
			break;
		case WaitingForCrew2H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*2);
			break;
		case MechanicalIssues4H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*4);
			break;
		case BadWeather4H:
			flight.setArrival(arrival+LongDateHelper.HOURINMS*4);
			break;
		// TODO handle canceled Flights

		default:
			break;
		}
	}
	
}
