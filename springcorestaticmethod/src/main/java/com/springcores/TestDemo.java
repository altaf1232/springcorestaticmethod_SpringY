package com.springcores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestDemo 
{
   @Value("#{10+20 }")
   private int x;
   
   @Value("#{30+30}")
   private int y;
   @Value("#{40+40}")
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
	return "TestDemo [x=" + x + ", y=" + y + ", z=" + z + "]";
}
  
  
}
