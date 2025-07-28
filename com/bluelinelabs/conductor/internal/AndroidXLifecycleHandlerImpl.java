package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "Lfc7;", "Lhc7;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidXLifecycleHandlerImpl extends a implements fc7, hc7 {
    public final gc7 p1 = new gc7(true);

    public AndroidXLifecycleHandlerImpl() {
        b1();
        Z0(true);
    }

    public final void A(String str, Intent intent, int i, Bundle bundle) {
        g1(i, str);
        e1(intent, i, bundle);
    }

    public final void B(int i, String str) {
        g1(i, str);
    }

    public final void C0() {
        this.W0 = true;
        c().e = false;
        Activity activity = c().b;
        if (activity != null) {
            x87.E(this, activity.isChangingConfigurations());
        }
    }

    public final void F(String str, String[] strArr, int i) {
        x87.f0(this, str, strArr, i);
    }

    public final boolean H0(MenuItem menuItem) {
        return x87.b0(this, menuItem, new ke(this, menuItem));
    }

    public final void I(Activity activity) {
        x87.e0(this, activity, this);
    }

    public final void J0(Menu menu) {
        for (f8 x : x87.R(this)) {
            x.x(menu);
        }
    }

    public final void K0(int i, String[] strArr, int[] iArr) {
        x87.c0(this, i, strArr, iArr);
    }

    public final void M0(Bundle bundle) {
        x87.d0(this, bundle);
    }

    public final List V() {
        return o23.s0(this.p1.j.values());
    }

    public final Activity a() {
        return this.p1.b;
    }

    public final gc7 c() {
        return this.p1;
    }

    public final void f(String str) {
        x87.h0(this, str);
    }

    public final void f1() {
        x87.a0(this);
    }

    public final void g1(int i, String str) {
        c().h.put(i, str);
    }

    public final void j(String str, String[] strArr, int i) {
        x87.f0(this, str, strArr, i);
    }

    public final void k(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        le leVar = new le(this, intentSender, i, intent, i2, i3, i4, bundle, 0);
        String str2 = str;
        int i5 = i;
        g1(i, str);
        leVar.invoke();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        x87.l0(this, activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        ic7.a.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        x87.m0(this, activity);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        if (c().b == activity && !activity.isChangingConfigurations()) {
            f1();
        }
    }

    public final void onActivityResumed(Activity activity) {
        x87.n0(this, activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        x87.o0(this, activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        x87.p0(this, activity);
    }

    public final void onActivityStopped(Activity activity) {
        x87.q0(this, activity);
    }

    public final void t0(int i, int i2, Intent intent) {
        super.t0(i, i2, intent);
        x87.X(this, i, i2, intent);
    }

    public final void v0(Context context) {
        super.v0(context);
        x87.Y(this, context);
    }

    public final f8 w(ViewGroup viewGroup, Bundle bundle) {
        return x87.Q(this, viewGroup, bundle, this);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        x87.Z(this, bundle);
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        for (f8 v : x87.R(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void z0() {
        this.W0 = true;
        x87.a0(this);
    }
}
