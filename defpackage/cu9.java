package defpackage;

import java.util.Objects;

/* renamed from: cu9  reason: default package */
public final class cu9 extends tj0 {
    public volatile boolean X;
    public final bw9 a;
    public final Object[] b;
    public int c;
    public boolean o;

    public cu9(bw9 bw9, Object[] objArr) {
        this.a = bw9;
        this.b = objArr;
    }

    public final void clear() {
        this.c = this.b.length;
    }

    public final void f() {
        this.X = true;
    }

    public final boolean h() {
        return this.X;
    }

    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }

    public final int q(int i) {
        this.o = true;
        return 1;
    }
}
