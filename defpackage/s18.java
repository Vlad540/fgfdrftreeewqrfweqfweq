package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: s18  reason: default package */
public final class s18 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ s18(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.Y = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.X = obj5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((v18) ((u18) this.b)).a.getBinder();
                x3a x3a = (x3a) this.Y;
                l18 l18 = (l18) ((wd8) x3a.b).X.get(binder);
                if (l18 != null) {
                    wd8 wd8 = (wd8) x3a.b;
                    wd8.getClass();
                    HashMap hashMap = l18.f;
                    String str = (String) this.c;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        IBinder iBinder = (IBinder) this.o;
                        Bundle bundle = (Bundle) this.X;
                        if (hasNext) {
                            yia yia = (yia) it.next();
                            if (iBinder == yia.a) {
                                Bundle bundle2 = (Bundle) yia.b;
                                if (bundle != bundle2) {
                                    if (bundle == null) {
                                        oyb.l(bundle2);
                                        if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle2 == null) {
                                        if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            list.add(new yia(iBinder, bundle));
                            hashMap.put(str, list);
                            k18 k18 = new k18(wd8, str, l18, str, bundle);
                            wd8.Y = l18;
                            if (bundle == null) {
                                k18.c();
                            } else {
                                k18.b = 1;
                                k18.c();
                            }
                            wd8.Y = null;
                            if (k18.a) {
                                wd8.Y = null;
                                return;
                            }
                            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + l18.a + " id=" + str);
                        }
                    }
                } else {
                    return;
                }
            case 1:
                ccd ccd = (ccd) this.Y;
                ArrayList arrayList = ccd.w0;
                WeakHashMap weakHashMap = eaf.a;
                View view = (View) this.b;
                arrayList.remove(t9f.k(view));
                ccd.x0.add(new bcd(view, (ViewGroup) view.getParent()));
                ((ViewGroup) view.getParent()).removeView(view);
                if (ccd.w0.size() == 0) {
                    View view2 = (View) this.c;
                    view2.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.o);
                    view2.setVisibility(4);
                    ((k40) this.X).g();
                    return;
                }
                return;
            default:
                try {
                    if (!(((b4d) this.b).a instanceof r0)) {
                        String uuid = ((UUID) this.c).toString();
                        ztf l = ((atf) this.Y).c.l(uuid);
                        if (l == null || l.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((t4b) ((atf) this.Y).b).g(uuid, (hu5) this.o);
                        ((Context) this.X).startService(b8e.c((Context) this.X, vx3.o(l), (hu5) this.o));
                    }
                    ((b4d) this.b).j((Object) null);
                    return;
                } catch (Throwable th) {
                    ((b4d) this.b).k(th);
                    return;
                }
        }
    }
}
