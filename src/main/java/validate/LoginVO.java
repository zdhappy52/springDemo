package validate;

import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class LoginVO {
    @NotNull
    @IsMobile
    private String mobile;

    @NotEmpty(message = "邮箱不能为空")
    @Size(max = 50, message = "邮箱长度最多50个字符")
    @NotNull
    private String password;


}

