package com.zozospider.jute;

import org.apache.jute.BinaryInputArchive;
import org.apache.jute.BinaryOutputArchive;
import org.apache.zookeeper.server.ByteBufferInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MockReqHeaderMain {

    public static void main(String[] args) throws IOException {

        // 开始序列化
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BinaryOutputArchive outputArchive = BinaryOutputArchive.getArchive(outputStream);

        MockReqHeader mock = new MockReqHeader(0x244221eccb92a34el, "ping");
        mock.serialize(outputArchive, "header");

        // 这里通常是 TCP 网络传输对象
        ByteBuffer buffer = ByteBuffer.wrap(outputStream.toByteArray());

        // 开始反序列化
        ByteBufferInputStream inputStream = new ByteBufferInputStream(buffer);
        BinaryInputArchive inputArchive = BinaryInputArchive.getArchive(inputStream);

        MockReqHeader receivedMock = new MockReqHeader();
        receivedMock.deserialize(inputArchive, "header");

        // 关闭流
        inputStream.close();
        outputStream.close();
    }

}
