package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tda  reason: default package */
public final class tda implements ThreadFactory {
    public final AtomicInteger X = new AtomicInteger(1);
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final eie o;

    public tda(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, eie eie) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.o = eie;
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.X.getAndIncrement();
        sda sda = new sda(this.a + "-" + andIncrement, runnable);
        sda.setUncaughtExceptionHandler(this.b);
        sda.setPriority(this.c);
        sda.b = this.o;
        return sda;
    }
}
