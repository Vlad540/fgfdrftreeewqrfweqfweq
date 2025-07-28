package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lt73;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<t73> getComponents() {
        Class<ld0> cls = ld0.class;
        Class<ju3> cls2 = ju3.class;
        g68 a = t73.a(new pjb(cls, cls2));
        Class<Executor> cls3 = Executor.class;
        a.a(new oe4(new pjb(cls, cls3), 1, 0));
        a.f = om3.c;
        t73 b = a.b();
        Class<tc7> cls4 = tc7.class;
        g68 a2 = t73.a(new pjb(cls4, cls2));
        a2.a(new oe4(new pjb(cls4, cls3), 1, 0));
        a2.f = qr4.o;
        t73 b2 = a2.b();
        Class<eo0> cls5 = eo0.class;
        g68 a3 = t73.a(new pjb(cls5, cls2));
        a3.a(new oe4(new pjb(cls5, cls3), 1, 0));
        a3.f = gf6.o;
        t73 b3 = a3.b();
        Class<zte> cls6 = zte.class;
        g68 a4 = t73.a(new pjb(cls6, cls2));
        a4.a(new oe4(new pjb(cls6, cls3), 1, 0));
        a4.f = lu7.b;
        return p23.B(b, b2, b3, a4.b());
    }
}
