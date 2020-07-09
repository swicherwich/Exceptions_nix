package com.nix.homework;

import java.util.Random;

public class BlockImpl implements Block {
	
	private final Random random = new Random();
	
	@Override
	public void run() throws Exception {
		final boolean status = random.nextBoolean();
		if(!status) throw new Exception("Boolean value is: " + status);
	}
}
