package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;

/* renamed from: od0  reason: default package */
public final class od0 extends l5e implements i26 {
    public final /* synthetic */ pd0 X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ d0f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public od0(pd0 pd0, Context context, d0f d0f, Continuation continuation) {
        super(2, continuation);
        this.X = pd0;
        this.Y = context;
        this.Z = d0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new od0(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        pd0 pd0 = this.X;
        Context context = this.Y;
        d0f d0f = this.Z;
        try {
            InputStream open = context.getAssets().open(d0f.a);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return pd0.a(pd0, bArr, d0f);
        } catch (IOException e) {
            udd.q("BackgroundDataLoader", "load assets failed: " + e);
            return null;
        }
    }
}
