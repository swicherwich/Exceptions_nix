package com.nix.homework;

public interface Retry <T extends Block> {
	void retry(T t, int i);
}
