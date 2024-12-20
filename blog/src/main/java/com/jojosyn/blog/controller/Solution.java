package com.jojosyn.blog.controller;

public class Solution {

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (true)
        if (n % 2 == 0) {
            n /= 2;
        } else if (n % 3 == 0) {
            n /= 3;
        } else if (n % 5 == 0) {
            n /= 5;
        } else {
            return n == 1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        while (n != 0 && (n % 3) == 0) {
            n /= 3;
        }
        boolean a = n == 1;
    }




      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


}
