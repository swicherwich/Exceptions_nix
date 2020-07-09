package com.nix.homework.retry;

import com.nix.homework.block.Block;

public interface Retry <T extends Block> {
	void retry(T t, int i) throws Exception;
}
