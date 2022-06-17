package Segundo_Parcial;

import java.util.*;

public class FreeMarket{
    private Map<ProductCategory,Map<String,Product>>  catalog = new HashMap<>();
    private Map<String,User> users = new HashMap<>();

    public void addProduct(String name,double price,ProductCategory categ){
        catalog.putIfAbsent(categ,new TreeMap<>());
        catalog.get(categ).put(name,new Product(name,categ,price));
    }

    public Iterable<String> getProductsByCategory(ProductCategory categ){
        return catalog.getOrDefault(categ,new TreeMap<>()).keySet();
    }

    public void buyProduct(String user,ProductCategory categ,String product){
        if(!catalog.getOrDefault(categ,new TreeMap<>()).containsKey(product)){
            throw new IllegalArgumentException("El producto no existe");
        }
        users.putIfAbsent(user,new User(user));
        double points = catalog.get(categ).get(product).getPoints();
        users.get(user).addPoints(points);
    }

    public void printUserPoints(String user){
        if(!users.containsKey(user)){
            throw new IllegalArgumentException("El usuario: "+ user +" no existe");
        }
        System.out.println(users.get(user));
    }
}
