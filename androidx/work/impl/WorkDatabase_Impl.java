package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile buf m;
    public volatile qe4 n;
    public volatile duf o;
    public volatile j8e p;
    public volatile otf q;
    public volatile stf r;
    public volatile b2b s;

    public final q07 e() {
        return new q07(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final d4e f(b04 b04) {
        return b04.c.c(new lga(b04.a, b04.b, new ope(b04, (rx) new e9a(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    public final List g() {
        return Arrays.asList(new x39[]{new y39(13, 14, 19), new d9a(2)});
    }

    public final Set i() {
        return new HashSet();
    }

    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(buf.class, Collections.emptyList());
        hashMap.put(qe4.class, Collections.emptyList());
        hashMap.put(duf.class, Collections.emptyList());
        hashMap.put(j8e.class, Collections.emptyList());
        hashMap.put(otf.class, Collections.emptyList());
        hashMap.put(stf.class, Collections.emptyList());
        hashMap.put(b2b.class, Collections.emptyList());
        hashMap.put(oyb.class, Collections.emptyList());
        return hashMap;
    }

    public final qe4 t() {
        qe4 qe4;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new qe4((aec) this);
                }
                qe4 = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qe4;
    }

    public final b2b u() {
        b2b b2b;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new b2b((WorkDatabase) this);
                }
                b2b = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2b;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [j8e, java.lang.Object] */
    public final j8e v() {
        j8e j8e;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new sh(this, 25);
                    obj.c = new tdc(this, 10);
                    obj.o = new tdc(this, 11);
                    this.p = obj;
                }
                j8e = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8e;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [otf, java.lang.Object] */
    public final otf w() {
        otf otf;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new sh(this, 29);
                    this.q = obj;
                }
                otf = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return otf;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [stf, java.lang.Object] */
    public final stf x() {
        stf stf;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new qtf(this, 0);
                    obj.c = new tdc(this, 29);
                    obj.o = new rtf(this, 0);
                    this.r = obj;
                }
                stf = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stf;
    }

    public final buf y() {
        buf buf;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new buf(this);
                }
                buf = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return buf;
    }

    public final duf z() {
        duf duf;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new duf((aec) this);
                }
                duf = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return duf;
    }
}
