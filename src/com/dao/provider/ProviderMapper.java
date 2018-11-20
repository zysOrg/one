package com.dao.provider;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.pojo.Provider;

public interface ProviderMapper {
	
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int add(Provider provider)throws Exception;
	
	/**
	 * 通过条件查询-providerList
	 * @param proName
	 * @param proCode
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProviderList(@Param("proName")String proName,@Param("proCode")String proCode,
								@Param("from")Integer currentPageNo, @Param("pageSize")Integer pageSize)throws Exception;
	
	/**
	 * 获取供应商列�?
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProList()throws Exception;

	
	
	/**
	 * 通过条件查询-供应商表记录�?
	 * @param proName
	 * @param proCode
	 * @return
	 * @throws Exception
	 */
	public int getProviderCount(@Param("proName")String proName,@Param("proCode")String proCode)throws Exception;
	
	/**
	 * 通过供应商id删除供应商信�?
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteProviderById(@Param("id")Integer delId)throws Exception; 
	
	/**
	 * 根据provider id 获取供应商信�?
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Provider getProviderById(@Param("id")Integer id)throws Exception; 
	
	/**
	 * 修改供应�?
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public int modify(Provider provider)throws Exception;
	
}
