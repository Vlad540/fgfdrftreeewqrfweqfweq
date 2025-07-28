package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;

/* renamed from: g83  reason: default package */
public class g83 extends Dialog implements nc7, fx9, zkc {
    public pc7 a;
    public final ud b = new ud((zkc) this);
    public final ex9 c = new ex9(new ds1(13, this));

    public g83(Context context, int i) {
        super(context, i);
    }

    public static void a(g83 g83) {
        super.onBackPressed();
    }

    public final pc7 R() {
        return b();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addContentView(view, layoutParams);
    }

    public final pc7 b() {
        pc7 pc7 = this.a;
        if (pc7 != null) {
            return pc7;
        }
        pc7 pc72 = new pc7(this);
        this.a = pc72;
        return pc72;
    }

    public final void c() {
        xie.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hrb.view_tree_on_back_pressed_dispatcher_owner, this);
        ete.X(getWindow().getDecorView(), this);
    }

    public final void onBackPressed() {
        this.c.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher k = getOnBackInvokedDispatcher();
            ex9 ex9 = this.c;
            ex9.e = k;
            ex9.e(ex9.g);
        }
        this.b.t(bundle);
        b().d(nb7.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.b.u(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        b().d(nb7.ON_RESUME);
    }

    public void onStop() {
        b().d(nb7.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    public final mm y() {
        return (mm) this.b.o;
    }

    public void setContentView(View view) {
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.setContentView(view, layoutParams);
    }
}
