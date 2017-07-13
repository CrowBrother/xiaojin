package org.j137.xiaojin.systemmag.dao;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;

public interface IUserDao {
	/**
	 * �����û�
	 * @param user
	 */
		public void saveUser(User user);
		/**
		 * �޸��û�
		 * @param user
		 */
		public void updateUser(User user);
		/**
		 * �߼�ɾ���û�
		 * @param user
		 */
		public void deleteUser(Long id);
		/**
		 * ��ѯ��ְ�û�
		 * @param user
		 */
		public Page findAllUser(Page page);
}
