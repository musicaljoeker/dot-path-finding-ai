class PathFinder {
    public static void main(String[] args) throws InterruptedException{
        int numberOfDots = 500;
        int numberOfDirections = 200;
        int windowWidth = 800;
        int windowHeight = 800;

        Worker w = new Worker(numberOfDots, numberOfDirections, windowWidth, windowHeight);
    }
}