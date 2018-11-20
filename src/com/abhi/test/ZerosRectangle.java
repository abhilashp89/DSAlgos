package com.abhi.test;


import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class ZerosRectangle {
  public static void main(String[] args) {

  int[][] image = {
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 0, 0, 1, 1},
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 1, 1, 1, 1}
};
    
    List<Pair> pairList=getRectangleCoOrdinates(image);
    
    pairList.forEach(pair-> System.out.println(pair.x+","+pair.y));
    
  }
  
  
  private static List<Pair> getRectangleCoOrdinates(int[][] image){
  
    List<Pair> pairList=new ArrayList<>(2);
    
    int rowCount=image.length;
    int colCount=image[0].length;
  
    for(int i=0;i<rowCount;i++){
    
       
        for(int j=0;j<colCount;j++){
        
           if(image[i][j] == 0) {
           
             Pair pair = new Pair(i,j);
             pairList.add(pair);
              
             while(j < colCount &&  image[i][j] !=1) {
            
               j++;
             }
             
             
             
             while(i < rowCount && image[i][j-1] !=1) {
             
               i++;
             }
             
             pair =new Pair(i-1,j-1);
             
        
             pairList.add(pair);
             break;
             
           }
        
        }
    }
    
    return pairList;
  
  }
  
  
  private static class Pair{
  
     int x;
     int y;
    
    Pair(int x,int y) {
    
      this.x=x;
      this.y=y;
    }
  }
}


/* 
Your previous Markdown content is preserved below:

Imagine we have an image. We'll represent this image as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have a single rectangle of 0s on a background of 1s. 

Write a function that takes in the image and returns the coordinates of the rectangle of 0's -- either top-left and bottom-right; or top-left, width, and height.


// Java
int[][] image = {
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 0, 0, 0, 1},
  {1, 1, 1, 0, 0, 0, 1},
  {1, 1, 1, 1, 1, 1, 1}
};

Sample output:
x: 3, y: 2, width: 3, height: 2
2,3 3,5
3,2 5,3 -- it's ok to reverse columns/rows as long as you're consistent

 */