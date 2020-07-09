package com.nix.homework.retry;

import com.nix.homework.block.Block;

public class RetryImpl implements Retry<Block> {
	
	@Override
	public void retry(Block block, int iterations) {
		for(int i = 0; i < iterations; ++i) {
			try {
				block.run();
				if(i == iterations - 1) {
					System.out.println("Out of iterations: " + iterations);
				} else {
					System.out.printf("[iteration %d] Code has been executed successfully\n", i);
				}
				return;
			} catch (Exception e) {
				System.out.printf("[iteration %d] Exception: %s\n", i, e.getMessage());
			}
		}
	}
}
