package cn.itcast.haoke.dubbo.server.mapper;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
// mabatisPlus--会由config包下定义的MybatisConfig--@MapperScan("cn.itcast.haoke.dubbo.server.mapper")
// 来扫描
public interface HouseResourcesMapper extends BaseMapper<HouseResources> {

}
