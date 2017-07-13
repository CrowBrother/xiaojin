package org.j137.xiaojin.systemmag.dao;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;

public interface IRoleDao {
	/**
	 * ����һ����ɫ
	 * @param role
	 */
	public void saveRole(Role role);
	
	/**
	 * �޸�һ����ɫ
	 * @param role
	 */
	public void updateRole(Role role);
	
	/**
	 * �߼�ɾ��һ����ɫ
	 * @param id
	 */
	public void deleteRole(Long id);
	/**
	 * ��ѯ��ɫ
	 * @param role
	 * @return
	 */
	public Page findRole(Page page);
}