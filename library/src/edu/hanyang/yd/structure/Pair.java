package edu.hanyang.yd.structure;

public class Pair<Left, Right> {
	private Left left;
	private Right right;

	public Pair(Left left, Right right) {
		this.left = left;
		this.right = right;
	}

	public Pair() {
	}

	public Left getLeft() {
		return left;
	}

	public void setLeft(Left left) {
		this.left = left;
	}

	public Right getRight() {
		return right;
	}

	public void setRight(Right right) {
		this.right = right;
	}
}

