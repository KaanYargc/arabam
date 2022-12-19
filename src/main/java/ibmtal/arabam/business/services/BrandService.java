package ibmtal.arabam.business.services;

public interface BrandService {
	Result<Brand> addBrand(Brand brand);
	Result<Brand> updateBrand(BrandUpdatto brandUpdateOto);
}
