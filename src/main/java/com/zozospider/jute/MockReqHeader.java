package com.zozospider.jute;

import org.apache.jute.InputArchive;
import org.apache.jute.OutputArchive;
import org.apache.jute.Record;

import java.io.IOException;

public class MockReqHeader implements Record {
    @Override
    public void serialize(OutputArchive archive, String tag) throws IOException {

    }

    @Override
    public void deserialize(InputArchive archive, String tag) throws IOException {

    }
}
