package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
	private int maSv;
	private String ten;
	private String diaChi;
	private String mail;
	private String phone;
	private String image;
	private String birthday;
	private int roleId;
	private char isUse;
}
