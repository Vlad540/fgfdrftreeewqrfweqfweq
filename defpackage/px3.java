package defpackage;

import android.util.SparseIntArray;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: px3  reason: default package */
public final class px3 implements ThreadFactory {
    public static final SparseIntArray X;
    public final int a = 9;
    public final int b = X.get(9, 0);
    public final String c;
    public final AtomicInteger o = new AtomicInteger(0);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(1, 10);
        sparseIntArray.put(2, 16);
        sparseIntArray.put(3, 13);
        sparseIntArray.put(4, 16);
        sparseIntArray.put(5, 0);
        sparseIntArray.put(6, -2);
        sparseIntArray.put(7, -4);
        sparseIntArray.put(8, -6);
        sparseIntArray.put(9, -5);
        sparseIntArray.put(10, -8);
    }

    public px3(String str) {
        this.c = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new dr1(this, 16, runnable));
        try {
            thread.setPriority(this.a);
        } catch (Throwable unused) {
        }
        thread.setName(this.c + "-" + this.o.getAndIncrement());
        return thread;
    }
}
