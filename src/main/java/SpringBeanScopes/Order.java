package SpringBeanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Order {

    @Autowired
    private Product product;

    public Order(){

        System.out.println(" Order object is created ");
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
