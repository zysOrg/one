package com.service.role;

import java.util.List;

import com.pojo.Role;

public interface RoleService {
	
	/**
	 * 获取角色列表
	 * @return
	 * @throws Exception
	 */
	public List<Role> getRoleList() throws Exception;
	/**
	 * 增加角色信息
	 * @param role
	 * @return
	 * @throws Exception
	 */
	public boolean add(Role role)throws Exception;
	
	/**
	 * 通过Id删除role
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public boolean deleteRoleById(Integer delId)throws Exception; 
	
	/**
	 * 修改角色信息
	 * @param role
	 * @return
	 * @throws Exception
	 */
	public boolean modify(Role role)throws Exception;
	
	
	/**
	 * 通过id获取role
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Role getRoleById(Integer id)throws Exception; 
	
	/**
	 * 根据roleCode ，进行角色编码的唯一性验�?
	 * @param roleCode
	 * @return
	 * @throws Exception
	 */
	public int roleCodeIsExist(String roleCode)throws Exception;
	
}
