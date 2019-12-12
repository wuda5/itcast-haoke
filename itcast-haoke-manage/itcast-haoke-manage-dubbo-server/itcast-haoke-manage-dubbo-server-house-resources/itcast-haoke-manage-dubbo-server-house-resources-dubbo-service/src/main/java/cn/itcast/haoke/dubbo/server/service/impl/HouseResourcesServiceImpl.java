package cn.itcast.haoke.dubbo.server.service.impl;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import cn.itcast.haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional // 添加事务
@Service // 这是 spring的注解，不要和api下的对外的dubbu注解混淆
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HouseResourcesService {

    /**
     * @param houseResources
     *
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    @Override
    public int saveHouseResources(HouseResources houseResources) {

        // 添加校验或者是其他的一些逻辑

        if(StringUtils.isBlank(houseResources.getTitle())){
            // 不符合要求
            return -1;
        }
        System.out.println("+++++++++++++++++++ dao 操作 新增房源：【"+houseResources);
        return super.save(houseResources);
    }
}
