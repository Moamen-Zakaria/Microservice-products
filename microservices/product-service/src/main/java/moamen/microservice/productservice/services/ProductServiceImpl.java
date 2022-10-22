package moamen.microservice.productservice.services;

import moamen.microservice.core.product.Product;
import moamen.microservice.core.product.ProductService;
import moamen.microservice.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements ProductService {

    private final ServiceUtil serviceUtil;

    @Autowired
    public ProductServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Product getProduct(int productId) {
        return new Product(productId, "name-" + productId, 123,
                serviceUtil.getServiceAddress());
    }
}
