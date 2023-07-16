package cz.cuni.mff.java.sykorajak.ecommerceapp.controller;

import cz.cuni.mff.java.sykorajak.ecommerceapp.model.Product;
import cz.cuni.mff.java.sykorajak.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String showProducts(@RequestParam(value = "category", required = false) String category, Model model) {
        List<Product> products;
        if (category != null && !category.isEmpty()) {
            // Retrieve products by category
            products = productService.getProductsByCategory(category);
        } else {
            // Retrieve all products
            products = productService.getAllProducts();
        }
        model.addAttribute("product", new Product());
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        productService.addProduct(product);
        return "products";
    }
}
