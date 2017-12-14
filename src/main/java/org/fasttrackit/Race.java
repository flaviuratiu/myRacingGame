package org.fasttrackit;

public class Race {

    private Track track;
    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public void start() {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        firstCompetitor = createCompetitor(engine, "Volvo", "red", 40, 8.5, 4);

        System.out.println(firstCompetitor.toString());

        Engine secondEngine = new Engine();
        secondEngine.setManufacturer("Toyota");

        secondCompetitor = createCompetitor(secondEngine, "Toyota", "black", 40, 10.5, 4);

        System.out.println(secondCompetitor.toString());
    }

    // parameters contain car prefix just to demo they can have any name
    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount) {
        Car competitor = new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuelLevel(carFuelLevel);
        competitor.setMileage(carMileage);
        competitor.setDoorCount(carDoorCount);

        return competitor;
    }


    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Vehicle firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Vehicle secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
