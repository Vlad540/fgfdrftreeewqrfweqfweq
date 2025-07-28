package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: fi4  reason: default package */
public final /* synthetic */ class fi4 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((gi4) this.b).getClass();
                return true;
            case 1:
                ml4 ml4 = (ml4) this.b;
                ml4.getClass();
                int i = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = ml4.e;
                if (i == 1) {
                    ml4.h = true;
                    ml4.l = Collections.unmodifiableList((List) message.obj);
                    boolean d = ml4.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((kl4) it.next()).a(ml4);
                    }
                    if (d) {
                        ml4.a();
                    }
                } else if (i == 2) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = ml4.f - i2;
                    ml4.f = i4;
                    ml4.g = i3;
                    if (i3 == 0 && i4 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((kl4) it2.next()).c();
                        }
                    }
                } else if (i == 3) {
                    il4 il4 = (il4) message.obj;
                    ml4.l = Collections.unmodifiableList(il4.c);
                    boolean d2 = ml4.d();
                    boolean z = il4.b;
                    zj4 zj4 = il4.a;
                    if (z) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((kl4) it3.next()).f(ml4, zj4);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((kl4) it4.next()).e(zj4, il4.d);
                        }
                    }
                    if (d2) {
                        ml4.a();
                    }
                } else {
                    throw new IllegalStateException();
                }
                return true;
            case 2:
                qh7 qh7 = (qh7) this.b;
                Iterator it5 = qh7.d.iterator();
                while (it5.hasNext()) {
                    ph7 ph7 = (ph7) it5.next();
                    if (!ph7.d && ph7.c) {
                        wi5 e = ph7.b.e();
                        ph7.b = new ui5(1);
                        ph7.c = false;
                        qh7.c.d(ph7.a, e);
                    }
                    if (qh7.b.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                oz2 oz2 = (oz2) this.b;
                Iterator it6 = ((CopyOnWriteArraySet) oz2.d).iterator();
                while (it6.hasNext()) {
                    oh7 oh7 = (oh7) it6.next();
                    if (oh7.c) {
                        vi5 d3 = oh7.b.d();
                        oh7.b = new ui5(0);
                        oh7.c = false;
                        ((mh7) oz2.c).e(oh7.a, d3);
                    }
                    if (((g8e) oz2.a).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 4:
                b2b b2b = (b2b) this.b;
                b2b.getClass();
                if (message.what == 1) {
                    try {
                        o48 o48 = (o48) b2b.c;
                        o48.w.m0(o48.c);
                    } catch (RemoteException unused) {
                        ez3.j0("Error in sending flushCommandQueue");
                    }
                }
                return true;
            case 5:
                s48 s48 = (s48) this.b;
                s48.getClass();
                if (message.what == 1) {
                    u48 u48 = s48.e;
                    u48.G(false, u48.l);
                }
                return true;
            case 6:
                oqe oqe = (oqe) this.b;
                if (oqe.z && message.what != 4) {
                    return true;
                }
                try {
                    int i5 = message.what;
                    int i6 = 0;
                    if (i5 == 1) {
                        while (true) {
                            ArrayList arrayList = oqe.k;
                            if (i6 >= arrayList.size()) {
                                return true;
                            }
                            ((fyc) arrayList.get(i6)).start();
                            i6++;
                        }
                    } else if (i5 == 2) {
                        oqe.f((qjc) message.obj);
                        return true;
                    } else if (i5 == 3) {
                        oqe.c();
                        return true;
                    } else if (i5 != 4) {
                        return false;
                    } else {
                        oqe.d(message.arg1, (ExportException) message.obj);
                        return true;
                    }
                } catch (ExportException e2) {
                    oqe.d(2, e2);
                    return true;
                } catch (RuntimeException e3) {
                    oqe.d(2, ExportException.e(e3));
                    return true;
                }
                break;
            default:
                eef eef = (eef) this.b;
                eef.getClass();
                int i7 = message.what;
                if (i7 == 1) {
                    eef.q.n("recconect requested");
                    eef.g.execute(new pfe(15, eef));
                } else if (i7 == 2) {
                    d4b d4b = eef.q;
                    d4b.n("handleServerPingTimeout, timeout=" + eef.r);
                    synchronized (eef.b) {
                        try {
                            if (eef.c != null) {
                                eef.n.onFailedByPings();
                                eef.c.b(4000, "dispose");
                                eef.c = null;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    eef.d();
                } else {
                    throw new RuntimeException("unhandled message " + message.what);
                }
                return true;
        }
    }
}
