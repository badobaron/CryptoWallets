package guru.springframework.repositories;

import guru.springframework.domain.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet, String> {
}
