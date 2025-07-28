package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r6g  reason: default package */
public final class r6g {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final o15 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final u4g j = new u4g(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public a6g l;
    public IInterface m;

    public r6g(Context context, o15 o15) {
        Intent intent = y5g.f;
        this.a = context;
        this.b = o15;
        this.c = "AppUpdateService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(r6g r6g, j5g j5g) {
        IInterface iInterface = r6g.m;
        ArrayList arrayList = r6g.d;
        o15 o15 = r6g.b;
        if (iInterface == null && !r6g.g) {
            o15.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(j5g);
            a6g a6g = new a6g(1, r6g);
            r6g.l = a6g;
            r6g.g = true;
            if (!r6g.a.bindService(r6g.h, a6g, 1)) {
                o15.b("Failed to bind to the service.", new Object[0]);
                r6g.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzy zzy = new zzy();
                    vde vde = ((j5g) it.next()).a;
                    if (vde != null) {
                        vde.c(zzy);
                    }
                }
                arrayList.clear();
            }
        } else if (r6g.g) {
            o15.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(j5g);
        } else {
            j5g.run();
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

    public final void c(vde vde) {
        synchronized (this.f) {
            this.e.remove(vde);
        }
        a().post(new z5g(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((vde) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
