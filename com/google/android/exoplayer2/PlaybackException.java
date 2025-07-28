package com.google.android.exoplayer2;

public class PlaybackException extends Exception implements lt0 {
    public final int a;
    public final long b;

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.a = i;
        this.b = j;
    }
}
