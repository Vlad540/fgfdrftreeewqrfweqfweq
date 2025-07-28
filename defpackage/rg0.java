package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rg0  reason: default package */
public abstract class rg0 implements k50 {
    public h50 b;
    public h50 c;
    public h50 d;
    public h50 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public rg0() {
        ByteBuffer byteBuffer = k50.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        h50 h50 = h50.e;
        this.d = h50;
        this.e = h50;
        this.b = h50;
        this.c = h50;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = k50.a;
        return byteBuffer;
    }

    public final void c() {
        this.h = true;
        i();
    }

    public boolean d() {
        return this.h && this.g == k50.a;
    }

    public final h50 e(h50 h50) {
        this.d = h50;
        this.e = g(h50);
        return isActive() ? this.e : h50.e;
    }

    public final void flush() {
        this.g = k50.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    public abstract h50 g(h50 h50);

    public void h() {
    }

    public void i() {
    }

    public boolean isActive() {
        return this.e != h50.e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
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
        this.f = k50.a;
        h50 h50 = h50.e;
        this.d = h50;
        this.e = h50;
        this.b = h50;
        this.c = h50;
        j();
    }
}
