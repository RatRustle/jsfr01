package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.JsfrTable01;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-06
 */
public interface JsfrTable01Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public JsfrTable01 selectJsfrTable01ById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<JsfrTable01> selectJsfrTable01List(JsfrTable01 jsfrTable01);

    /**
     * 新增【请填写功能名称】
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 结果
     */
    public int insertJsfrTable01(JsfrTable01 jsfrTable01);

    /**
     * 修改【请填写功能名称】
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 结果
     */
    public int updateJsfrTable01(JsfrTable01 jsfrTable01);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteJsfrTable01ById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteJsfrTable01ByIds(String[] ids);
}
