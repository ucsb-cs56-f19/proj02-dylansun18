package earthquakes.searches;

public class EqSearch{
    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    public String location;

    public EqSearch(){}

    public int getDistance(){
        return distance;
    }

    public int getMinmag(){
        return minmag;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public String getLocation(){
        return location;
    }


    public void setDistance(int d){
        distance = d;
    }

    public void setMinmag(int m){
        minmag = m;
    }

    public void setLat(double newLat){
        lat = newLat;
    }

    public void setLon(double newLon){
        lon = newLon;
    }

    public void setLocation(String newLocation){
        location = newLocation;
    }
}