package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: alc  reason: default package */
public final class alc implements zaf {
    public final Application a;
    public final yaf b;
    public final Bundle c;
    public final pc7 d;
    public final mm e;

    public alc(Application application, zkc zkc, Bundle bundle) {
        yaf yaf;
        this.e = zkc.y();
        this.d = zkc.R();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (yaf.c == null) {
                yaf.c = new yaf(application);
            }
            yaf = yaf.c;
        } else {
            yaf = new yaf((Application) null);
        }
        this.b = yaf;
    }

    public final uaf a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final uaf b(Class cls, pb9 pb9) {
        dr9 dr9 = dr9.X;
        LinkedHashMap linkedHashMap = pb9.a;
        String str = (String) linkedHashMap.get(dr9);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(gp0.h) != null && linkedHashMap.get(gp0.i) != null) {
            Application application = (Application) linkedHashMap.get(yaf.d);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Constructor a2 = (!isAssignableFrom || application == null) ? blc.a(cls, blc.b) : blc.a(cls, blc.a);
            return a2 == null ? this.b.b(cls, pb9) : (!isAssignableFrom || application == null) ? blc.b(cls, a2, gp0.g(pb9)) : blc.b(cls, a2, application, gp0.g(pb9));
        } else if (this.d != null) {
            return d(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [abf, java.lang.Object] */
    public final uaf d(Class cls, String str) {
        pc7 pc7 = this.d;
        if (pc7 != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Application application = this.a;
            Constructor a2 = (!isAssignableFrom || application == null) ? blc.a(cls, blc.b) : blc.a(cls, blc.a);
            if (a2 != null) {
                mm mmVar = this.e;
                Bundle c2 = mmVar.c(str);
                Class[] clsArr = tkc.f;
                tkc o = kjd.o(c2, this.c);
                ukc ukc = new ukc(str, o);
                ukc.a(mmVar, pc7);
                ob7 ob7 = pc7.d;
                if (ob7 == ob7.b || ob7.a(ob7.o)) {
                    mmVar.g();
                } else {
                    pc7.a(new z84(pc7, 3, mmVar));
                }
                uaf b2 = (!isAssignableFrom || application == null) ? blc.b(cls, a2, o) : blc.b(cls, a2, application, o);
                b2.a("androidx.lifecycle.savedstate.vm.tag", ukc);
                return b2;
            } else if (application != null) {
                return this.b.a(cls);
            } else {
                if (abf.a == null) {
                    abf.a = new Object();
                }
                return abf.a.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
