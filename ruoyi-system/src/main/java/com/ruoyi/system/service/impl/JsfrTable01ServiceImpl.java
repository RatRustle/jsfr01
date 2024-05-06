package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JsfrTable01Mapper;
import com.ruoyi.system.domain.JsfrTable01;
import com.ruoyi.system.service.IJsfrTable01Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-06
 */
@Service
public class JsfrTable01ServiceImpl implements IJsfrTable01Service 
{
    @Autowired
    private JsfrTable01Mapper jsfrTable01Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public JsfrTable01 selectJsfrTable01ById(Long id)
    {
        return jsfrTable01Mapper.selectJsfrTable01ById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<JsfrTable01> selectJsfrTable01List(JsfrTable01 jsfrTable01)
    {
        return jsfrTable01Mapper.selectJsfrTable01List(jsfrTable01);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertJsfrTable01(JsfrTable01 jsfrTable01)
    {
        return jsfrTable01Mapper.insertJsfrTable01(jsfrTable01);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param jsfrTable01 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateJsfrTable01(JsfrTable01 jsfrTable01)
    {
        return jsfrTable01Mapper.updateJsfrTable01(jsfrTable01);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteJsfrTable01ByIds(String ids)
    {
        return jsfrTable01Mapper.deleteJsfrTable01ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteJsfrTable01ById(Long id)
    {
        return jsfrTable01Mapper.deleteJsfrTable01ById(id);
    }
}
