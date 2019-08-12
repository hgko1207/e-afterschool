package com.ysc.afterschool.domain.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.ysc.afterschool.domain.AbstractDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 강사 관리 도메인
 * 
 * @author hgko
 *
 */
@Entity
@Table(name = "tb_teacher")
@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher extends AbstractDomain {

	/** 이름 */
	@Column(nullable = false, length = 255)
	private String name;
	
	/** 연락처 */
	@Column(nullable = false, length = 20)
	private String tel;
	
	/** 이메일 */
	@Column(nullable = false, length = 45)
	private String email;
	
	/** 성별 */
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private Sex sex;
	
	private int subjectId;
	
	public enum Sex {
		남성, 여성;
	}
}
