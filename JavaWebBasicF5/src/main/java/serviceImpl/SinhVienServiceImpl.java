package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.SinhVienMapper;
import model.SinhVien;
import services.SinhVienServices;

@Service
public class SinhVienServiceImpl implements SinhVienServices {
	@Autowired
	private SinhVienMapper mapper;
	
	@Override
	public List<SinhVien> getAllSinhVien() throws Exception{
		List<SinhVien> result = mapper.getAll();
		return result;
	}
}
