/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.god.androidmore;

import static com.example.god.androidmore.algorithm.search.BinarySearch.binarySearch;
import static com.example.god.androidmore.algorithm.sort.SelectionSort.selsctionSort;
import static com.example.god.androidmore.algorithm.sort.ShellSort.shellSort;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int[] src = {99, 2323, 9, 77, 44, 2, 87, 21, 32, 54};

//    BubbleSort(src);
//    logOut("冒泡排序", src);
//
//    QuickSort(src, 0, src.length - 1);
//    logOut("快速排序", src);
//
    selsctionSort(src);
    logOut("选择排序", src);

//    int i = sequenceSearch(src, 123);
//    logOut("线性查找", src[i]);

    int searchValue = 0;
    int i = binarySearch(src, searchValue, 0, src.length-1);
    logOut("二分查找", i, searchValue);

//    insertionSort(src);
//    logOut("插入排序", src);

//    shellSort(src, src.length);
////    logOut("希尔排序", src);
  }

  private void logOut(String method, int[] src) {
    for (int i = 0; i < src.length; i++) {
      Log.d(TAG, method + src[i]);
    }
  }

  private void logOut(String method, int src, int value) {
    Log.d(TAG, method + value + "的位置在数组的第" + src + "前");
  }
}
