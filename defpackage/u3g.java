package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u3g  reason: default package */
public final class u3g extends a {
    public final GoogleSignInOptions O0;

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, ox3] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, ox3] */
    public u3g(Context context, Looper looper, h2d h2d, GoogleSignInOptions googleSignInOptions, oa6 oa6, pa6 pa6) {
        super(context, looper, 91, h2d, oa6, pa6);
        ox3 ox3;
        if (googleSignInOptions != null) {
            ? obj = new Object();
            obj.d = new HashSet();
            obj.h = new HashMap();
            obj.d = new HashSet(googleSignInOptions.b);
            obj.a = googleSignInOptions.X;
            obj.b = googleSignInOptions.Y;
            obj.c = googleSignInOptions.o;
            obj.e = googleSignInOptions.Z;
            obj.f = googleSignInOptions.c;
            obj.g = googleSignInOptions.w0;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.x0);
            obj.i = googleSignInOptions.y0;
            ox3 = obj;
        } else {
            ? obj2 = new Object();
            obj2.d = new HashSet();
            obj2.h = new HashMap();
            ox3 = obj2;
        }
        byte[] bArr = new byte[16];
        s1g.a.nextBytes(bArr);
        ox3.i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = (Set) h2d.c;
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = (HashSet) ox3.d;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.O0 = ox3.b();
    }

    public final int g() {
        return 12451000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof p6g ? (p6g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 4);
    }

    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
