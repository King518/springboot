package com.zjledu.test20200211.dao;

import com.zjledu.test20200211.entity.Pet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * author: King Long
 * date: 2020/2/22 9:20
 */
//@Mapper
public interface PetMapper {

    /**
     * 新增
     * @param pet
     * @return
     */
    @Insert("insert into t_pet(name,health,love,strain)value(#{name},#{health},#{love},#{strain})")
    public int save(Pet pet);


    /**
     * 查询
     * @param
     * @return
     */
    @Select("select * from t_pet")
    public List<Pet> getAllPet();
}
