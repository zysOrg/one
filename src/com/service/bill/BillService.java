package com.service.bill;

import java.util.List;

import com.pojo.Bill;

public interface BillService {
	
	/**
	 * 通过条件获取供应商列�?-providerList
	 * @param productName
	 * @param providerId
	 * @param isPayment
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<Bill> getBillList(String productName,Integer providerId,
								Integer isPayment,Integer currentPageNo,Integer pageSize) throws Exception;

	
	/**
	 * 通过条件查询-订单表记录数
	 * @param productName
	 * @param providerId
	 * @param isPayment
	 * @return
	 * @throws Exception
	 */
	public int getBillCount(String productName,Integer providerId,Integer isPayment) throws Exception;
	
	/**
	 * 增加订单
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public boolean add(Bill bill) throws Exception;
	
	/**
	 * 通过id获取Bill
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Bill getBillById(Integer id) throws Exception;
	
	/**
	 * 修改订单信息
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public boolean modify(Bill bill) throws Exception;
	
	/**
	 * 通过id删除订单信息
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public boolean deleteBillById(Integer delId) throws Exception;
}
