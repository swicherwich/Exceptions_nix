package com.nix.homework;

import com.nix.homework.block.Block;
import com.nix.homework.block.BlockImpl;
import com.nix.homework.retry.Retry;
import com.nix.homework.retry.RetryImpl;

public class Main {
	private static final Retry<Block> retry = new RetryImpl();
	
	public static void main(String[] args) {
		Block block = new BlockImpl();
		retry.retry(block, 10);
	}
}
