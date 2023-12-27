package UserService.Domain;

import lombok.Data;

@Data
//推拉流地址返回结果
public class UserIdResult {
    Long userId;//推流地址
    String token;//密钥
}
