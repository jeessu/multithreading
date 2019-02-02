package com.kino.beta.productorAndCustomer3;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

public class Producer {

	private final RingBuffer<PCData> ringBuffer;

	public Producer(RingBuffer<PCData> ringBuffer) {
		this.ringBuffer = ringBuffer;
	}
	
	public void pushData(ByteBuffer bb){
		
		long sequeue = ringBuffer.next();
		
		try {
			PCData event = ringBuffer.get(sequeue);
			event.set(bb.getLong(0));
		} finally {
			ringBuffer.publish(sequeue);
		}
		
	}
	
}
