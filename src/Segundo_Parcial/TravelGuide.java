package Segundo_Parcial;

import java.util.*;

public class TravelGuide {
    private Map<String,Map<String,Set<Landmark>>> countries = new TreeMap<>();

    public void addLandmark(String country, String city,Landmark landmark){
        countries.putIfAbsent(country,new TreeMap<>());
        countries.get(country).putIfAbsent(city,new TreeSet<>());
        countries.get(country).get(city).add(landmark);
    }

    private boolean check(String country,String city){
        return check(country) && countries.get(country).containsKey(city);
    }

    private boolean check(String country){

        return countries.containsKey(country);
    }

    public int landmarksCount(String country,String city){
        if(!check(country,city)){
            return 0;
        }
        return countries.get(country).get(city).size();
    }

    public int landmarksCount(String country){
        if(!check(country)){
            return 0;
        }
        int total = 0;
        for(String city: countries.get(country).keySet()){
            total += landmarksCount(country,city);
        }
        return total;
    }

    public Set<Landmark> getLandmarksFromCity(String country,String city){
        if(!check(country,city)){
            return new TreeSet<>();
        }
        return countries.get(country).get(city);
    }

    public Collection<Landmark> getLandmarksFromCountry(String country){
        List<Landmark> ans = new ArrayList<>();
        if(!check(country)){
            return ans;
        }
        for(String city:countries.get(country).keySet()){
            ans.addAll(getLandmarksFromCity(country,city));
        }
        return ans;
    }

    public void moveLandmark(String country,String origin,String dest,Landmark landmark){
        if(!check(country)){
            throw new TravelGuideException("Country does not exists");
        }
        if(!check(country,origin)){
            throw new TravelGuideException("Origin city does not exists in country");
        }
        if(!countries.get(country).get(origin).remove(landmark)){
            throw new TravelGuideException("Landmark does not exists in origin city");
        }
        addLandmark(country,dest,landmark);
    }


}
