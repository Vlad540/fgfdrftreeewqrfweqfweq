package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f6g  reason: default package */
public final class f6g {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final mj4 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final u4g j = new u4g(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public a6g l;
    public IInterface m;

    public f6g(Context context, mj4 mj4, Intent intent) {
        this.a = context;
        this.b = mj4;
        this.c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(f6g f6g, m4g m4g) {
        IInterface iInterface = f6g.m;
        ArrayList arrayList = f6g.d;
        mj4 mj4 = f6g.b;
        if (iInterface == null && !f6g.g) {
            mj4.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(m4g);
            a6g a6g = new a6g(0, f6g);
            f6g.l = a6g;
            f6g.g = true;
            if (!f6g.a.bindService(f6g.h, a6g, 1)) {
                mj4.b("Failed to bind to the service.", new Object[0]);
                f6g.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzu zzu = new zzu();
                    vde vde = ((m4g) it.next()).a;
                    if (vde != null) {
                        vde.c(zzu);
                    }
                }
                arrayList.clear();
            }
        } else if (f6g.g) {
            mj4.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(m4g);
        } else {
            m4g.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((vde) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
