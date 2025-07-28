package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DumpCallback;
import org.webrtc.PeerConnectionFactory;

/* renamed from: tw0  reason: default package */
public final /* synthetic */ class tw0 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ tw0(u48 u48, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i) {
        this.a = 2;
        this.c = u48;
        this.o = atomicInteger;
        this.X = list;
        this.Y = arrayList;
        this.b = i;
    }

    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                gx0 gx0 = (gx0) this.c;
                String str = (String) this.o;
                int i = this.b;
                Set set = (Set) this.X;
                DumpCallback dumpCallback = (DumpCallback) this.Y;
                gx0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = gx0.o1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis((long) i), set, dumpCallback);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    gx0.Z0.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                int i2 = this.b + 1;
                k61 k61 = (s16) this.X;
                c6 c6Var = (s16) this.Y;
                p61 p61 = (p61) this.c;
                p61.getClass();
                ViewPager2 viewPager2 = (ViewPager2) this.o;
                if (!viewPager2.isInLayout()) {
                    k61.invoke();
                    return;
                } else if (i2 == 5) {
                    c6Var.invoke();
                    return;
                } else {
                    viewPager2.post(new tw0(p61, viewPager2, i2, k61, c6Var, 1));
                    return;
                }
            case 2:
                u48 u48 = (u48) this.c;
                u48.getClass();
                int incrementAndGet = ((AtomicInteger) this.o).incrementAndGet();
                List list = (List) this.X;
                if (incrementAndGet == list.size()) {
                    int i3 = 0;
                    while (true) {
                        List list2 = (List) this.Y;
                        if (i3 < list2.size()) {
                            ch7 ch7 = (ch7) list2.get(i3);
                            if (ch7 != null) {
                                try {
                                    bitmap = (Bitmap) swb.u(ch7);
                                } catch (CancellationException | ExecutionException e) {
                                    ez3.u(e, "Failed to get bitmap");
                                }
                                u48.g.t(qa7.g((l68) list.get(i3), bitmap), this.b + i3);
                                i3++;
                            }
                            bitmap = null;
                            u48.g.t(qa7.g((l68) list.get(i3), bitmap), this.b + i3);
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                ld8 ld8 = (ld8) this.Y;
                md8 md8 = (md8) this.c;
                if (!md8.f.i()) {
                    boolean isActive = md8.j.a.a.isActive();
                    v1d v1d = (v1d) this.o;
                    int i4 = this.b;
                    pd8 pd8 = (pd8) this.X;
                    if (!isActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(v1d == null ? Integer.valueOf(i4) : v1d.b);
                        sb.append(", pid=");
                        sb.append(pd8.a.b);
                        ez3.j0(sb.toString());
                        return;
                    }
                    ic8 R = md8.R(pd8);
                    nxc nxc = md8.e;
                    if (v1d != null) {
                        if (!nxc.P(R, v1d)) {
                            return;
                        }
                    } else if (!nxc.O(R, i4)) {
                        return;
                    }
                    try {
                        ld8.b(R);
                        return;
                    } catch (RemoteException e2) {
                        ez3.k0("Exception in " + R, e2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ tw0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
        this.X = obj3;
        this.Y = obj4;
    }
}
