package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bqc  reason: default package */
public final class bqc implements i13, c25, cr3, m96, dt7, fj7, gw3 {
    public static final /* synthetic */ bqc A0 = new Object();
    public static final bqc X = new Object();
    public static final bqc Y = new Object();
    public static final bqc Z = new Object();
    public static final bqc a = new Object();
    public static final ci b = new Object();
    public static final bqc c = new Object();
    public static final bqc o = new Object();
    public static final bqc w0 = new Object();
    public static final bqc x0 = new Object();
    public static final bqc y0 = new Object();
    public static final bqc z0 = new Object();

    public static boolean b(String str, String str2, ArrayList arrayList) {
        if (str2 != null) {
            String y02 = h0e.y0(31, str);
            int length = y02.length();
            String y03 = h0e.y0(31, str2);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (p0e.Q(str3, y02, false) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                    if (str3.endsWith(y03) && str3.length() == y03.length() + length + 1) {
                        arrayList.add(str3);
                        return false;
                    }
                }
            }
            arrayList.add(y02 + '=' + y03);
            while (arrayList.size() > 30) {
                arrayList.remove(0);
            }
        } else {
            String y04 = h0e.y0(31, str);
            int length2 = y04.length();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                if (p0e.Q(str4, y04, false) && str4.length() > length2 && str4.charAt(length2) == '=') {
                    it2.remove();
                }
            }
            return false;
        }
        return true;
    }

    public void a() {
    }

    public Object d(apa apa) {
        return apa.X0;
    }

    public Object l(Task task) {
        if (task.h()) {
            return (Bundle) task.f();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.e()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
    }

    public void load() {
        synchronized (bm3.o) {
            Object obj = bm3.X;
            synchronized (obj) {
                if (!bm3.Y) {
                    long a2 = bm3.a();
                    synchronized (obj) {
                        bm3.Z = a2;
                        bm3.Y = true;
                    }
                }
            }
        }
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        boolean m = ws8.m();
        zy zyVar = hw4.a;
        if (!m) {
            return new wj3(zyVar);
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return new wj3(zyVar);
        }
        zy zyVar2 = zyVar;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("contacts")) {
                    try {
                        zyVar2 = zy.c(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            zyVar2 = zyVar;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new wj3(zyVar2);
    }
}
