package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.StatsReport;

/* renamed from: uxf  reason: default package */
public final class uxf implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cia b;

    public /* synthetic */ uxf(cia cia, int i) {
        this.a = i;
        this.b = cia;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [k7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v10, types: [k7c, java.lang.Object] */
    public final Object apply(Object obj) {
        boolean z;
        u16 u16;
        double d;
        double d2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        String str;
        Double F;
        switch (this.a) {
            case 0:
                long longValue = ((Number) obj).longValue();
                cia cia = this.b;
                u16 u162 = cia.f;
                u162.invoke("run routine #" + longValue);
                return new mv9(1, new ss8(12, (Object) cia));
            default:
                cia cia2 = this.b;
                zwb d3 = zwb.d(cia2.c, (StatsReport[]) obj);
                ygd ygd = cia2.k;
                List<eod> list = d3.c;
                boolean g = ygd.g(list);
                p7 p7Var = cia2.p;
                p7 p7Var2 = cia2.o;
                yq7 yq7 = cia2.n;
                u16 u163 = cia2.f;
                if (g) {
                    u163.invoke("reset state");
                    cia2.b.reset();
                    cia2.l = 0.0d;
                    yq7.a = 0;
                    yq7.b = 0;
                    cia2.m = Double.NaN;
                    p7Var2.b = 0;
                    p7Var2.c = 0;
                    p7Var.b = 0;
                    p7Var.c = 0;
                }
                iw1 c = d3.c();
                boolean f = hhd.f(c != null ? c.i : null, "tcp");
                iw1 c2 = d3.c();
                double doubleValue = (c2 == null || (str = c2.h) == null || (F = n0e.F(str)) == null) ? 0.0d : F.doubleValue() / ((double) TimeUnit.SECONDS.toMillis(1));
                b0d O = gwf.O(list);
                List<Object> list2 = (List) O.b;
                boolean isEmpty = list2.isEmpty();
                List<Object> list3 = (List) O.o;
                List<Object> list4 = (List) O.X;
                List<Object> list5 = (List) O.c;
                if (!isEmpty || !list5.isEmpty() || !list4.isEmpty() || !list3.isEmpty()) {
                    ? obj2 = new Object();
                    ? obj3 = new Object();
                    u16 = u163;
                    mxf mxf = new mxf(obj2, obj3, 0);
                    z = f;
                    mxf mxf2 = new mxf(obj2, obj3, 1);
                    for (Object invoke : list2) {
                        mxf.invoke(invoke);
                    }
                    for (Object invoke2 : list5) {
                        mxf.invoke(invoke2);
                    }
                    for (Object invoke3 : list3) {
                        mxf2.invoke(invoke3);
                    }
                    for (Object invoke4 : list4) {
                        mxf2.invoke(invoke4);
                    }
                    long j = obj3.a;
                    if (j != 0) {
                        long j2 = obj2.a;
                        if (j2 != 0) {
                            d = yq7.a(j, j2);
                            cia2.l = d;
                        }
                    }
                    d = 0.0d;
                    cia2.l = 0.0d;
                } else {
                    z = f;
                    d = cia2.l;
                    u16 = u163;
                }
                cod cod = (cod) o23.X(gwf.y(list));
                Long valueOf = (cod == null || (bigInteger2 = cod.j) == null) ? null : Long.valueOf(bigInteger2.longValue());
                ArrayList arrayList = new ArrayList(list.size());
                for (eod eod : list) {
                    if (eod.b == 1 && eod.a == 1) {
                        arrayList.add((ynd) eod);
                    }
                }
                ynd ynd = (ynd) o23.X(arrayList);
                Long valueOf2 = (ynd == null || (bigInteger = ynd.j) == null) ? null : Long.valueOf(bigInteger.longValue());
                if (valueOf == null) {
                    d2 = cia2.m;
                } else if (valueOf2 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    d2 = p7Var.c(valueOf.longValue(), elapsedRealtime) + p7Var2.c(valueOf2.longValue(), elapsedRealtime);
                    cia2.m = d2;
                } else {
                    d2 = cia2.m;
                }
                double a2 = cia2.b.a(doubleValue, d, d2, z);
                u16.invoke("calc result: " + a2 + " for: rtt=" + doubleValue + ", loss=" + d + ", bitrate=" + d2 + " isTCP=" + z);
                return Double.valueOf(a2);
        }
    }
}
