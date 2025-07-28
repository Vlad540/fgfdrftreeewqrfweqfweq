package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.occ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends occ> extends lp {
    public static final rt0 s = new rt0(11);
    public final Object j = new Object();
    public final CountDownLatch k = new CountDownLatch(1);
    public final ArrayList l = new ArrayList();
    public final AtomicReference m = new AtomicReference();
    public occ n;
    public Status o;
    public volatile boolean p;
    public boolean q;
    public boolean r = false;

    public BasePendingResult(fzf fzf) {
        new z59(fzf != null ? fzf.a.Y : Looper.getMainLooper(), 2);
        new WeakReference(fzf);
    }

    public final void X(ima ima) {
        synchronized (this.j) {
            try {
                if (a0()) {
                    ima.a(this.o);
                } else {
                    this.l.add(ima);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract occ Y(Status status);

    public final void Z(Status status) {
        synchronized (this.j) {
            try {
                if (!a0()) {
                    b0(Y(status));
                    this.q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a0() {
        return this.k.getCount() == 0;
    }

    public final void b0(occ occ) {
        synchronized (this.j) {
            try {
                if (!this.q) {
                    a0();
                    a24.q("Results have already been set", !a0());
                    a24.q("Result has already been consumed", !this.p);
                    this.n = occ;
                    this.o = occ.a();
                    this.k.countDown();
                    ArrayList arrayList = this.l;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((ima) arrayList.get(i)).a(this.o);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
