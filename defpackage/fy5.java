package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;

/* renamed from: fy5  reason: default package */
public final class fy5 implements le6, zkc, cbf {
    public pc7 X = null;
    public ud Y = null;
    public final a a;
    public final bbf b;
    public final Runnable c;
    public zaf o;

    public fy5(a aVar, bbf bbf, oc4 oc4) {
        this.a = aVar;
        this.b = bbf;
        this.c = oc4;
    }

    public final pc7 R() {
        b();
        return this.X;
    }

    public final void a(nb7 nb7) {
        this.X.d(nb7);
    }

    public final void b() {
        if (this.X == null) {
            this.X = new pc7(this);
            ud udVar = new ud((zkc) this);
            this.Y = udVar;
            udVar.s();
            this.c.run();
        }
    }

    public final zaf n() {
        Application application;
        a aVar = this.a;
        zaf n = aVar.n();
        if (!n.equals(aVar.k1)) {
            this.o = n;
            return n;
        }
        if (this.o == null) {
            Context applicationContext = aVar.V0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.o = new alc(application, aVar, aVar.Z);
        }
        return this.o;
    }

    public final pb9 o() {
        Application application;
        a aVar = this.a;
        Context applicationContext = aVar.V0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        pb9 pb9 = new pb9(0);
        if (application != null) {
            pb9.a(yaf.d, application);
        }
        pb9.a(gp0.h, aVar);
        pb9.a(gp0.i, this);
        Bundle bundle = aVar.Z;
        if (bundle != null) {
            pb9.a(gp0.j, bundle);
        }
        return pb9;
    }

    public final bbf v() {
        b();
        return this.b;
    }

    public final mm y() {
        b();
        return (mm) this.Y.o;
    }
}
