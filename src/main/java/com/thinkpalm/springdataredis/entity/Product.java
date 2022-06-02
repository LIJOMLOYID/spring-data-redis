package com.thinkpalm.springdataredis.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lijo M Loyid
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product {	
	@Id
	private int id;
	private String name;
	private int qty;
	private long price;
}
