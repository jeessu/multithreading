package com.kino.beta.productorAndCustomer3;

import com.lmax.disruptor.WorkHandler;

public class Consumer implements WorkHandler<PCData>{

	@Override
	public void onEvent(PCData event) throws Exception {
		
		System.out.println(Thread.currentThread().getId()+" event :"+event.get()+" result:"+event.get()*event.get());
	}

}
