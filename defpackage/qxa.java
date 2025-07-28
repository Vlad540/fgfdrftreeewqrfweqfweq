package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: qxa  reason: default package */
public final class qxa extends Fragment implements fc7, hc7 {
    public final gc7 a = new gc7(false);

    public qxa() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    public final void A(String str, Intent intent, int i, Bundle bundle) {
        g(i, str);
        startActivityForResult(intent, i, bundle);
    }

    public final void B(int i, String str) {
        g(i, str);
    }

    public final void F(String str, String[] strArr, int i) {
        x87.f0(this, str, strArr, i);
    }

    public final void I(Activity activity) {
        x87.e0(this, activity, this);
    }

    public final List V() {
        return o23.s0(this.a.j.values());
    }

    public final Activity a() {
        return this.a.b;
    }

    public final gc7 c() {
        return this.a;
    }

    public final void e() {
        x87.a0(this);
    }

    public final void f(String str) {
        x87.h0(this, str);
    }

    public final void g(int i, String str) {
        c().h.put(i, str);
    }

    public final void j(String str, String[] strArr, int i) {
        x87.f0(this, str, strArr, i);
    }

    public final void k(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        le leVar = new le(this, intentSender, i, intent, i2, i3, i4, bundle, 1);
        String str2 = str;
        int i5 = i;
        g(i, str);
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
            e();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        x87.X(this, i, i2, intent);
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

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        x87.Y(this, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x87.Z(this, bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        for (f8 v : x87.R(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        x87.a0(this);
    }

    public final void onDetach() {
        super.onDetach();
        c().e = false;
        Activity activity = c().b;
        if (activity != null) {
            x87.E(this, activity.isChangingConfigurations());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return x87.b0(this, menuItem, new pxa(this, 0, menuItem));
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        for (f8 x : x87.R(this)) {
            x.x(menu);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        x87.c0(this, i, strArr, iArr);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x87.d0(this, bundle);
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        Boolean bool;
        pxa pxa = new pxa(this, 1, str);
        for (f8 f8Var : x87.R(this)) {
            Iterator it = f8Var.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    bool = null;
                    continue;
                    break;
                }
                vgc vgc = (vgc) u1Var.next();
                if (vgc.a.didRequestPermission(str)) {
                    bool = Boolean.valueOf(vgc.a.shouldShowRequestPermissionRationale(str));
                    continue;
                    break;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return ((Boolean) pxa.invoke()).booleanValue();
    }

    public final f8 w(ViewGroup viewGroup, Bundle bundle) {
        return x87.Q(this, viewGroup, bundle, this);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        x87.Y(this, context);
    }
}
