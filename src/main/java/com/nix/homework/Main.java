package com.nix.homework;

import com.nix.homework.block.Block;
import com.nix.homework.block.BlockImpl;
import com.nix.homework.retry.Retry;
import com.nix.homework.retry.RetryImpl;

public class Main {
	private static final Retry<Block> retry = new RetryImpl();
	
	/*
	 * Might work at the first time multiply times
	 * Keep rerunning main in order to catch more iterations result
	 */
	
	public static void main(String[] args) {
		Block block = new BlockImpl();
		try {
			retry.retry(block, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
