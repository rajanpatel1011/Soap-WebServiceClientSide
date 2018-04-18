package pack;

import java.util.List;

import com.org.ImplProductService;
import com.org.Product;

public class TestServiceConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplProductService em = new ImplProductService();
		Product p = em.getImplProductPort();
		List<String> list = p.getProducts();
		for(String items:list)
			System.out.println(items);
	}

}
