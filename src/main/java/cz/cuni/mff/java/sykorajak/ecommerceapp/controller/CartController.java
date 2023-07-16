package cz.cuni.mff.java.sykorajak.ecommerceapp.controller;

import cz.cuni.mff.java.sykorajak.ecommerceapp.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CartController extends BaseController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/cart")
    public String addProduct(@RequestParam("productId") Long productId, @RequestParam("quantity") Integer quantity) {
        cartService.addCartItem(productId, quantity);
        return "redirect:/products";
    }

    @PutMapping("/cart/items/{id}")
    public String updateCartItem(@PathVariable("id") Long itemId, @RequestParam("quantity") int quantity) {
        cartService.updateItemQuantity(itemId, quantity);
        return "redirect:/products";
    }

    @DeleteMapping("/cart/items/{id}")
    public String deleteCartItem(@PathVariable("id") Long itemId) {
        cartService.removeItem(itemId);
        return "redirect:/products";
    }
}
