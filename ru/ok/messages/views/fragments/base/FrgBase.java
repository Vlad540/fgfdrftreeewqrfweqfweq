package ru.ok.messages.views.fragments.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.views.dialogs.ProgressDialog;

public abstract class FrgBase extends a implements the, q77 {
    public ProgressDialog A1;
    public ajb B1;
    public n83 C1;
    public ArrayList D1;
    public final grd E1 = hrd.a((Object) null);
    public final String p1 = getClass().getSimpleName();
    public zg4 q1;
    public boolean r1 = true;
    public boolean s1 = false;
    public v2b t1;
    public nqc u1;
    public wce v1;
    public final HashSet w1 = new HashSet();
    public g8 x1;
    public sna y1;
    public long z1 = 0;

    public void A0() {
        udd.n(this.p1, "lifecycle: onDestroyView");
        n83 n83 = this.C1;
        if (n83 != null) {
            n83.d();
        }
        this.W0 = true;
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        Iterator it = this.D1.iterator();
        while (it.hasNext()) {
            if (((q77) it.next()).B0(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void C0() {
        this.W0 = true;
        udd.n(this.p1, "lifecycle: onDetach");
    }

    public final void E0(boolean z) {
        udd.p(this.p1, "onHiddenChanged %b", new Object[]{Boolean.valueOf(z)});
        this.E1.m((Object) null, Boolean.valueOf(z));
    }

    public void I0() {
        this.W0 = true;
        udd.q(this.p1, "lifecycle: onPause");
        this.s1 = false;
        if (!TextUtils.isEmpty(g1())) {
            ((k93) this.t1.b).b().l(SystemClock.elapsedRealtime() - this.z1, g1());
        }
    }

    public final void K0(int i, String[] strArr, int[] iArr) {
        urd.A(e0(), strArr, iArr);
        if (l1()) {
            ajb ajb = this.B1;
            if (ajb != null) {
                ajb.c(new sna(i, strArr, iArr));
            }
            p1(i, strArr, iArr);
            return;
        }
        this.y1 = new sna(i, strArr, iArr);
    }

    public void L0() {
        this.W0 = true;
        String str = this.p1;
        udd.q(str, "lifecycle: onResume");
        StringBuilder sb = new StringBuilder("unhandled events: ");
        HashSet hashSet = this.w1;
        sb.append(hashSet.size());
        udd.q(str, sb.toString());
        this.s1 = true;
        this.z1 = SystemClock.elapsedRealtime();
        ((k93) this.t1.b).p().getClass();
        if (((nqc) oae.b()).d().d()) {
            zs7 r = ((k93) this.t1.b).r();
            int i = wx3.h;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                r.c((kh0) it.next());
            }
            hashSet.clear();
        }
        sna sna = this.y1;
        if (sna != null) {
            ajb ajb = this.B1;
            if (ajb != null) {
                ajb.c(sna);
            }
            sna sna2 = this.y1;
            p1(sna2.a, sna2.b, sna2.c);
            this.y1 = null;
        }
        g8 g8Var = this.x1;
        if (g8Var != null) {
            m1(g8Var.a, g8Var.b, g8Var.c);
            this.x1 = null;
        }
    }

    public void M0(Bundle bundle) {
        HashSet hashSet = this.w1;
        int i = wx3.h;
        udd.n("wx3", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    public final void N0() {
        this.W0 = true;
        udd.n(this.p1, "lifecycle: onStart");
    }

    public final void O0() {
        this.W0 = true;
        udd.n(this.p1, "lifecycle: onStop");
    }

    public final void Q0(Bundle bundle) {
        this.W0 = true;
    }

    public final void f1() {
        r5 h1 = h1();
        if (h1 != null) {
            h1.finish();
        }
    }

    public String g1() {
        return null;
    }

    public final r5 h1() {
        if (c0() == null || c0().isFinishing()) {
            return null;
        }
        return c0();
    }

    public final mif i1() {
        yle c0 = c0();
        if (!(c0 instanceof yle)) {
            return null;
        }
        yle yle = c0;
        if (yle.a() != null) {
            return yle.a();
        }
        return null;
    }

    public void j1() {
    }

    public final void k1() {
        ProgressDialog progressDialog = this.A1;
        ProgressDialog progressDialog2 = null;
        if (progressDialog != null) {
            try {
                progressDialog.g1(false, false);
            } catch (Exception e) {
                udd.s(this.p1, "Can't hideProgressDialog", e);
            }
            this.A1 = null;
            return;
        }
        c cVar = this.J0;
        if (cVar != null) {
            ProgressDialog E = cVar.E("ru.ok.messages.views.dialogs.ProgressDialog");
            if (E instanceof ProgressDialog) {
                progressDialog2 = E;
            }
            if (progressDialog2 != null && progressDialog2.H1) {
                progressDialog2.g1(false, false);
            }
        }
    }

    public boolean l1() {
        return this.s1;
    }

    public void m1(int i, int i2, Intent intent) {
    }

    public void n1(r5 r5Var) {
        this.r1 = false;
    }

    public boolean o1() {
        return false;
    }

    public void p1(int i, String[] strArr, int[] iArr) {
    }

    public final ProgressDialog q1(int i, boolean z) {
        if (!l1()) {
            return null;
        }
        k1();
        String i0 = i0(i);
        c cVar = this.J0;
        ProgressDialog progressDialog = new ProgressDialog();
        Bundle bundle = new Bundle();
        bundle.putString("ru.ok.tamtam.extra.TITLE", i0);
        bundle.putBoolean("ru.ok.tamtam.extra.CANCELABLE", z);
        bundle.putString("ru.ok.tamtam.extra.NEGATIVE_TEXT", (String) null);
        bundle.putBoolean("ru.ok.tamtam.extra.INDETERMINATE", true);
        progressDialog.Y0(bundle);
        progressDialog.l1(cVar, "ru.ok.messages.views.dialogs.ProgressDialog");
        this.A1 = progressDialog;
        return progressDialog;
    }

    public final ProgressDialog r1() {
        return q1(cic.I, true);
    }

    public final wce t() {
        return this.v1;
    }

    public final void t0(int i, int i2, Intent intent) {
        FrgBase.super.t0(i, i2, intent);
        if (l1()) {
            m1(i, i2, intent);
        } else {
            this.x1 = new g8(i, i2, intent);
        }
    }

    public final void u0(Activity activity) {
        this.W0 = true;
        udd.q(this.p1, "lifecycle: onAttach");
        if (activity instanceof r5) {
            this.r1 = true;
            n1((r5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgBase only in ActBase subclasses.");
    }

    public void w0(Bundle bundle) {
        r5 c0 = c0();
        v2b v2b = c0.O0;
        this.t1 = v2b;
        ((k93) v2b.b).getClass();
        this.u1 = nqc.a;
        this.v1 = c0.t();
        this.q1 = (zg4) this.t1.c;
        FrgBase.super.w0(bundle);
        udd.q(this.p1, "lifecycle: onCreate");
        if (!this.r1) {
            if (bundle != null) {
                wx3.z(bundle, this.w1);
            }
            ((k93) this.t1.b).r().d(this);
            this.D1 = new ArrayList();
            return;
        }
        throw new IllegalStateException("super.onAttachBase() not called");
    }

    public void z0() {
        udd.q(this.p1, "lifecycle: onDestroy");
        ((k93) this.t1.b).r().f(this);
        this.W0 = true;
        this.D1.clear();
    }
}
