package restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.SinhVienServices;

@RestController
@RequestMapping("/SinhVien-api")
public class SinhVienAPI {
	@Autowired
	private SinhVienServices SinhVienServ;
	
	@GetMapping("/getAll")
	ResponseEntity<?> doGetAll() throws Exception{
		return ResponseEntity.ok(SinhVienServ.getAllSinhVien());
	}
}
