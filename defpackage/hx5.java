package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;

/* renamed from: hx5  reason: default package */
public final class hx5 extends ek8 implements ix9, wx9, nx9, ox9, cbf, fx9, m8, zkc, xx5, rl8 {
    public final Activity A0;
    public final Context B0;
    public final Handler C0;
    public final vx5 D0 = new c();
    public final /* synthetic */ b E0;

    /* JADX WARNING: type inference failed for: r2v1, types: [vx5, androidx.fragment.app.c] */
    public hx5(b bVar) {
        this.E0 = bVar;
        Handler handler = new Handler();
        this.A0 = bVar;
        this.B0 = bVar;
        this.C0 = handler;
    }

    public final View O(int i) {
        return this.E0.findViewById(i);
    }

    public final boolean P() {
        Window window = this.E0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final pc7 R() {
        return this.E0.J0;
    }

    public final void a(a aVar) {
        this.E0.getClass();
    }

    public final void q0(mx5 mx5) {
        this.E0.s(mx5);
    }

    public final void r0(rf3 rf3) {
        this.E0.w(rf3);
    }

    public final void s0(lx5 lx5) {
        this.E0.A(lx5);
    }

    public final void t0(lx5 lx5) {
        this.E0.B(lx5);
    }

    public final void u0(lx5 lx5) {
        this.E0.C(lx5);
    }

    public final bbf v() {
        return this.E0.v();
    }

    public final void v0(mx5 mx5) {
        this.E0.J(mx5);
    }

    public final void w0(lx5 lx5) {
        this.E0.K(lx5);
    }

    public final void x0(lx5 lx5) {
        this.E0.L(lx5);
    }

    public final mm y() {
        return (mm) this.E0.o.o;
    }

    public final void y0(lx5 lx5) {
        this.E0.M(lx5);
    }

    public final void z0(lx5 lx5) {
        this.E0.O(lx5);
    }
}
