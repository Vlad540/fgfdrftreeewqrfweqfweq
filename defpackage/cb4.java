package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: cb4  reason: default package */
public final class cb4 extends urd {
    public final Object j = new Object();
    public final ExecutorService k = Executors.newFixedThreadPool(4, new l30(2));
    public volatile Handler l;
}
