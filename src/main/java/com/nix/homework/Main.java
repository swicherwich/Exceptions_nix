package com.nix.homework;

public class Main {
	private static final Retry<Block> retry = new RetryImpl();
	
	public static void main(String[] args) {
		Block block = new BlockImpl();
		retry.retry(block, 10);
	}
}
