package cn.edu.buaa.sms.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.edu.buaa.sms.modular.system.dao.RelationMapper;
import cn.edu.buaa.sms.modular.system.model.Relation;
import cn.edu.buaa.sms.modular.system.service.IRelationService;
import org.springframework.stereotype.Service;

/**
 * 角色和菜单关联表 服务实现类
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
