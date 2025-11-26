package com.swe.networking;

import com.swe.core.RPCinterface.AbstractRPC;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class MockRPC implements AbstractRPC {

    @Override
    public void subscribe(String methodName, Function<byte[], byte[]> method) {

    }

    @Override
    public Thread connect(int portNumber) throws IOException, InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public CompletableFuture<byte[]> call(String methodName, byte[] data) {
        return null;
    }
}
