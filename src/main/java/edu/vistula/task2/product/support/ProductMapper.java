package edu.vistula.task2.product.support;

import org.springframework.stereotype.Component;
import edu.vistula.task2.product.api.request.ProductRequest;
import edu.vistula.task2.product.api.response.ProductResponse;
import edu.vistula.task2.product.domain.Product;
import edu.vistula.task2.product.api.request.UpdateProductRequest;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}
