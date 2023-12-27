package liveroomservice.Domain;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
//直播间实体类
@TableName("room_user")
public class RoomUser {

    @TableId("room_user_id")
    Long RoomUserId;

    Long roomId;

    Long UserId;

}
