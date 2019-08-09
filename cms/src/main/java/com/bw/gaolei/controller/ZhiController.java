package com.bw.gaolei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.gaolei.bean.Lei;
import com.bw.gaolei.bean.Zhi;
import com.bw.gaolei.bean.ZhiVo;
import com.bw.gaolei.service.ZhiService;
import com.bw.gaolei.util.PageHelpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ZhiController {
	@Autowired
	private ZhiService service;
	
	//删除
	@RequestMapping("del.do")
	@ResponseBody
	public Object del(int zid){
		service.del(zid);
		return true;
	}
	
	//批量删除
	@RequestMapping("pldel.do")
	@ResponseBody
	public Object plde(ZhiVo z){
		System.out.println("whdhuijqgwhwjdighjghj蝴蝶舞的话我"+z);
		int pldel = service.pldel(z);
		if(pldel>0){
			
			return true;
		}else{
			return false;
			
		}
	}
	
	//修改
	@RequestMapping("update1.do")
	@ResponseBody
	public Object update1(Zhi z){
		service.update(z);
		return true;
	}
	
	//修改跳转
	@RequestMapping("update.do")
	public String update(int zid,Model model){
		model.addAttribute("zid", zid);
		return "update.jsp";
	}
	
	//回显
	@RequestMapping("show.do")
	@ResponseBody
	public Object show(int zid){
		Zhi listzhiid = service.listzhiid(zid);
		return listzhiid;
	}
	
	//查看页面跳转
	@RequestMapping("look.do")
	public String look(int zid,Model model){
		model.addAttribute("zid", zid);
		return "look.jsp";
	}
	
	//添加
	@RequestMapping("add1.do")
	@ResponseBody
	public Object add1(Zhi z){
		service.add(z);
		return true;
	}
	
	//下拉框
	@RequestMapping("xiala.do")
	@ResponseBody
	public Object xial(){
		List<Lei> listlei = service.listlei();
		return listlei;
	}
	
	//添加跳转
	@RequestMapping("add.do")
	public String add(){
		return "add.jsp";
	}
	
	//列表展示
	@RequestMapping("list.do")
	public String listzhi(Model model,@RequestParam(defaultValue="1") Integer pageNum,ZhiVo zv){
		int pageSize = 3;
		PageHelper.startPage(pageNum, pageSize);
		List<Zhi> list = service.listzhi(zv);
		PageInfo<Zhi> pageInfo = new PageInfo<Zhi>(list);
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("zv", zv);
		
		//分页信息
		String page = PageHelpUtil.page("list.do",pageInfo , null);
		model.addAttribute("page", page);
		return "list.jsp";
	}
}
