package com.moon.sequence.data;

import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractSequenceBlockingQueue implements ISequenceBlockingQueue {
	// 名称
	public String name = null;

	// 开始索引
	public int start = -1;

	// 步长
	public int step = 100;

	// 当前SeqNo
	public AtomicLong currSeqNo = new AtomicLong();

	// 是否周期循环，N表示不循环，D表示每天循环，M表示每月循环，Y表示每年循环
	public String isCycle = "N";

	// 当前存在内存中的最大值，一旦超过该值，则需要向数据存储中心放松请求获得更大的值，并更新对方的数据。
	public Long cachedMaxVal = null;

	// 最大值
	public Long maxVal = null;

	public abstract boolean isOver();

	public abstract Long getSeqNo();

	public abstract boolean updateCachedMaxVal();

}
