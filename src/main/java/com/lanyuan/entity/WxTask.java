package com.lanyuan.entity;


import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.ExcelDataMapper;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 微信抓取任务实体表
 */
@SuppressWarnings("serial")
public class WxTask implements java.io.Serializable{
	
	private int id;

	/*任务名称*/
	private String name;
	
	/*任务标识*/
	private String task;
	
	/*interval_id*/
    private int interval_id;
    
	/*crontab_id*/
    private int crontab_id;
    
	/*args*/
    private String args;
    
	/*kwargs*/
    private String kwargs;
    
    /*enabled*/
    private int enabled;
    
    /*last_run_at*/
    private Date last_run_at;
    
    /*total_run_count*/
    private int total_run_count;
    
    /*date_changed*/
    private Date date_changed;
    
    /*description*/
    private String description;
    

    @ExcelDataMapper(title="id",order=1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ExcelDataMapper(title="name",order=2)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ExcelDataMapper(title="task",order=3)
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@ExcelDataMapper(title="interval_id",order=4)
	public int getInterval_id() {
		return interval_id;
	}

	public void setInterval_id(int interval_id) {
		this.interval_id = interval_id;
	}

	@ExcelDataMapper(title="crontab_id",order=5)
	public int getCrontab_id() {
		return crontab_id;
	}

	public void setCrontab_id(int crontab_id) {
		this.crontab_id = crontab_id;
	}

	@ExcelDataMapper(title="args",order=6)
	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	@ExcelDataMapper(title="kwargs",order=7)
	public String getKwargs() {
		return kwargs;
	}

	public void setKwargs(String kwargs) {
		this.kwargs = kwargs;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	/*时间格式化*/
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getLast_run_at() {
		return last_run_at;
	}

	public void setLast_run_at(Date last_run_at) {
		this.last_run_at = last_run_at;
	}

	public int getTotal_run_count() {
		return total_run_count;
	}

	public void setTotal_run_count(int total_run_count) {
		this.total_run_count = total_run_count;
	}

	/*时间格式化*/
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getDate_changed() {
		return date_changed;
	}

	public void setDate_changed(Date date_changed) {
		this.date_changed = date_changed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}
