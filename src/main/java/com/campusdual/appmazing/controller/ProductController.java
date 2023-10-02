package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    //asociado a un DAO. necesitas DTO y mappers.
    @Autowired
    IProductService productService;
    @GetMapping
    public String testController(){

        return "Product controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){

        return "Product controller works!, " + name;
    }
    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){

        return "Product controller method works!";
    }

    @PostMapping(value="/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO productDTO){
        return this.productService.queryProduct(productDTO);
    }

    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts(){
        return this.productService.queryAllProducts();
    }

    @PostMapping(value = "/add")
    public int insertProduct(@RequestBody ProductDTO productDTO){
        return this.productService.insertProduct(productDTO);
    }

    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDTO productDTO){
        return this.productService.updateProduct(productDTO);
    }

    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDTO productDTO){
        return this.productService.deleteProduct(productDTO);
    }

    @PutMapping(value = "/buy")
    public int buyProduct(@RequestBody ProductDTO productDTO){
        int quantity = 5;
        return this.productService.buyProduct(productDTO,quantity);
    }

    @PostMapping(value = "/buyandshowprice")
    public BigDecimal buyProductAndShowPrice(@RequestBody ProductDTO productDTO){
        int quantity = 5;
        this.productService.buyProduct(productDTO, quantity);
        return this.productService.calculatedTotalPrice(productDTO, quantity);
    }







}
