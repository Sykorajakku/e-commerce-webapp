package cz.cuni.mff.java.sykorajak.ecommerceapp.model;

import java.util.HashMap;
import java.util.Map;


public class Cart {

    private final Map<Product, Integer> cartItemToQuantity;

    public Cart() {
        this.cartItemToQuantity = new HashMap<>();
    }

    public Map<Product, Integer> getCartItemToQuantity() {
        return cartItemToQuantity;
    }

    public void addCartItem(Product product, Integer quantity) {
        if (cartItemToQuantity.containsKey(product)) {
            int currentQuantity = cartItemToQuantity.get(product);
            cartItemToQuantity.replace(product, quantity + currentQuantity);
        }
        else {
            cartItemToQuantity.put(product, quantity);
        }
    }

    public void updateItemQuantity(Product product, int quantity) {
        if (cartItemToQuantity.containsKey(product)) {
            cartItemToQuantity.replace(product, quantity);
        }
    }

    public void removeItem(Product product) {
        cartItemToQuantity.remove(product);
    }
}
