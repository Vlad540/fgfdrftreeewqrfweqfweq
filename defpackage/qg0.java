package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: qg0  reason: default package */
public abstract class qg0 implements i50 {
    public g50 b;
    public g50 c;
    public g50 d;
    public g50 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public qg0() {
        ByteBuffer byteBuffer = i50.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        g50 g50 = g50.e;
        this.d = g50;
        this.e = g50;
        this.b = g50;
        this.c = g50;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = i50.a;
        return byteBuffer;
    }

    public final void c() {
        this.h = true;
        h();
    }

    public boolean d() {
        return this.h && this.g == i50.a;
    }

    public final g50 e(g50 g50) {
        this.d = g50;
        this.e = f(g50);
        return isActive() ? this.e : g50.e;
    }

    public abstract g50 f(g50 g50);

    public final void flush() {
        this.g = i50.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public boolean isActive() {
        return this.e != g50.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f = i50.a;
        g50 g50 = g50.e;
        this.d = g50;
        this.e = g50;
        this.b = g50;
        this.c = g50;
        i();
    }
}
