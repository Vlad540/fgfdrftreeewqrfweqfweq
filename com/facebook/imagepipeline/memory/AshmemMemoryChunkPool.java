package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;

@TargetApi(27)
@lj4
public class AshmemMemoryChunkPool extends il8 {
    @lj4
    public AshmemMemoryChunkPool(ll8 ll8, h0b h0b, i0b i0b) {
        super(ll8, h0b, i0b);
    }

    public final Object a(int i) {
        return new is(i);
    }
}
