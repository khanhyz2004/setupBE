package mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import model.SinhVien;

@Mapper
public interface SinhVienMapper {
	List<SinhVien> getAll()throws SQLException;
}
