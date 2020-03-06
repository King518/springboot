package com.zjledu.test20200211.dao;

import com.zjledu.test20200211.entity.Pet;

import java.util.List;
import java.util.Map;

public interface PetDao {
	/**
	 * 新增
	 * @param pet
	 * @return
	 */
	public int save(Pet pet);

	/**
	 * 修改
	 * @param pet
	 * @return
	 */
	public int update(Pet pet);

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int deleteById(int id);

	/**
	 * 查询
	 * @param
	 * @return
	 */
	public List<Pet> getAllPet();
	public List<Map<String,Object>> getAllList();
	public Map<String,Object> getMapById(int id);
	public Pet getPetById(int id);








}
