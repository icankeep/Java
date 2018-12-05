package com.passer.smis.domain;

import lombok.Data;

/**
 * 管理用户类，包装了该用户的信息<p>
 * @author passer
 */
@Data
public class User {
	private Long id;
	private String username;
	private String password;
}
