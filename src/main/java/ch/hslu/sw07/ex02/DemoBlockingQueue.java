package ch.hslu.sw07.ex02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class DemoBlockingQueue {

    private static final Logger LOG = LogManager.getLogger(DemoConcurrentList.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BlockingQueue<Integer> queue;
        queue = new LinkedBlockingQueue<>();
        final ExecutorService executor = Executors.newCachedThreadPool();
        final List<Future<Long>> futures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            futures.add(executor.submit(new QueueProducer(queue, 1000)));
        }
        Iterator<Future<Long>> iterator = futures.iterator();
        long totProd = 0;
        while (iterator.hasNext()) {
            long sum = iterator.next().get();
            totProd += sum;
            LOG.info("prod sum = " + sum);
        }
        LOG.info("prod tot = " + totProd);
        long totCons = executor.submit(new QueueConsumer(queue)).get();
        LOG.info("cons tot = " + totCons);
        executor.shutdown();

    }
}
