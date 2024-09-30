public class Package {
    private double weight;
    private Dimension dimensions;
    private String destination;
    private double cost;

    public Package(double weight, Dimension dimensions, String destination, double cost) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.destination = destination;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

public class Dimension {
    private double length;
    private double width;
    private double height;

    public Dimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class PackageDeliverySystem {
    private List<Package> packages;

    public PackageDeliverySystem() {
        packages = new ArrayList<>();
    }

    public void addPackage(Package package) {
        packages.add(package);
    }

    public void deliverPackage(Package package) {
       
        System.out.println("Delivering package to " + package.getDestination());
    }

    public void printPackageInfo(Package package) {
        System.out.println("Package Information:");
        System.out.println("Weight: " + package.getWeight());
        System.out.println("Dimensions: " + package.getDimensions().getLength() + "x" + package.getDimensions().getWidth() + "x" + package.getDimensions().getHeight());
        System.out.println("Destination: " + package.getDestination());
        System.out.println("Cost: " + package.getCost());
    }
}
