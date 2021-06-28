package pl.yuro.crudandloginexercisepage.dto;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	

	private String username;
	

	@Length(min = 8, message="Hasło musi posiadać ponad 8 znaków!")
	private String password;
	

	private String rpassword;


	private String email;
	
	public boolean comparePassAndRPass(String password, String rpassword) {
		this.password = password;
		this.rpassword = rpassword;
		if(password.equals(rpassword)) {
			System.out.println("Kontrolnie es");
			return true;
		}
		return false;
	}
	
	
}
