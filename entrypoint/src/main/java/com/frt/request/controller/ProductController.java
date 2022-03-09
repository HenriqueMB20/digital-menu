package com.frt.request.controller;

import com.frt.product.contract.ProductRegistrationBorder;
import com.frt.request.ProductRequest;
import com.frt.request.parser.ProductRequestParser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRegistrationBorder productRegistration;
    private final ProductRequestParser productRequestParser;

    public ProductController(ProductRegistrationBorder productRegistration, ProductRequestParser productRequestParser){
        this.productRegistration = productRegistration;
        this.productRequestParser = productRequestParser;
    }

    @GetMapping("/test")
    public String test(){
        return "Ok";
    }

    @PostMapping("/save")
    public void save(@RequestBody ProductRequest request){
        this.productRegistration.save(productRequestParser.toProduct(request));
    }


}
