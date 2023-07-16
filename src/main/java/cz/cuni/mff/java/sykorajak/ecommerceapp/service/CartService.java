package cz.cuni.mff.java.sykorajak.ecommerceapp.service;

import cz.cuni.mff.java.sykorajak.ecommerceapp.model.Cart;
import cz.cuni.mff.java.sykorajak.ecommerceapp.model.Product;
import cz.cuni.mff.java.sykorajak.ecommerceapp.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class CartService {

    private final Cart cart;

    private final ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.cart = new Cart();
        this.productRepository = productRepository;
    }

    public Cart getCart() {
        return cart;
    }

    public void addCartItem(Long productId, Integer quantity) {
        Product newProduct = productRepository.findById(productId).get();
        cart.addCartItem(newProduct, quantity);
    }

    public void removeItem(Long productId) {
        Product product = productRepository.findById(productId).get();
        cart.removeItem(product);
    }

    public void updateItemQuantity(Long itemId, int quantity) {
        Product product = productRepository.findById(itemId).get();
        cart.updateItemQuantity(product, quantity);
    }
}
