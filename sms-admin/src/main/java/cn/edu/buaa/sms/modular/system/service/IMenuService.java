package cn.edu.buaa.sms.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import cn.edu.buaa.sms.core.node.MenuNode;
import cn.edu.buaa.sms.core.node.ZTreeNode;
import cn.edu.buaa.sms.modular.system.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 菜单服务
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 删除菜单
     */
    void delMenu(Long menuId);

    /**
     * 删除菜单包含所有子菜单
     */
    void delMenuContainSubMenus(Long menuId);

    /**
     * 根据条件查询菜单
     */
    List<Map<String, Object>> selectMenus(@Param("condition") String condition, @Param("level") String level);

    /**
     * 根据条件查询菜单
     */
    List<Long> getMenuIdsByRoleId(@Param("roleId") Integer roleId);

    /**
     * 获取菜单列表树
     */
    List<ZTreeNode> menuTreeList();

    /**
     * 获取菜单列表树
     */
    List<ZTreeNode> menuTreeListByMenuIds(List<Long> menuIds);

    /**
     * 删除menu关联的relation
     */
    int deleteRelationByMenu(Long menuId);

    /**
     * 获取资源url通过角色id
     */
    List<String> getResUrlsByRoleId(Integer roleId);

    /**
     * 根据角色获取菜单
     */
    List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);
}
