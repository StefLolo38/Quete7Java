class Hangar {
    public static void main(String[] args) {
        Car nico = new Car("Nico", 10000);
        Boat gus = new Boat("Gus", 200000);

        System.out.println(nico.doStuff());
        System.out.println(gus.doStuff());
    }
}