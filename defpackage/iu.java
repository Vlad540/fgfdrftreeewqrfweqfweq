package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: iu  reason: default package */
public final class iu implements rl6 {
    public final /* synthetic */ int a;
    public volatile long b;
    public Object c;
    public volatile Object o;

    public iu(mod mod) {
        this.a = 1;
        this.c = mod;
        this.b = Long.MIN_VALUE;
    }

    public synchronized void a() {
        c();
        tic.b((xi4) this.o);
        this.o = null;
    }

    public synchronized void b() {
        j6 j6Var = (j6) this.c;
        if (j6Var != null) {
            j6Var.run();
            this.c = null;
        }
    }

    public synchronized void c() {
        this.b = -1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "LoadOperation{operationTime=" + this.b + ", disposable=" + ((xi4) this.o) + ", onComplete=" + ((j6) this.c) + '}';
            default:
                return super.toString();
        }
    }

    public Uri u(String str) {
        long j;
        Uri u = ((rl6) this.c).u(str);
        if (!str.equals("api")) {
            return u;
        }
        Uri uri = sl.a;
        String uri2 = u.toString();
        String uri3 = uri.toString();
        if (!uri2.equals(uri3)) {
            int V = h0e.T(uri2, '/') ? h0e.V(uri2) : uri2.length();
            if (V != (h0e.T(uri3, '/') ? h0e.V(uri3) : uri3.length()) || !p0e.N(0, 0, V, uri2, uri3, false)) {
                return u;
            }
        }
        if (SystemClock.elapsedRealtime() > this.b) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.b) {
                        j = Long.MAX_VALUE;
                        og0 i = gk9.i();
                        String str2 = (String) i.c;
                        if (h0e.s0(str2, '\"') && h0e.T(str2, '\"')) {
                            str2 = str2.substring(1, h0e.V(str2));
                        }
                        if (h0e.R(str2, "\"\"", false)) {
                            str2 = p0e.P(str2, "\"\"", "");
                        }
                        String obj = h0e.B0(str2).toString();
                        if (h0e.S(obj, ' ')) {
                            obj = obj.substring(h0e.e0(obj, ' ', 0, 6) + 1);
                        }
                        if (h0e.T(obj, '/')) {
                            obj = obj.substring(0, h0e.V(obj));
                        }
                        Uri parse = Uri.parse(obj);
                        this.o = parse;
                        int t = hr1.t(2);
                        if (t != 0) {
                            if (t == 1) {
                                j = SystemClock.elapsedRealtime() + ((long) (i.b * 1000));
                            } else if (t == 2) {
                                j = Long.MIN_VALUE;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.b = j;
                        return parse;
                    }
                } catch (Exception e) {
                    int t2 = hr1.t(3);
                    if (t2 != 0) {
                        if (t2 == 1) {
                            j = Long.MIN_VALUE;
                        } else if (t2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.b = j;
                        Uri uri4 = (Uri) this.o;
                        if (uri4 != null) {
                            u = uri4;
                        }
                        return u;
                    }
                    throw e;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri5 = (Uri) this.o;
        return uri5 == null ? u : uri5;
    }

    public iu() {
        this.a = 0;
        this.b = -1;
        this.o = null;
        this.c = null;
    }
}
