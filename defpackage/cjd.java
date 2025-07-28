package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cjd  reason: default package */
public final class cjd extends AtomicInteger implements xi4 {
    public final zhd a;
    public final j26 b;
    public final djd[] c;
    public Object[] o;

    public cjd(int i, j26 j26, zhd zhd) {
        super(i);
        this.a = zhd;
        this.b = j26;
        djd[] djdArr = new djd[i];
        for (int i2 = 0; i2 < i; i2++) {
            djdArr[i2] = new djd(this, i2);
        }
        this.c = djdArr;
        this.o = new Object[i];
    }

    public final void a(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            djd[] djdArr = this.c;
            int length = djdArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                djd djd = djdArr[i2];
                djd.getClass();
                bj4.a(djd);
            }
            while (true) {
                i++;
                if (i < length) {
                    djd djd2 = djdArr[i];
                    djd2.getClass();
                    bj4.a(djd2);
                } else {
                    this.o = null;
                    this.a.onError(th);
                    return;
                }
            }
        } else {
            xs7.F(th);
        }
    }

    public final void f() {
        if (getAndSet(0) > 0) {
            for (djd djd : this.c) {
                djd.getClass();
                bj4.a(djd);
            }
            this.o = null;
        }
    }

    public final boolean h() {
        return get() <= 0;
    }
}
