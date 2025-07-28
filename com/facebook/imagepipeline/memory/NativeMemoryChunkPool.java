package com.facebook.imagepipeline.memory;

@lj4
public class NativeMemoryChunkPool extends il8 {
    @lj4
    public NativeMemoryChunkPool(ll8 ll8, h0b h0b, i0b i0b) {
        super(ll8, h0b, i0b);
    }

    public final Object a(int i) {
        return new NativeMemoryChunk(i);
    }
}
