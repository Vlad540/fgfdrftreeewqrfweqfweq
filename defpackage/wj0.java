package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: wj0  reason: default package */
public final class wj0 implements yk {
    public static final Uri X = sl.a("batch.executeV2");
    public final String a;
    public final il[] b;
    public final int c;
    public final e3 o;

    public wj0(String str, il[] ilVarArr, int i) {
        this.a = str;
        this.b = ilVarArr;
        this.c = i;
        this.o = new e3((Object) ilVarArr);
    }

    public final h67 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        int i = this.c;
        int i2 = 1;
        if (1 <= i && i < 257) {
            return i;
        }
        for (il ilVar : this.b) {
            int priority = ilVar.b.getPriority();
            if (i2 < priority) {
                i2 = priority;
            }
        }
        return i2;
    }

    public final kl getScope() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        kl klVar = kl.a;
        if (length == 0) {
            return klVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScope();
        }
        for (il ilVar : ilVarArr) {
            kl scope = ilVar.b.getScope();
            if (klVar.compareTo(scope) < 0) {
                klVar = scope;
            }
            if (ilVar.b.getScopeAfter() != ll.a) {
                break;
            }
        }
        return klVar;
    }

    public final ll getScopeAfter() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        ll llVar = ll.a;
        if (length == 0) {
            return llVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            ll scopeAfter = ilVarArr[i].b.getScopeAfter();
            if (scopeAfter != llVar) {
                return scopeAfter;
            }
        }
        return llVar;
    }

    public final Uri getUri() {
        return X;
    }

    public final boolean shouldGzip() {
        for (il ilVar : this.b) {
            if (ilVar.b.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldPost() {
        return true;
    }

    public final void writeParams(t67 t67) {
        String str = this.a;
        if (str != null) {
            t67.g0(ApiProtocol.KEY_ID);
            t67.i(str);
        }
        t67.g0("methods");
        t67.u();
        for (il ilVar : this.b) {
            yk ykVar = ilVar.b;
            t67.s();
            t67.g0(ilVar.e);
            t67.s();
            if (ykVar.willWriteParams()) {
                t67.g0("params");
                t67.s();
                ykVar.writeParams(t67);
                t67.q();
            }
            if (ykVar.willWriteSupplyParams()) {
                t67.g0("supplyParams");
                t67.s();
                ykVar.writeSupplyParams(t67);
                t67.q();
            }
            if (ilVar.c) {
                t67.g0("onError");
                t67.i("SKIP");
            }
            String str2 = ilVar.d;
            if (str2 != null) {
                t67.g0("condition");
                t67.i(str2);
            }
            t67.q();
            t67.q();
        }
        t67.t();
    }
}
