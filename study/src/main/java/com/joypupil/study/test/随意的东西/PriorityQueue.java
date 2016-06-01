package com.joypupil.study.test.随意的东西;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 优先级队列，用来整理一个优先级队列，每个优先级的一次出优先级对应的个数
 * </br>比如出1个优先级1的，出2个优先级2的，然后出3个优先级3的，可以自定义优先级的等级级数
 * @author hezikang
 *
 */
public class PriorityQueue {
	
	private static int PRIORITY = 1;	//优先级等级数
	
	private static int total = 0;		//队列中剩余的总的个数
	
	private static int loop = 1;		//循环用来确定现在是拿那个队列的元素	
	
	private static int marker = 1;		//查看这个队列已经拿了几个元素
	
	private static Map<Integer, Queue<Object>> map;

	public static void main(String[] args) {
		init(10);
		add("abc", 1);
		add("ddd", 5);
		System.out.println(getTotal());
		System.out.println(poll());
		System.out.println(poll());
		System.out.println(getTotal());
		System.out.println(poll());
		System.out.println(getTotal());
		add("dafdsaf", 3);
		System.out.println(getTotal());
		System.out.println(poll());
		System.out.println(getTotal());
		System.out.println(poll());
		System.out.println(getTotal());
	}
	
	/**
	 * 初始化队列map集合
	 */
	public static void init(int priority){
		if(priority > 1){
			PRIORITY = priority;
		}
		map = new HashMap<Integer, Queue<Object>>();
		for(int i = 1; i <= PRIORITY; i++){
			map.put(i, new ConcurrentLinkedQueue<Object>());
		}
		loop = PRIORITY;
	}
	
	/**
	 * 队列中加入元素
	 * @param id
	 * @param priority
	 */
	public synchronized static void add(Object id, int priority){
		if(map.containsKey(priority)){
			Queue<Object> queue = map.get(priority);
			queue.offer(id);
		}
		else{
			Queue<Object> queue = map.get(PRIORITY); //没有对应优先级时，说明有问题，直接给最大优先级
			queue.offer(id);
		}
		total++;
	}
	
	public synchronized static Object poll(){
		Object id = null;
		//拿出一个元素
		if(map.containsKey(loop)){
			Queue<Object> queue = map.get(loop);
			id = queue.poll();
		}
		if(marker == loop || id == null){
			marker = 1;
			if(loop == 1){
				loop = PRIORITY;
			}
			else{
				loop --;
			}
			
		}
		else{
			marker ++;
		}
		if(id == null){
			 id = poll(1);
		}
		if(id != null){
			total--;
		}
		return id;
	}
	
	private static Object poll(int i){
		if(i > PRIORITY){
			return null;
		}
		Object id = null;
		//拿出一个元素
		if(map.containsKey(loop)){
			Queue<Object> queue = map.get(loop);
			id =queue.poll();
		}
		if(marker == loop || id == null){
			marker = 1;
			if(loop == 1){
				loop = PRIORITY;
			}
			else{
				loop --;
			}
			
		}
		else{
			marker ++;
		}
		if(id == null){
			i++;
			id = poll(i);
		}
		return id;
	}

	public static int getTotal(){
		return total;
	}
}
