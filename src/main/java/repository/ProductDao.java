package repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.thinkpalm.springdataredis.entity.Product;

/**
 * @author Lijo M Loyid
 *
 */

@Repository
public class ProductDao {
	
	public static final String HASH_KEY = "Product";
	private RedisTemplate template;
	
	public Product save(Product product) {
		template.opsForHash().put(HASH_KEY, product.getId(), product);
		return product;
	}

}
