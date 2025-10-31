package com.sp.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpEL_Demo {
	
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+5+3}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "SpEL_Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
