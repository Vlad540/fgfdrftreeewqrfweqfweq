package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;

/* renamed from: es7  reason: default package */
public final class es7 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int i;
        String k0 = h0e.k0(h0e.k0(str, ">>>>> Dispatching to "), "<<<<< Finished to ");
        int f0 = h0e.f0(": ", k0, 6);
        int a0 = h0e.a0(k0, "} ", 0, false, 6);
        String substring = k0.substring(0, a0 + 1);
        if (f0 <= 0 && a0 <= 0) {
            return k0;
        }
        int a02 = h0e.a0(k0, "DispatchedContinuation[Dispatchers.Main", 0, false, 6);
        if (a02 >= 0) {
            int i2 = a02 + 39;
            int a03 = h0e.a0(k0, ".immediate", i2, false, 4);
            i = a03 >= 0 ? h0e.a0(k0, ", Continuation at ", a03 + 10, false, 4) : h0e.a0(k0, ", Continuation at ", i2, false, 4);
            if (i >= 0) {
                i += 18;
            }
        } else {
            i = a0 + 2;
        }
        int e0 = h0e.e0(k0, ']', 0, 6);
        Integer valueOf = Integer.valueOf(e0);
        Integer num = null;
        if (e0 <= i) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : k0.length();
        int e02 = h0e.e0(k0, '@', 0, 6);
        Integer valueOf2 = Integer.valueOf(e02);
        if (e02 > i) {
            num = valueOf2;
        }
        String substring2 = k0.substring(i, Math.min(num != null ? num.intValue() : k0.length(), intValue));
        return !substring2.equals("null") ? substring2 : me4.i(substring, " ", k0.substring(f0 + 2));
    }

    public final void println(String str) {
        if (str == null) {
            return;
        }
        if (p0e.Q(str, ">>>>> Dispatching to ", false)) {
            String a2 = a(str);
            if (Trace.isEnabled()) {
                Trace.beginSection(a2);
            }
            this.a = SystemClock.uptimeMillis();
            this.c++;
        } else if (p0e.Q(str, "<<<<< Finished to ", false)) {
            if (Trace.isEnabled()) {
                Trace.endSection();
            }
            this.c--;
            this.b = System.currentTimeMillis();
            this.d.add(new ds7(a(str), this.a, this.b, this.c));
            this.a = 0;
            this.b = 0;
        }
    }
}
