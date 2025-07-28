package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.Serializable;

/* renamed from: k18  reason: default package */
public final class k18 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Cloneable f;
    public final Cloneable g;
    public Object h;

    /* JADX WARNING: type inference failed for: r1v2, types: [float[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Cloneable, float[]] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Cloneable, float[]] */
    public k18() {
        this.c = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        b();
    }

    public void a() {
        yr yrVar = ((wd8) this.h).X;
        l18 l18 = (l18) this.d;
        u18 u18 = l18.e;
        u18.getClass();
        if (yrVar.get(((v18) u18).a.getBinder()) != l18) {
            int i = wd8.A0;
            return;
        }
        int i2 = this.b & 1;
        Bundle bundle = (Bundle) this.f;
        if (i2 != 0) {
            int i3 = wd8.A0;
        }
        try {
            v18 v18 = (v18) l18.e;
            v18.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", (String) this.e);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", (Bundle) this.g);
            v18.a(3, bundle2);
        } catch (RemoteException unused) {
        }
    }

    public void b() {
        this.a = false;
        this.b = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.c)[i] = -1;
        }
    }

    public void c() {
        if (!this.a) {
            this.a = true;
            a();
            return;
        }
        throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.c);
    }

    public void d() {
        uc4 uc4;
        if (this.a) {
            this.a = false;
            j1c j1c = (j1c) this.h;
            if (j1c != null && (uc4 = (uc4) j1c.c) != null && !uc4.d) {
                uc4.j.set(uc4.k);
            }
        }
    }

    public k18(wd8 wd8, Object obj, l18 l18, String str, Bundle bundle) {
        this.h = wd8;
        this.d = l18;
        this.e = str;
        this.f = bundle;
        this.g = null;
        this.c = obj;
    }
}
