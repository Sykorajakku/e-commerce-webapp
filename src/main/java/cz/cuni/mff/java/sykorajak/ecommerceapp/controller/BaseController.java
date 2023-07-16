package cz.cuni.mff.java.sykorajak.ecommerceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseController {
    @ModelAttribute("cartItemCount")
    public int getCartItemCount() {
        return 0;
    }
}
