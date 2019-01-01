package com.zozospider.jute;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class GetDataRequestMain implements Watcher {

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        ZooKeeper zooKeeper = new ZooKeeper("domain1.book.zookeeper", 5000, new GetDataRequestMain());
        zooKeeper.getData("/$7_2_4/get_data", true, null);
    }

    @Override
    public void process(WatchedEvent event) {
        // TODO
    }

}
