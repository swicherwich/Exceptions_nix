package com.nix.homework.retry;

import com.nix.homework.block.Block;

public class RetryImpl implements Retry<Block> {
	
	@Override
	public void retry(Block block, int iterations) throws Exception {
		for(int i = 0; i < iterations; ++i) {
			try {
				block.run();
				System.out.printf("[iteration %d] Code has been executed successfully\n", i);
				return;
			} catch (Exception e) {
				System.out.printf("[iteration %d] Exception: %s\n", i, e.getMessage());
			}
		}
		throw new Exception("Out of iterations" + iterations);
	}
}
