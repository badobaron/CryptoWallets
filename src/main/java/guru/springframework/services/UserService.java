package guru.springframework.services;

import guru.springframework.domain.User;
import java.util.List;

public interface UserService {

    List<User> listAll();

    User getById(String id);

    User saveOrUpdate(User product);

    void delete(String id);

    //User saveOrUpdateProductForm(ProductForm productForm);
}
