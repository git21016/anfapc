package com.supyuan.kd.role;

import com.supyuan.component.base.KdBaseModel;
import com.supyuan.jfinal.component.annotation.ModelBind;
/**
 * 菜单model
 * @author chenan
 * Date:2017年12月5日下午5:41:08 
 */
@ModelBind(table = "sys_role_menu", key = "id")
public class RoleMenu extends KdBaseModel<RoleMenu> {
	private static final long serialVersionUID = 1L;
	public static final RoleMenu dao = new RoleMenu();


}
