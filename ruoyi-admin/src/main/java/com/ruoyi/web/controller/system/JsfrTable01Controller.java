package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.JsfrTable01;
import com.ruoyi.system.service.IJsfrTable01Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2024-05-06
 */
@Controller
@RequestMapping("/system/table01")
public class JsfrTable01Controller extends BaseController
{
    private String prefix = "system/table01";

    @Autowired
    private IJsfrTable01Service jsfrTable01Service;

    @RequiresPermissions("system:table01:view")
    @GetMapping()
    public String table01()
    {
        return prefix + "/table01";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:table01:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JsfrTable01 jsfrTable01)
    {
        startPage();
        List<JsfrTable01> list = jsfrTable01Service.selectJsfrTable01List(jsfrTable01);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:table01:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JsfrTable01 jsfrTable01)
    {
        List<JsfrTable01> list = jsfrTable01Service.selectJsfrTable01List(jsfrTable01);
        ExcelUtil<JsfrTable01> util = new ExcelUtil<JsfrTable01>(JsfrTable01.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:table01:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JsfrTable01 jsfrTable01)
    {
        return toAjax(jsfrTable01Service.insertJsfrTable01(jsfrTable01));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:table01:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        JsfrTable01 jsfrTable01 = jsfrTable01Service.selectJsfrTable01ById(id);
        mmap.put("jsfrTable01", jsfrTable01);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:table01:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JsfrTable01 jsfrTable01)
    {
        return toAjax(jsfrTable01Service.updateJsfrTable01(jsfrTable01));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:table01:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jsfrTable01Service.deleteJsfrTable01ByIds(ids));
    }
}
