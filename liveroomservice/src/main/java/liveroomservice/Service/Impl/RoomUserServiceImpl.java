package liveroomservice.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import liveroomservice.Domain.Room;
import liveroomservice.Domain.RoomUser;
import liveroomservice.Mapper.RoomMapper;
import liveroomservice.Mapper.RoomUserMapper;
import liveroomservice.Service.RoomService;
import liveroomservice.Service.RoomUserService;
import org.springframework.stereotype.Service;

//业务层bean
@Service
public class RoomUserServiceImpl extends ServiceImpl<RoomUserMapper, RoomUser> implements RoomUserService {
}
