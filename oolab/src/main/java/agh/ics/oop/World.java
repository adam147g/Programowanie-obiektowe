package agh.ics.oop;

public class World {
    public static void main(String[] args) {
        MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new GrassField(10);
        Vector2d[] positions = {new Vector2d(3, 4),new Vector2d(4, 6)};
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();
        System.out.println(map);
    }
}
