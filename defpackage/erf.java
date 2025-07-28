package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import one.me.sdk.arch.Widget;

/* renamed from: erf  reason: default package */
public final /* synthetic */ class erf implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ erf(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final Object invoke(Object obj) {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Widget.viewBinding$lambda$7(widget, (View) obj));
            default:
                int i = e87.a;
                Context context = widget.getContext();
                lsf lsf = ((nsf) obj).a;
                int i2 = lsf.f(8).d - lsf.f(7).d;
                if (e87.c != i2) {
                    String name = e87.class.getName();
                    udd.q(name, "insets changed keyboard height=" + i2);
                    if (e87.b(i2)) {
                        String str = 1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape";
                        e87.b.d(i2, str);
                        SharedPreferences sharedPreferences = e87.d;
                        if (sharedPreferences == null) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
                        }
                        if (e87.d == null) {
                            e87.d = sharedPreferences;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putInt(str, i2);
                        edit.apply();
                    }
                    boolean b2 = e87.b(i2);
                    grd grd = e87.e;
                    if (b2) {
                        grd.m((Object) null, Boolean.TRUE);
                    } else if (e87.b(e87.c)) {
                        grd.m((Object) null, Boolean.FALSE);
                    }
                    e87.c = i2;
                }
                return jue.a;
        }
    }
}
