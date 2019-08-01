package com.ysc.afterschool.domain.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.ysc.afterschool.domain.AbstractDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 학교 관리 도메인
 * 
 * @author hgko
 *
 */
@Entity
@Table(name = "tb_school")
@Data
@EqualsAndHashCode(callSuper = false)
public class School extends AbstractDomain {

	/** 이름 */
	@Column(nullable = false, length = 20)
	private String name;
	
	/** 학생 수 */
	private int number;
	
	@Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
	private SchoolType schoolType;
	
	@Getter
	public enum SchoolType {
		초등("초등학교"),
		중등("중학교"),
		고등("고등학교");
		
		private String name;
		
		private SchoolType(String name) {
			this.name = name;
		}
	}
	
	
}
