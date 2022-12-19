package ibmtal.arabam.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import ibmtal.arabam.database.BrandDao;
import ibmtal.arabam.entity.Brand;



public class BrandManager implements BrandService {
	private BrandDao brandDao;
	@Service
	public class BrandManager implements BrandService {
		private brandDao brandDao;
		@Autowired
		public  CategoryManager(BrandDao brandDao) {
			
			this.brandDao = brandDao;
		}
		@Override
		public Result addBrand(Brand brand) {
			Result result=new Result();
			if(brand.getName().isEmpty()) {
				result.newError("name","Boş geçilenmez");
				
			}
			if(brand.getName().length()>30) {
				result.newError("name","30 karakterden uzun olamaz");
			}
			if(result.isSuccess()) {
				this.brandDao.save(brand);
				result.getData().add(brand);
			}
			return null;
		}
		
	}
	@Override
	public Result addBrand(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}
}
