LeetCode
========
Solution to the problems given in the Leetcode

These are the prolbems given in Leetcode http://oj.leetcode.com/problems/

How to run these problems
-------------------------
All classes are solution since leetcode gives the input and output. However, if locally it has to be tested. just definition of the function may be useful.
Main class should be written in order to call these functions and test.

LinkedListCycleII.java
----------------------
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?

SingleNumber.java
-----------------
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

ValidSudoku.java
----------------
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

ReorderList.java
----------------
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

MinDepthBinaryTree.java
-----------------------
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

BinTreeFromInPostOrder.java
---------------------------
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

TrappingRainWater.java
----------------------
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

LinkedListCycle.java
--------------------
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

MaxDepthBinaryTree.java
-----------------------
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

RemoveNthLast.java
------------------
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

PalindromeNumber.java 
---------------------
Determine whether an integer is a palindrome. Do this without extra space.

SortedArraytoBST.java
---------------------
Convert Sorted Array to Binary Search Tree 
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

Evaluate Reverse Polish Notation
---------------------------------
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
  
ReverseWordsSrting.java
-----------------------
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

MergeTwoSortedLists.java
------------------------
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

TwoSum.java
--------------
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

TwoNummbers.java
-----------------
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

reversei.java
--------------
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

atoi.java
---------
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
