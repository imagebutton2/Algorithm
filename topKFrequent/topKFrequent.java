package com.java.myAlgorithm;

import java.util.*;

class Freq implements Comparable<Freq> {

    public int data, count;

    public Freq(int data, int count) {
        this.data = data;
        this.count = count;
    }

    @Override
    public int compareTo(Freq another) {
        if (this.count < another.count)
            return -1;
        else if (this.count > another.count)
            return 1;
        else
            return 0;
    }

}

public class topKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        PriorityQueue<Freq> freqs = new PriorityQueue<>();
        for (int key : map.keySet()) {
            if (freqs.size() < k) {
                freqs.offer(new Freq(key, map.get(key)));
            } else if (map.get(key) > freqs.peek().count) {
                freqs.poll();
                freqs.offer(new Freq(key, map.get(key)));
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!freqs.isEmpty()) {
            list.add(freqs.poll().data);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        return list;
    }

    public List<Integer> topKFrequent1(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        //Key
        PriorityQueue<Integer> KeyQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (int key : map.keySet()) {
            if (KeyQueue.size() < k) {
                KeyQueue.offer(key);
            } else if (map.get(key) > KeyQueue.peek()) {
                KeyQueue.poll();
                KeyQueue.offer(key);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!KeyQueue.isEmpty()) {
            list.add(KeyQueue.poll());
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] num = {4, 1, -1, 2, -1, 2, 3};
        int []num1={3,0,1,0};
        int k = 1;
        System.out.println(new topKFrequent().topKFrequent(num1, k));

    }
}
