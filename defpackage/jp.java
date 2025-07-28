package defpackage;

import android.content.SharedPreferences;

/* renamed from: jp  reason: default package */
public final /* synthetic */ class jp implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ kp a;
    public final /* synthetic */ hy5 b;

    public /* synthetic */ jp(kp kpVar, hy5 hy5) {
        this.a = kpVar;
        this.b = hy5;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        kp kpVar = this.a;
        kpVar.getClass();
        if (str != null && str.equals("app.messages.calls.menu.item")) {
            ((ls7) this.b.b).X.m((Object) null, Boolean.valueOf(kpVar.c("app.messages.calls.menu.item", true)));
        }
    }
}
