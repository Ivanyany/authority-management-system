package com.ivan.ams;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ivan.ams.entity.Area;
import com.ivan.ams.mapper.AreaMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@MapperScan("com.ivan.ams.mapper")
class AmsApplicationTests {

	@Autowired
	AreaMapper areaMapper;

	@Test
	void contextLoads() {

//		Area area = areaMapper.selectById(1);
//		System.out.println(area);

		List<Area> areaList = areaMapper.selectList(null);
		System.out.println(areaList);
	}

	@Test
	public void getAreasByPid(){

		Date begin = new Date();

		Integer id = 1;

		List<Area> results = new ArrayList<>();

		List<Area> sources = areaMapper.selectList(null);

		//直接从数据库查询自己
//		results.add(areaMapper.selectById(id));

		//遍历查询自己--效率较高
		for (Area a : sources) {
		    if (a.getId() == id){
		    	results.add(a);
			}
		}

		getChildren(id, sources, results);

		for (Area a : results) {
			System.out.println(a);
		}

		Date finish = new Date();

		System.out.println(finish.getTime() - begin.getTime());

	}

	/**
	 * 递归查询子节点
	 * @param id 传入的父节点
	 * @param sources 所有的数据集合
	 * @param results 子节点的集合
	 * @return
	 */
	public List<Area> getChildren(Integer id, List<Area> sources, List<Area> results){

		for (Area a : sources) {
		    if(a.getPid() == id){
		    	results.add(a);
		    	getChildren(a.getId(), sources, results);
			}
		}

		return results;
	}

}
