package ibmtal.arabam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import ibmtal.arabam.business.manager.BrandService;
import ibmtal.arabam.entity.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
	private BrandService brandService;
	@Autowired


	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	@PostMapping("/addBrand")
	@GetMapping
	public Result addBrandApi(@RequestBody Brand brand){
		return this.brandService.addBrand(brand);
	}
}
