package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ou  reason: default package */
public final class ou implements mc9 {
    public final /* synthetic */ grd a = hrd.a(Collections.singletonList(new Object()));
    public final /* synthetic */ fw b;

    public ou(fw fwVar) {
        this.b = fwVar;
    }

    public final Object a(Object obj, Continuation continuation) {
        this.a.setValue((List) obj);
        return jue.a;
    }

    public final boolean b(Object obj, Object obj2) {
        grd grd = this.a;
        grd.getClass();
        return grd.m((List) obj, (List) obj2);
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        this.a.c(rj5, continuation);
        return pu3.a;
    }

    /* renamed from: e */
    public final List getValue() {
        return (List) this.a.getValue();
    }

    public final void f() {
        this.a.f();
        throw null;
    }

    public final boolean g(Object obj) {
        this.a.setValue((List) obj);
        return true;
    }

    public final zqd i() {
        return this.a.i();
    }

    public final void setValue(Object obj) {
        this.a.m((Object) null, (List) obj);
    }
}
